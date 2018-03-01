
public class Day2_2 {

	public static void main(String[] args) {
		Dog a = new Dog();
		Dog b = new Dog();
		printDog(a);
		
		a.setName("Einstein");
		a.setBreed("Jack Russell");
		a.setAge(13);
		
		b.setName("Newton");
		b.setBreed("Jack Russell");
		b.setAge(-10);
	
		printDog(a);
		printDog(b);
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Susan");
		emp1.setSalary(-100000);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Bill");
		emp2.setSalary(500);
		
		Employee emp3 = new Employee();
		String name="test";
		if(emp1.getId()==2) {
			name = emp1.getName().toUpperCase();
			System.out.println(name);
			double newSalary=0;
			if(emp3.getSalary()>1000) {
				newSalary = emp1.getSalary()*1.1;
				System.out.println(name+" salary"+newSalary);
			}
			System.out.println(newSalary);
		}	
		//System.out.println(name);
	}
	
	
	public static void printDog(Dog c) {
		System.out.println("name:"+c.getName()+" breed:"
				+c.getBreed()+ " age:"+c.getAge());
	}

}
