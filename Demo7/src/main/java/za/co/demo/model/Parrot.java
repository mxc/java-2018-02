package za.co.demo.model;

public class Parrot extends Animal implements Flying {

	private int x;
	private int y;
	
	public Parrot(String name) {
		super(name);
	}

	public int getCeiling() {
		return 300;
	}

	public int getMaxRange() {
		return 5;
	}

	public int[] getGPSLocation() {
		int pos []= {x,y};
		return pos;
	}

	public void updatePosition(int x, int y) {
		this.x+=x;
		this.y+=y;
	}

}
