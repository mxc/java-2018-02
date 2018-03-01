package za.co.demo.model;

public abstract class TransportType {
 
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
	
	public abstract double getRemainingLife();
	
	@Override
	public String toString() {
		return this.transportId +" rate:"+rate+" capcaity:"+maxCapacity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj) return true;
		if(obj ==null)return false;
		if(obj instanceof TransportType) {
			TransportType t = (TransportType)obj;
			if (t.getTransportId().equals(this.transportId)) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
 	
  @Override
  public int hashCode() {
	  return this.transportId.hashCode()*71;
  }
}
