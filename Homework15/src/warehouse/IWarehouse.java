package warehouse;

public interface IWarehouse {
	
	void loadStore();
	
	int takeProduct(String name);
	
	boolean needsToBeLoaded();
}
