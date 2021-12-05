package webdriver;

 
 
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Datesample {
 public static void main (String[] args) {
	 
	 Date d = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MMM_DD_HH_MM_SS");
		 System.out.println(df.format(d)); 
	 
 }
}
