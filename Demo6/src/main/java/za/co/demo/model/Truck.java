package za.co.demo.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
	
public class Truck extends LandTransport{
	
	private String model;
	private LocalDate purchaseDate;

	public Truck(String id,int maxCapacity, double maxSpeed, double rate,
			String model,LocalDate purchaseDate) {
		super(id,maxCapacity, maxSpeed, rate);
		this.model=model;
		this.purchaseDate = purchaseDate;
	}


	public String getModel() {
		return model;
	}


	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}


	@Override
	public double getRemainingLife() {
		return Duration.between(this.purchaseDate.plusDays(900).atStartOfDay() ,
				LocalDate.now().atStartOfDay()).toDays();
	}

	@Override
	public String toString() {
		return super.toString() +" model:"+model;
	}
	
}
