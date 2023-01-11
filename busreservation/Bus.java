package busreservation;

public class Bus {
	protected int busno;
	protected Boolean ac;
	protected int capacity;
	Bus(int busno,Boolean ac,int capacity)
	{
		this.busno=busno;
		this.ac=ac;
		this.capacity=capacity;
	}
	public int getbusno()
	{
		return busno;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int cap)
	{
		this.capacity=cap;
	}
	public void setac(boolean ac)
	{
		this.ac=ac;
	}
	
	public void displayBusInfo()
	{
		System.out.println("busno : "+busno+" ac "+ac+" capacity "+capacity);
	}
	

}
