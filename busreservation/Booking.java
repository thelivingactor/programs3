package busreservation;
import java.util.ArrayList;
import java.util.Scanner;
public class Booking {
	public static void main(String args[]) {
		ArrayList<Bus>buses=new ArrayList<Bus>();
		ArrayList<Bookingdata>booking=new ArrayList<Bookingdata>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,35));
		buses.add(new Bus(3,true,55));
		for(Bus b: buses)
		{
			b.displayBusInfo();
		}
		int busopt=1;
		Scanner scanner = new Scanner(System.in);
		while(busopt==1)
		{
			System.out.println("enter 1 for booking and 2 for exit");
			busopt=scanner.nextInt();
			Bookingdata bookings =new Bookingdata();
			if(busopt==1)
			{
				if(bookings.isAvailable(booking,buses))
				{
				booking.add(bookings);
				System.out.println("your booking is confirmed");
				}
				else
				{
					System.out.println("no bookings are available check another bus or date");
				}
			}
		}
	}

}
