
public class Main {

	public static void main(String[] args) {
		int count =30;
		calcDozen(count);
		calcDozen(100);
		count=200;
		calcDozen(count);
	}
	
	/**
	 * Print out the number of dozens and remainder
	 * @param count
	 */
	public static void calcDozen(int count) {
		int dozen;
		int remainder;
		
		dozen = count/12;
		remainder = count%12;
		
		System.out.println(count +" is "+ dozen 
				+" dozen and "+remainder + " left over");
	}

}
