package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {

	private String owner;
	public IDCard(String owner) {
		// TODO Auto-generated constructor stub
		System.out.println("制作"+owner+"的ID卡片");
		this.owner = owner;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("使用"+owner+"的ID卡片");

	}
	
	public String getOwner() {
		return owner;
	}

}
