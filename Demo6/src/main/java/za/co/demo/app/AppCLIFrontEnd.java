package za.co.demo.app;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

import za.co.demo.model.Helicopter;
import za.co.demo.model.Rail;
import za.co.demo.model.TransportType;
import za.co.demo.model.Truck;

public class AppCLIFrontEnd {

	public static void main(String[] args) {
		
		
		Truck t1 = new Truck("T1", 500, 140, 120, "Volvo", LocalDate.now());
		Truck t2 = new Truck("T2", 300, 160, 140, "Benz", LocalDate.now());
		t1.setDriver("tom");
		t2.setDriver("andy");

		Rail r1 = new Rail("R1", 2000, 80, -100);
		r1.setDriver("gert");

		Helicopter h1 = new Helicopter("H1", 100, 300, 200);
		h1.setPilot("Andile");
		h1.setMainSchedule(Duration.ofDays(100));
		h1.setPlanningTime(2);
		h1.setGovermentTaxes(1000);
		
		Truck t3=new Truck("T1", 500, 140, 120, "Volvo", LocalDate.now());
		
		if (t1.equals(t3)) {
			System.out.println("T1 == T3");
		}

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to Logistico");
			System.out.println("+++++++++++++++++++");

			System.out.println("Please enter a weight:");
			int packageWeight = scan.nextInt();

			System.out.println("Please enter a distance:");
			int distance = scan.nextInt();

			System.out.println("Trasport\t\tCost\t\tDuration");
			System.out.println("=========================================");
			printSummary(t1, packageWeight, distance);
			printSummary(t2, packageWeight, distance);
			printSummary(r1, packageWeight, distance);
			printSummary(h1, packageWeight, distance);

			System.out.println("Press q to quit or any key to continue");
			String choice = scan.next();
			
			boolean quit = false;
			
			switch (choice) {
			case "q":
				quit = true;
				break;
			default:
				quit = false;
			}
			
			if (quit) {
				break;
			}
		}
		scan.close();
	}

	public static void printSummary(TransportType t, int weight, double distance) {
		System.out.println(t.getTransportId() + "\t\t" + NumberFormat.getInstance().format(t.calcCost(weight)) + "\t\t"
				+ NumberFormat.getInstance().format(t.calcTime(distance)));
	}

}
