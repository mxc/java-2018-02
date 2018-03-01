package za.co.demo.app;

import java.util.Arrays;

import za.co.demo.model.Flying;
import za.co.demo.model.Helicopter;
import za.co.demo.model.Parrot;

public class Demo7 {

	public static void main(String []args) {
			Parrot p = new Parrot("Polly");
			Helicopter h = new Helicopter("Heli1",100,100,12);
			printDetails(p);
			printDetails(h);
	}
	
	
	public static void printDetails(Flying f) {
			System.out.println("ceiling:"+ f.getCeiling());
			System.out.println("range:"+ f.getMaxRange());
			System.out.println("location:"
			+ Arrays.toString(f.getGPSLocation()));
	}

}
