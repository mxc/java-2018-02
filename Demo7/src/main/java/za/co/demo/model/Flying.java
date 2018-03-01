package za.co.demo.model;

public interface Flying {
	public int getCeiling();
	public  int getMaxRange();
	public int[] getGPSLocation();
	public void updatePosition(int x,int y);
}
