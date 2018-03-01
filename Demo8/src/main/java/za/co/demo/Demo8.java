package za.co.demo;

import java.io.IOException;

public class Demo8 {

	public static void main(String[] args) {
		try {
			System.out.println(8 / 0);
			System.out.println("Enter a character");
			char c = (char) System.in.read();
		} catch (ArithmeticException | IOException ex) {
			System.out.println("there was a arithmetic error" + ex.getMessage());
		}
		validate("mxc");
		System.out.println("Bye!");

	}

	public static void validate(String name) {
		if (name.length() < 4 || name.length() > 20) {
			throw new RuntimeException("name is not compliant with length requirements");
		}
	}

}
