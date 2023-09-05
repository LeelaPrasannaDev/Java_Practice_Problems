
public class Teacher {
	String name;
	int age;
	String qulification;
	Teacher(String name,int age,String qulification)
	{
		this.name=name;
		this.age = age;
		this.qulification =qulification;
	
	}
	void output()
	{
		System.out.println("Your name = "+name);
		System.out.println("Your age = "+age);
		System.out.println("Your qulification = "+qulification);
	}
}
