abstract class Welcome
{
	abstract void welcome();
}
class Teacher extends welcome
{ 
	void welcome{
	System.out.println("welcome Teacher");
    }
}
class Student extends welcome
{ 
	void welcome{
	System.out.println("welcome Student");
    }
}



public class Abstract_demo
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Teacher t1 = new Teacher();

		Welcome w1 [] = new Welcome(2);
		w1[0]= new Student();
		w2[1]= new Teacher();

		for(Welcome w : w1 )
		{
			w1.welcome();
		}

	}
}