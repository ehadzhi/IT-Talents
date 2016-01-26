package helpers;

import java.util.Arrays;
import java.util.Iterator;

public class Order {
	private static final double MAX_PRICE = 15.0;
	private static final double MIN_PRICE = 5.0;
	private static final int MIN_NUM_PRODUCTS = 1;
	private static final int MAX_NUM_PRODUCTS = 10;
	private double[] order;

	public Order() {
		int numPoducts = (int) ((Math.random() * (MAX_NUM_PRODUCTS - MIN_NUM_PRODUCTS)) + MIN_NUM_PRODUCTS);

		order = new double[numPoducts];

		for (int index = 0; index < order.length; index++) {
			order[index] = roundPrice(Math.random() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE);
		}
	}

	public double getPrice() {
		double toReturn = 0;
		for (double product : order) {
			toReturn += product;
		}
		return toReturn;
	}
	
	@Override
	public String toString() {
		Arrays.sort(order);
		return Arrays.toString(order);
	}
	
	private static double roundPrice(double price){
		return ((double)((int)(price*100)))/100;
	}
}
