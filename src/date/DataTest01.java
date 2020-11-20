package date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DataTest01 {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		System.out.println(date);
		System.out.println("연도 : "+(date.getYear()+1900));
		System.out.println("월 : "+(date.getMonth()+1));
		System.out.println("일 : "+date.getDate());
		System.out.println();
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println("연도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1));
		System.out.println("일 : "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println();

		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth()+","+localDate.getMonthValue());
		System.out.println(localDate.getDayOfMonth());
		
		System.out.println("월 말 일 : "+localDate.lengthOfMonth());
		
	}

}
