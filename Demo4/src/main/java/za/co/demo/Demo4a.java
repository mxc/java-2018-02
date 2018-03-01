package za.co.demo;

import java.util.Scanner;

public class Demo4a {

	public static void main(String[] args) {
		System.out.println("Please enter your first name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		if (name.length() > 5 && name.length() < 10) {
				System.out.println("You rock!");
				System.out.println("The End!!!");
		} else if(name.equalsIgnoreCase("abc") ||
				  name.equalsIgnoreCase("xyz")){
			 System.out.println("You have accssed the secret area");
		} else {
			System.out.println("Later looser!");
		}
		System.out.println("the end!");
	}

}
