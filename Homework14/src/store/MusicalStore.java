package store;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import instrument.IInstrumentKind;
import instrument.InstrumentKindException;
import supplier.ISupplier;

public class MusicalStore implements IMusicalStore {
	private static final int RESTOCK_NUM = 30;
	private static final int BASE_MONETARY_FUND = 1_000;
	private double monetaryFund;
	private ConcurrentMap<String, IInstrumentKind> dataBase;
	private ISupplier prefferedSupplier;

	public MusicalStore(ISupplier prefferedSupplier) throws MusicalStoreException {
		if (prefferedSupplier != null) {
			this.prefferedSupplier = prefferedSupplier;
			this.monetaryFund = BASE_MONETARY_FUND;
			dataBase = new ConcurrentHashMap<String, IInstrumentKind>();
		} else {
			throw new MusicalStoreException("Supplier in constructor: " + prefferedSupplier);
		}
	}

	public void loadInstumentKind(IInstrumentKind kind, int quantity, ISupplier supplier) throws MusicalStoreException {
		if (kind != null && quantity > 0 && supplier != null) {
			try {
				Thread.sleep(supplier.getSupplyTime());
				IInstrumentKind toLoad = dataBase.putIfAbsent(kind.getName(), kind);
				;
				synchronized (toLoad) {
					toLoad.increaseAmmount(quantity);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else

		{
			throw new MusicalStoreException("Invalid loading parameters /n" + "You tried: kind, quantity, supplier: "
					+ kind + ", " + quantity + ", " + supplier);
		}

	}

	public void reStock(ISupplier supplier) throws MusicalStoreException {
		if (supplier != null) {
			try {
				dataBase.forEach((name, kind) -> {
					try {
						Thread.sleep(supplier.getSupplyTime());
						synchronized (kind) {
							kind.increaseAmmount(RESTOCK_NUM);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else

		{
			throw new MusicalStoreException("Invalid stocking parameters /n" + "You tried: supplier: " + supplier);
		}

	}

	@Override
	public void sellInstrument(String InstrumentName, int quantity) throws MusicalStoreException {
		if (InstrumentName != null && !InstrumentName.equals("")) {
			if (dataBase.containsKey(InstrumentName)) {
				IInstrumentKind toSell = dataBase.get(InstrumentName);
				synchronized (toSell) {
					if (toSell.getAmmount() >= quantity) {
						System.out.println("Congratulations! You just bought " + quantity + " number from " + toSell);
						try {
							toSell.reduceAmmount(quantity);
						} catch (InstrumentKindException e) {
							e.printStackTrace();
						}
						this.monetaryFund += toSell.getPrice() * quantity;
						return;
					}
					System.out.println("Sorry, our quantity is low, we have: " + toSell + " you want: " + quantity);

				}
			} else {
				int waitTime = prefferedSupplier.getSupplyTime();
				System.out.println("Sorry, no such instrument, try after " + waitTime + " time.");
			}
		} else {
			throw new MusicalStoreException("Invalid selling parameters");
		}
	}

}
