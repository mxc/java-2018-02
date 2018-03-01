package za.co.demo.model;

public abstract class AirTransport extends TransportType {

	private double planningTime;
	private String pilot;
	private double govermentTaxes;

	public AirTransport(String id, int maxCapacity, double maxSpeed, double rate) {
		super(id, maxCapacity, maxSpeed, rate);
		// TODO Auto-generated constructor stub
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	public double getPlanningTime() {
		return planningTime;
	}

	public void setPlanningTime(double planningTime) {
		this.planningTime = planningTime;
	}

	public double getGovermentTaxes() {
		return govermentTaxes;
	}

	public void setGovermentTaxes(double govermentTaxes) {
		this.govermentTaxes = govermentTaxes;
	}

	@Override
	public double calcCost(int weight) {
		double cost =  super.calcCost(weight);
		return cost + this.govermentTaxes;
	}

	@Override
	public double calcTime(double distance) {
		return super.calcTime(distance)+this.planningTime;
	}

	
	
	
}
