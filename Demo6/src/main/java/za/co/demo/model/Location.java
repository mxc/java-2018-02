package za.co.demo.model;

public class Location {
	
	public Location(String address) {
		super();
		this.address = address;
	}

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
