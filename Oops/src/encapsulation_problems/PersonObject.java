package encapsulation_problems;

public class PersonObject {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		//Set values using setter method
		
		p1.setName("venky",22,"india");
		
		// get values using getter methods
		
		String name = p1.getName();
		int age = p1.getAge();
		String country = p1.getCountry();
		
		//print values
		
		System.out.println("Name = "+ name);
		System.out.println("Age = "+ age);
		System.out.println("Country = "+ country);
	}

}
