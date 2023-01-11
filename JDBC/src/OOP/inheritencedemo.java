package OOP;
class employee {
    private String name;
	private double salary;
	private double percent;
	employee()
	{
		name="";
		salary = 0.0;
	}
	employee(String n,double s)
	{
		this.name=n;
		this.salary=s;
	}
	String getname()
	{
		return name;
	}
	void setname(String nam)
	{
		this.name=nam;
	}
	double getSalary()
	{
		return salary;
	}
	void setSalary(double sal)
	{
		this.salary =sal;
	}
	
	
	void raiseSalary(double r)
	{
		this.percent=r;
		salary += salary*percent/100;
	}
}

class manager extends employee {
double bonus;
manager(String n, int s,double b) {
	super(n,s);
	bonus =b;
}
void setBonus(double b)
{
	bonus = b;
}
public double getSalary()
{
	return super.getSalary()+bonus;
}
}
 public class inheritencedemo {
	public static void main(String []args)
	{
		employee e1 = new employee("Ram",35000);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());
		
		manager m1 = new manager("sham",65000,0.0);
		System.out.println(m1.getSalary());
	}
}
