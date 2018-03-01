
public class Demo4c {
	
	public static int counter = 0;
	
	public static void main(String[]args) {
		System.out.println(increment());
		System.out.println(increment());
		System.out.println(increment());
	}
	
	public static int increment() {
		return ++counter;
	}
	
	

}
