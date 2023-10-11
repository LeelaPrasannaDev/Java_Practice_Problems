// Write a Java program to create a class called Person with private instance variables name, age. and country. 
//Provide public getter and setter methods to access and modify these variables.

package encapsulation_problems;

public class Person {
	private String name;
	private int age;
	private String country;
	

	public String getName() {
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCountry() {
		return country;
	}

	public void setName(String name,int age,String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

}
