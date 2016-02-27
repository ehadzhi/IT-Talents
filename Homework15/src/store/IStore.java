package store;

import warehouse.IWarehouse;

public interface IStore {
	
	void sellInstrument(String InstrumentName,int quantity) throws StoreException;
	
	void loadProducts(IWarehouse supplier) throws StoreException;
}
