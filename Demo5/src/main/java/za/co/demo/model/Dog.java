package za.co.demo.model;

public class Dog extends Animal {
	
	private String owner;
    private String breed;
    
    public Dog (String owner, String breed,String name) {
    	super(name);
    	this.age = 0;
    	this.weight=0;
    	this.owner=owner;
    	this.breed = breed;
    }
    
	
    public String getBreed() {
		return breed;
	}
	
    public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
    
    @Override
    public String getName() {
    	return super.getName() + "is owned by " + owner;
    }  
  

}
