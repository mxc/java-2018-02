package za.co.demo.model;

public class Helicopter  extends AirTransport implements Flying {

	private int x;
	private int y;
	
	public Helicopter(String id, int maxCapacity, double maxSpeed, double rate) {
		super(id, maxCapacity, maxSpeed, rate);
	}

	@Override
	public double getRemainingLife() {
		return 0;
	}

	public int getCeiling() {
		return 1000;
	}

	public int getMaxRange() {
		return 800;
	}

	public int[] getGPSLocation() {
		int [] pos = {x,y};
		return pos;
	}

	public void updatePosition(int x, int y) {
		this.x+=x;
		this.y+=y;
	}	
	
}
