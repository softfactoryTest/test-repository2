import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MultichatServer {
	
	
	public static void main(String[] argss) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.toString());
		System.out.println(c.getTime());
		
		c.setTime(new Date());
		System.out.println(c.getTimeInMillis());
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.KOREA);
		System.out.println(s.format(c.getTime()));
	}
}