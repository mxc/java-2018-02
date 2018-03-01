package za.co.demo.app;

import java.time.Duration;
import java.time.LocalDate;

import za.co.demo.model.Helicopter;
import za.co.demo.model.Rail;
import za.co.demo.model.TransportType;
import za.co.demo.model.Truck;


public class AppCLIFrontEnd {

	public static void main(String[] args) {
		int packageWeight = 100;
		
		Truck t1 = new Truck("T1",500,140,120,"Volvo",LocalDate.now());
		Truck t2 = new Truck("T2",300,160,140,"Benz",LocalDate.now());
		t1.setDriver("tom");
		t2.setDriver("andy");
		
		Rail r1 = new Rail("R1",2000,80,100);
		r1.setDriver("gert");
		
		Helicopter h1 = new Helicopter("H1",100,300,200);
		h1.setPilot("Andile");
		h1.setMainSchedule(Duration.ofDays(100));
		
		calcCost(t1,packageWeight);
		calcCost(t2,packageWeight);
		calcCost(r1,packageWeight);
		calcCost(h1,packageWeight);

	}
	
	
	public static void calcCost(TransportType t,int weight) {
		System.out.println(t.getTransportId()+"="+ t.calcCost(weight));
	}

}
