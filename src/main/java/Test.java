public class Test {

	public static void main(String[] args) {

		display();
		split();
		display();
		display();
		display();
		display();
		display();
		display();
	}

	public static void display() {

		String name = getName("丰华世界");
		System.out.println(name + ",你好，世界欢迎您加入程序员的队伍中来....");
	}
	
	public static String getName(String name){
		
		return name;
	}
	
	public static void split(){
		
		System.out.println("================================================");
	}

}
