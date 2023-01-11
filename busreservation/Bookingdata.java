package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Bookingdata {
	String passengername;
	int busno;
	Date date;
	Bookingdata()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("what is your name?");
		passengername=scanner.next();
		System.out.println("enter bus no:");
		busno = scanner.nextInt();
		System.out.println("enter date in format dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
		public boolean isAvailable(ArrayList<Bookingdata>booking,ArrayList<Bus>buses)
		{
			int capacity =0;
			for (Bus bus:buses)
			{
			if(bus.getbusno() == busno)
			{
				capacity = bus.getcapacity();
			}
			}
			int booked =0;
			for(Bookingdata b:booking)
			{
				if(b.busno == busno && b.date.equals(date))
				{
					booked++;
				}
			}
		return booked<capacity ? true:false;
	}

}
