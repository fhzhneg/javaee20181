package observer;

import java.util.Random;

/**
 * 具体对象，产生数字
 * 产生递增数
 * @author fhzheng
 *
 */
public class IncrementalNumberGenerator extends NumberGenerator {

//	private int[]  incrementalNumber = {10,15,20,25,30,35,40,45};
//	private int number;
	
	private int number;
	private int end;
	private int inc;
	
	public IncrementalNumberGenerator(int start,int end,int inc) {
		this.number = start;
		this.end = end;
		this.inc = inc;
	}
	
	@Override
	public int getNumber() {

		return number;
	}

	@Override
	public void execute() {

//		for (int i : incrementalNumber) {
//			number = i;
//			notifyObserver();
//		}
		
		while (number < end) {
			notifyObserver();
			number +=inc;
		}
	}

}
