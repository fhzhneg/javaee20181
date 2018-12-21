package factory.TV;

import factory.framework.Product;

public class TV extends Product {

	private String brand;
	private String size;
	
	TV(String brand,String size) {
		// TODO Auto-generated constructor stub
		System.out.print("生产一台"+brand+"的电视机");
		System.out.println(",屏幕大小是："+size);
		this.size = size;
		this.brand = brand;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("打开"+brand+"电视机来看电视节目");

	}

	public String getBrand() {
		return brand;
	}
	
	public String getSize() {
		return size;
	}
}
