package za.co.demo;

import za.co.myapp.Dog;

public class Demo4d {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 8, 16, 32, 64, 128 };
		print(arr[0]);
		if (9 < arr.length) {
			print(arr[9]);
		}
		int[] arr2 = new int[10];
		print(arr2[3]);
		String[] arrStr = { "Mon", "Tue", "Wed", "Thur", "Fri" };

//		for (int i = 1; i < arrStr.length; i++) {
//			print(arrStr[i]);
//		}

		Dog[] dogs = new Dog[4];
		dogs[0] = new Dog("Pluto", 3);
		dogs[1] = new Dog("Bob", 4);
		dogs[2] = new Dog("snowy", 5);
		dogs[3] = new Dog("dogmatix",1);
		print(dogs);
		Dog[] dogs2 = new Dog[10];
		System.arraycopy(dogs,0,dogs2,0,dogs.length);
		dogs2[4]= new Dog("snoopy",3);
		print(dogs2);
	}

	private static void print(Dog[] arr) {
		print("================");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Dog d = arr[i];
			if (d != null) {
				print(d.getName());
				sum += d.getAge();
			}
		}
		print("total ages of  dogs = " + sum);
	}

	private static void print(String i) {
		System.out.println(i);

	}

	private static void print(int i) {
		System.out.println(i);

	}

}
