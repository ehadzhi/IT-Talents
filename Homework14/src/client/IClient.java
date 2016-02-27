package client;

import store.IMusicalStore;

public interface IClient {

	void buyInstrument(IMusicalStore toBuyFrom, String InstrumentName);
}