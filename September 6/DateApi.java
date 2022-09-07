package sept06;

import java.time.*;
import java.util.*;

public class DateApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		System.out.println("The date after one year"+date1.plusMonths(12));
		System.out.println("The date before one year"+date1.minusMonths(12));
		int dd = date1.getDayOfMonth();
		int mm = date1.getMonthValue();
		int yyyy = date1.getYear();
		
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		
		
		System.out.println("\nEnter the date");
		dd = sc.nextInt();
		
		System.out.println("Enter Month");
		mm = sc.nextInt();
		
		System.out.println("Enter year");
		yyyy = sc.nextInt();
         
		LocalDate date2=LocalDate.of(yyyy, mm, dd);
		System.out.printf("The date is:%d-%d-%d\n", dd, mm, yyyy);
		if(date1.equals(date2)){
			System.out.println("the dates are equal");
		}
			else {
				System.out.println("The dates are not equal");
			
				
			}
		
		
//System.out.println("The date is:"+date2);
		LocalTime time=LocalTime.now();
		//System.out.println(time);
		int hour=time.getHour();
		int minute=time.getMinute();
		int second=time.getSecond();
		System.out.printf("%d:%d:%d",hour,minute,second);
		System.out.println("\nEnter the year to check");
		int year = sc.nextInt();
		Year y = year.of(yyyy);
		if(y.isLeap()){
			System.out.println("The year is leap year");
		} else {
			System.out.print("The year is not a leap year");
		}
		
		//System.out.println("");
	}

}
