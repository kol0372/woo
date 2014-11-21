package exam;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;

public class Todate {
	@Resource(name="today")	
	private Date date;
	private SimpleDateFormat format;
	
	public String printDate(){
		return format.format(date);	
	}
}
