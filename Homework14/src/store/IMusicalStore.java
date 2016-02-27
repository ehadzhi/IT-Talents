package store;	

public interface IMusicalStore {
	
	void sellInstrument(String InstrumentName,int quantity) throws MusicalStoreException;
}
