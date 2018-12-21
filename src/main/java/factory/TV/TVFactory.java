package factory.TV;

import java.util.*;
import factory.framework.Factory;
import factory.framework.Product;

public class TVFactory extends Factory {

	private HashMap tvs = new HashMap();
	private String size = "75寸";
	@Override
	protected void registerProduct(Product p) {
		// TODO Auto-generated method stub
		TV tv = (TV)p;
		tvs.put(tv.getBrand(), tv.getSize());
	}

	@Override
	protected Product createProduct(String brand) {
		// TODO Auto-generated method stub
		return new TV(brand, size);
	}

	public void setSize(String size) {
		this.size = size;
	}
}
