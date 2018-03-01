
public class MyApp {

	/**
	 * The main method to our application. Simply prints  Howzit World
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Howzit World from Eclipse");
		
		int a;
		a = Integer.MAX_VALUE;
		System.out.println(a);
		int b = 1;
		long ans = (long)a+b;
		System.out.println(ans);
		
		byte c = 120;
		byte d = 100;
		byte e =(byte)(c+d);
		System.out.println(e);
		System.out.println(c+d);
		
		int f = 3;
		int g =2;
		
		int h = f/g;
		int r = f%g;
		System.out.println("The result is "+h);
		System.out.println("the remainder is "+r);

		
		float i = 1.0f;
		double j = 1.5;
		double k = Integer.MAX_VALUE;
		double l = k+i;

		System.out.println(i);
		System.out.println(j);
		System.out.println(l);
		
		
		double m = 0.1;
		double n = 0.7;
		
		System.out.println(m+n);

		double o = 0.9;
		System.out.println(o-m);

		if (a-b==Integer.MAX_VALUE-1) {
			
		}
		if ((m+n)-0.8<0.00001) {
			
		}
		
		//System.out.println(1/0);
	}

}
