import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LocalDate id1=LocalDate.of(2020, 11, 23);
		System.out.println(id1);
		LocalDate id=LocalDate.now();
		System.out.println(id);
		LocalDate yesterday=id.minusDays(1);
		System.out.println(yesterday);
		LocalDate tomorrow=id.plusDays(1);
		System.out.println(tomorrow);
		System.out.println("leap year : "+id.isLeapYear());
		LocalDateTime it=id.atTime(12, 4, 45);
		System.out.println("todays date with time "  +it);
		String ste=id.format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(t);
		LocalTime t1=t.minusHours(4);
		System.out.println(t1);*/
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalDate id=LocalDate.now();
		System.out.println(id);
		LocalDateTime it=id.atTime(12, 4, 45);
		System.out.println("todays date with time "  +it);
		DateTimeFormatter dft= DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		String s=it.format(dft);
		System.out.println(s);

}
}
