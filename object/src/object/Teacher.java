package object;

public class Teacher {
	int id;
	String name;
	String subject;

	void teach() {
		System.out.println("Class Started______________!");
	}

	void attendence() {
		System.out.println("Attendences taken");
	}

	Teacher(int a, String b, String c) {
		id = a;
		name = b;
		subject = c;
	}
}