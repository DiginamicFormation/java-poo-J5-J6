package dates;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestFormatDate {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2017, 1, 1);
		LocalDate nextFriday = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
		
		System.out.println(nextFriday);
		
	}

}
