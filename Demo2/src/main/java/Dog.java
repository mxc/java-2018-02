
public class Dog {

	private String name;
	private String breed;
	private byte age;
	
	public Dog() {
 
	}
	
	
	public void setName(String dogName) {
	   name=dogName.toLowerCase();	
	}
	
	
	public String getName() {
		return name.toUpperCase();
	}	
	
    public void setBreed(String dogBreed) {
    	breed = dogBreed.toLowerCase();
    }
    
    public String getBreed() {
    	return breed;
    }

    public int getAge() {
    	
		return (int)age;
	}

	
	public void setAge(int dogAge) {
		if (dogAge<0) {
			System.out.println("Dog age is invalid. Cannot less than 0");
			dogAge = 0;
		}
		if (dogAge>25) {
			System.out.println("Dog age is invalid. Cannot be greater than 20");
			dogAge=0;
		}
		this.age = (byte)dogAge;
	}
    
}
