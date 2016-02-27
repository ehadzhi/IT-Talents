package demo;

import java.util.ArrayList;
import java.util.List;

import client.Client;
import client.ClientException;
import client.IClient;
import product.ProductKindException;
import store.IStore;
import store.Store;
import store.StoreException;
import warehouse.IWarehouse;
import warehouse.Warehouse;

public class Demo {

	private static final int NUM_CLIENTS = 9;
	private static final int NUM_STORES = 3;

	public static void main(String[] args) throws ProductKindException, StoreException {
		IWarehouse warehouse = new Warehouse();

		List<IStore> stores = new ArrayList<IStore>(NUM_STORES);
		for (int store = 0; store < NUM_STORES; store++) {
			stores.add(new Store(warehouse));
		}

		List<IClient> clients = new ArrayList<IClient>(NUM_CLIENTS);
		for (int client = 0; client < NUM_CLIENTS; client++) {
			try {
				clients.add(new Client(stores.get(client % NUM_STORES)));
			} catch (ClientException e) {
				e.printStackTrace();
			}
		}
		for (;;)
			clients.forEach(client -> client.buy(4));
	}
}
