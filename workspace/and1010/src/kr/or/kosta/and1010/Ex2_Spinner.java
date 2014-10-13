package kr.or.kosta.and1010;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class Ex2_Spinner extends Activity{
	
	private TextView sta;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.ex1_sp);
	
	Spinner spin = (Spinner) findViewById(R.id.ex1_select);
	TextView sta = (TextView) findViewById(R.id.star);
	
	
	
	}

}
