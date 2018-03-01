package za.co.demo;

import java.util.Scanner;

import za.co.myapp.Dog;

public class Demo4b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dog d = new Dog("Fluffy", 3);
		
		print(d.getName().equals("Fluffy") ? "Fluffy" : "Not fluffy");
		
		if (d.getName().equals("Fluffy")) {
			print("Fluffy");
		}else {
			print ("Not Fluffy");
		}
	
		
		
		if (d.getBreed()!=null  && d.getBreed().equals("sheep dog")) {
				print("SHeep Dog");
			} else {
				print("Not a sheep dog");
			}

		System.out.println("Enter a number between 1 and 5");
		int num = scan.nextInt();
		if ((num > 5 && num % 2 == 0) || num == 7) {
			//
		}

		switch (num) {
		case 1:
			print("one");
			break;
		case 2:
			print("two");
			break;
		case 3:
			print("three");
			break;
		case 4:
			print("four");
			break;
		case 5:
			print("five");
			break;
		default:
			print("Invalid value");
		}
		scan.close();
	}

	private static void print(String string) {
		System.out.println(string);

	}

}
