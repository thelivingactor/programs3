import java.util.Scanner;
public class pprog10 {

	/*public static void main(String[] args) {
		int count =0,a=0,s=0,b=0;
		int n = 12;
		b=n;
		while(b>0)
		{
			s = b%10;
			b=b/10;
			//a=a+(int) (s*Math.pow(10,count));
			count++;
			
			}
		System.out.println(count);
		while(n>0)
		{
			s = n%10;
			n=n/10;
			a=a+(int) (s*Math.pow(10,count-1));
			count--;
			System.out.println(a);
			}
		System.out.println(a);

	}*/
	public static void main(String args[])
	{
		
	int x=121;
	  if(x<0)
      {
         System.out.println(false);
      }
      int count =0,a=0,s=0,b=0;
		b=x;
		while(b>0)
		{
			s = b%10;
			b=b/10;
			count++;
			
			}
		while(x>0)
		{
			s = x%10;
			x=x/10;
			a=a+(int) (s*Math.pow(10,count-1));
			count--;
			}
		System.out.println(a);
		System.out.println(x);
	
  if(a==x)
  {
      System.out.println(true);
  }
  else
  {
      System.out.println(false);
  }
}
}
