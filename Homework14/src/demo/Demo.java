package demo;

import java.util.concurrent.atomic.AtomicBoolean;

import store.IMusicalStore;
import store.MusicalStore;
import supplier.ISupplier;
import supplier.Supplier;

public class Demo {

	public static void main(String[] args) {
		AtomicBoolean shouldSupplierSuplly = new AtomicBoolean(true);
		ISupplier supplier;
		try {
			supplier = new Supplier(shouldSupplierSuplly);
			IMusicalStore store = new MusicalStore(supplier);
			// 
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
