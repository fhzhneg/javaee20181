package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	int money;
	ArrayList fruits;
	
	public int getMoney() {
		return money;
	}
	
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	List getFruits() {
		return (List)fruits.clone();
	}
}
