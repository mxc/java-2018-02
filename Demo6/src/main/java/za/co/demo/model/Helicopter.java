package za.co.demo.model;

import java.time.Duration;
import java.time.LocalDate;

public class Helicopter extends AirTransport{

	private LocalDate lastMaiteanceDate;
	private Duration mainSchedule;
	
	public Helicopter(String id,int maxCapacity, double maxSpeed, double rate) {
		super(id,maxCapacity, maxSpeed, rate);
		// TODO Auto-generated constructor stub
	}

	public LocalDate getLastMaiteanceDate() {
		return lastMaiteanceDate;
	}

	public void setLastMaiteanceDate(LocalDate lastMaiteanceDate) {
		this.lastMaiteanceDate = lastMaiteanceDate;
	}

	public Duration getMainSchedule() {
		return mainSchedule;
	}

	public void setMainSchedule(Duration mainSchedule) {
		this.mainSchedule = mainSchedule;
	}

	@Override
	public double getRemainingLife() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
