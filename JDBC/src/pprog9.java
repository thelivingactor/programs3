
public class pprog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int arr[]=new int[100];
        arr[0]=1;
        arr[1]=2;
        int count=1;
        for(int i=2;i<=n;i++)
        {
                arr[i]=arr[i-1]+arr[i-2];
                //j=arr[i]+arr[i-1];
                System.out.println(arr[i]);
            
            count++;
        }
        System.out.println(arr[n-1]);

	}

}
