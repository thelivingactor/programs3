package OOP;
abstract class Member
{
	abstract void welcomeMessage();
}
class Teacher extends Member
{ 
	void welcomeMessage(){
	System.out.println("welcome Teacher");
    }
	}
class Student extends Member
{ 
	void welcomeMessage(){
	System.out.println("welcome Student");
    }
}



public class Abstractclass_demo
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Teacher t1 = new Teacher();

		Member[] w1  = new Member[2];
		w1[0]= new Student();
		w1[1]= new Teacher();

		for(Member w : w1 )
		{
			w.welcomeMessage();
		}

	}
}

