package sept06;

import java.time.*;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate date = LocalDate.now();
		//int dd = date.getDayOfMonth();
		//int mm = date.getMonthValue();
		//int yyyy = date.getYear();
		//System.out.printf("%d-%d-%d\n", dd, mm, yyyy);

		//LocalTime time = LocalTime.now();
		//int h = time.getHour();
		//int m = time.getMinute();
		//int s = time.getSecond();
		//int n = time.getNano();
		//System.out.printf("%d:%d:%d",h,m,s,n);
		
		LocalDateTime dt=LocalDateTime.now();
		int dd1 = dt.getDayOfMonth();
		int mm1= dt.getMonthValue();
		int yyyy1 = dt.getYear();
		
		
		int h1 = dt.getHour();
		int m1 = dt.getMinute();
		int s1 = dt.getSecond();
		int n1 = dt.getNano();
		
		System.out.printf("%d-%d-%d\n", dd1, mm1, yyyy1);
		System.out.printf("%d:%d:%d\n",h1,m1,s1,n1);
		//System.out.println(dt);
		LocalDateTime dt1=LocalDateTime.of(2999, Month.DECEMBER, 20, 12, 45);
		System.out.println(dt1);
		System.out.println("after 5 months"+dt1.plusMonths(5));
		System.out.println("after 5 months"+dt1.minusMonths(5));
		
		
	}

}
