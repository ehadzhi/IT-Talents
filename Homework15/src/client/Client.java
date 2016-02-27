package client;

import store.IStore;
import store.StoreException;

public class Client implements IClient {

	private static final int SLEEP_TIME = 1_000;
	private static final String[] purchases = { "Banana", "Beef", "Chicken", "Orange", "Apple", "Potato", "Eggplant",
			"Cucumber", "Pork" };
	private IStore prefferedStore;

	public Client(IStore prefferedStore) throws ClientException {
		if (prefferedStore != null) {
			this.prefferedStore = prefferedStore;
		} else {
			throw new ClientException("Preffered store was a null reffrence");
		}
	}

	@Override
	public void buy(int quantity) {
		int toGet = (int) (Math.random() * ((double) purchases.length));
		System.out.println("Client tries to buy " + quantity 
				+ " of " + purchases[toGet] + " from " + prefferedStore);
		if (quantity > 0) {
			try {
				Thread.sleep(Client.SLEEP_TIME);
				prefferedStore.sellInstrument(purchases[toGet], quantity);
			} catch (StoreException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public String toString() {
		return "Client";
	}

}
