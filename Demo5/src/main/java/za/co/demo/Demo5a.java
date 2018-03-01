package za.co.demo;

import za.co.demo.model.Animal;
import za.co.demo.model.Cow;
import za.co.demo.model.Dog;
import za.co.demo.model.Hippo;

public class Demo5a {

	public static void main(String[] args) {
		Dog d = new Dog("me","einstein","jr");
		Hippo h = new Hippo();
		Cow c = new Cow();
		
		d.setAge(13);
		d.setWeight(7);
		
		
		h.setName("Herberta");
		h.setAge(15);
		h.setSpecies("Natal Hippo");
		h.setWeight(1000);
		
		c.setName("Issy");
		c.setAge(5);
		c.setWeight(500);
		
		Animal a1 = new Animal("Bob");


		a1.setAge(0);
		a1.setWeight(-100);

		
		printName(d);
		printName(h);
		printName(c);
		printName(a1);
		
		print(d);
		print(h);
		print(c);
		print(a1);
		
	}
	
	public static void printName(Animal a) {
		System.out.println(a.getName());
	}

	public static void print(Animal a) {
		System.out.println(a.print());
	}

}
