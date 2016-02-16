import java.util.*;
import java.text.*;

class date{
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(dateFormat.format(now));
	}
}