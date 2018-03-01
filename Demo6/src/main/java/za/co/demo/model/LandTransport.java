package za.co.demo.model;

public class LandTransport extends TransportType {

	protected String driver;
	
	public LandTransport(String id, int maxCapacity, double maxSpeed, double rate) {
		super(id,maxCapacity, maxSpeed, rate);
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	

}
