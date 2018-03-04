package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderUtil {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = "23/12/1988";
		SimpleDateFormat format2 = new SimpleDateFormat("dd-MMMM-yyyy");
		Date d  = format1.parse(dateStr);
		String month = format2.format(d);
		System.out.println(month);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MONTH, 1);
		Date secondDate = cal.getTime();
		String newFormatedDate = format1.format(secondDate);
		System.out.println(newFormatedDate);
	}
}
