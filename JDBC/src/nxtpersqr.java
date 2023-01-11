import java.util.Scanner;
import java.lang.Math;
public class nxtpersqr {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        float n = scanner.nextFloat();
		        float i=1;
		        scanner.close();
		        do
		        {
		            if(Math.sqrt(n++)==0)
		            {
		                System.out.println("the next perfect square is"+i);
		                break;
		            }
		        }while(n>0);
		    }
		}



