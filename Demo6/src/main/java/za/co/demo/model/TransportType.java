package za.co.demo.model;

public class TransportType {
 
	protected int maxCapacity;
	protected double maxSpeed;
	protected double rate;
	protected String transportId;
	
	public TransportType(String id, int maxCapacity, double maxSpeed, double rate) {
		this.maxCapacity = maxCapacity;
		this.maxSpeed = maxSpeed;
		this.rate = rate;
		this.transportId = id;
	}

	public double calcCost(int weight) {
		return this.rate*weight;
	}
	
	public double calcTime(double distance) {
		return distance/maxSpeed;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public String getTransportId() {
		return transportId;
	}
	
	
	
}
