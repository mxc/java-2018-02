package za.co.demo.model;

public class Animal {
	
	protected String name;
	protected int age;
	protected double weight;
	
	public Animal(String name,int age,double weight) {
		this.age=age;
		this.name= name;
		this.weight=weight;
		this.demoM1();
	}	
	
	public Animal(String name) {
		this.name = name;
		this.demoM1();
	}
	
//	public Animal() {
//		
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String print () {
		return "name:"+name+ " age:"+age+ " weight:"+ weight;
	}
	
	private void demoM1() {
		System.out.println("Animal consturctor called ...");
	}
	
	protected void demoM2() {
		System.out.println("Accessable by child classes");
	}
    void demoM3(){
		System.out.println("Accessable by package");
     }
	
    public final String getRealName() {
    	return this.name;
    }
    
}
