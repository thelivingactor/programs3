package OOP;

public class minvalue {
	static int minValue(int...val)
	{
		int a = Integer.MAX_VALUE;
		for(int i:val)
		{
			if(i<a)
				a=i;
		}
		return a;
	}

	public static void main(String[] args) {
		int re = minValue(4,7,2,0,-1);
		System.out.println(re);

	}


}
