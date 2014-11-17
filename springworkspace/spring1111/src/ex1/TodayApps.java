package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayApps {
	private SimpleDateFormat sdf;
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public String printToDate() {

		return sdf.format(date);
	}

}
