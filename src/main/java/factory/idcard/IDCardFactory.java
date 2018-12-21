package factory.idcard;

import java.util.ArrayList;
import java.util.List;

import factory.framework.Factory;
import factory.framework.Product;

public class IDCardFactory extends Factory {

	private List owners = new ArrayList();
	
	@Override
	protected void registerProduct(Product p) {
		// TODO Auto-generated method stub
		owners.add(((IDCard)p).getOwner());
	}

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

}
