package za.co.demo;

import java.time.LocalDate;
import za.co.myapp.Dog;

public class Demo4 {

	public static void main(String[] args) {
		LocalDate date =LocalDate.now();
		System.out.println("The year is "+ date.getYear());
		date.plusWeeks(2);
		System.out.println("The date  2 weeks from now is"+ date);
		System.out.println("The date  2 weeks from now is"+ date.plusWeeks(2));
		String str = "Hello World!";
		System.out.println(str.substring(0,5));
		Dog d = new Dog("Einstein",13);
	}

}
