
public class Property {

	private String address;
	private double rental;
	private double value;
	private final String name;
	public static int count =0;

	
	public Property(String name, String address,double rental) {
		this.address= address;
		this.name =name;
		this.rental = rental;
		count++;
	}
	
	public Property(String name,String address, double rental, double value) {
		this.address=address;
		this.rental = rental;
		this.value = value;
		this.name = name;
		count++;
	}
	
	public String getName() {
		final String  n1 ="test";
		return name;
	}
	
	public static Property minValue(Property p1, Property p2) {
		if (p1.getRental()<p2.getRental()) {
			System.out.println(p1.getName()+ " is cheaper than "+ p2.getName());
			return p1;
		}else if (p1.getRental()>p2.getRental()) {
			System.out.println(p2.getName()+ " is cheaper than "+p1.getName());
			return p2;
		} else {
			System.out.println(p2.getName()+" is the same cost as " +p1.getName());
			if (p1.getValue()>p2.getValue()) {
				return p1;
			}else {
				return p2;
			}
		}
	}
	
	
	public static void main(String[] args) {

		Property  pavillion = new Property("Pavillion","Spine Road",100_000,4_000_000);
		pavillion.print();
		System.out.println("Total number of objects created:" + Property.count);
		Property.count=10;
		
		 Property sunCity = new Property("Sun City","Mpulnaga",500_000);
		System.out.println("Total number of objects created:" + Property.count);
		sunCity.print();
		Property.minValue(pavillion,sunCity);

		
		 //double tc1 = pavillion.getTotalRent(5);
		 //double tc2 = sunCity.getTotalRent(5);
		 pavillion.printQuote(5);
		 sunCity.printQuote(5);
		 //System.out.println("Pavillion:"+tc1+" Sun City"+tc2);
	}
	
	
	
	public void printQuote(int i) {
		System.out.println("Address"+address +" cost for "+ i +"days = " + this.getTotalRent(i));
		
	}

	public String getAddress() {
		return address;
	}
	
	
	public double getRental() {
		return rental;
	}
	
	public void setRental(double rent) {
		rental = rent;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double v) {
		value=v;
	}
	
	public double getTotalRent(int days) {
		return days*rental*1.15;
	}
	
	public void adjustRental(double perc) {
		this.rental = this.rental*(1+perc);
	}
	
	public void print() {
		System.out.println("Address:"+this.address+
				" Value:"+this.value+" Rental:"+this.rental);
	}
	
}





