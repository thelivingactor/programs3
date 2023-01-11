package OOP;

public class Stack {
	int a[]= new int[10];
	int tos;
     Stack()
     {
    	 tos=-1;
     }

	public void push(int b) {
		if(tos==9)
		{
			System.out.println("stack is full");
		}
		else
		{
		a[++tos]=b;
		}
	}
		
	        
	int pop()
	{
		if(tos>=0)
		{
		return a[tos--];
		}
		else
			System.out.println("stack is empty");
		return -1;
	}

}
