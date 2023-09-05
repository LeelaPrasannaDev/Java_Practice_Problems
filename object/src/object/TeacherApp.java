package object;

public class TeacherApp 
{
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher(1234,"Venky","Java");
		System.out.println("id = "+t1.id+" ,"+"name= "+t1.name+" ,"+" Subject = "+t1.subject);
		Teacher t2 = new Teacher(4321,"Amar","Python");
		System.out.println("id = "+t2.id+" ,"+"name= "+t2.name+" ,"+" Subject = "+t2.subject);
	}
}
