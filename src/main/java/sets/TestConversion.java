package sets;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestConversion {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		//System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2002);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		Date date = cal.getTime();
		
		System.out.println(date.getTime());
		
//		SimpleDateFormat formatteur = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		String dateFormattee = formatteur.format(date);
//		System.out.println(dateFormattee);
	}

}
