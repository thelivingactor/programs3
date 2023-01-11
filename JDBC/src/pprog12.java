
public class pprog12 {

	public static void main(String[] args) {
		int nums[]= {1,1,2,2,2,3,4,4,6};
		int count =0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]==nums[i+1])
	            {
	                nums[i]=9;
	                count++;
	            }
	            System.out.println(i);
	        }
	        System.out.println(nums.toString());
	     for(int i=0;i<nums.length;i++)
	        {
	         if(nums[i]==9)
	         {
	             for(int j=0;j<nums.length-1-i;j++)
	             {
	             nums[i+1]=nums[i];
	             }     
	             System.out.println(i);
	         }
	}
	     System.out.println(nums);
	        System.out.println(nums.length-count);
		

	}
}
