package za.co.demo.model;

public class Rail extends LandTransport{

	public Rail(String id,int maxCapacity, double maxSpeed, double rate) {
		super(id,maxCapacity, maxSpeed, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getRemainingLife() {
		// TODO Auto-generated method stub
		return 0;
	}

}
