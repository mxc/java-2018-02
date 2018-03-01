package za.co.demo.model;

import java.time.LocalDate;

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

	
	
}
