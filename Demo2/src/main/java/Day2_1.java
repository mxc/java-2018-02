
public class Day2_1 {

	public static void main(String[] args) {
//				add(2,3);
//				add(4,6);
//				add(2,-4);
//				add(2,3);
//				byte a1 = 100;
//				int b1=200;
//				add(a1,b1);
//				bonus(1000);
//				bonus(500.50);
				int newAge = age(20,5);
				System.out.println(newAge);
				System.out.println(age(newAge,-3));
	}

	public static void add(int a,int b) {
		int ans = a+b;
		System.out.println(ans);
	}
	
	public static void bonus(double salary) {
		System.out.println("your bonus is "+ salary*0.10);
	}
	
	public static int age(int  currentAge,int years) {
		return currentAge+years;
	}
	
}
