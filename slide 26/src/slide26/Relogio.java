package slide26;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio{
	
	DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
	Date date = new Date();
	
	public String getHora(){
		return dateFormat.format(date);
	}

}