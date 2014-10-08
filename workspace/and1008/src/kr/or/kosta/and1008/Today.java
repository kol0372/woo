package kr.or.kosta.and1008;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.widget.TextView;

public class Today extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	
	setContentView(R.layout.activity_main);
	
	TextView text1 = (TextView)(findViewById(R.id.ex1_msg));
	text1.setText("○");
	TextView text2 = (TextView)(findViewById(R.id.today));
	
	
	//현재 날짜를 얻기 위한 객체를 생성
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	
	text2.setText(f.format(new Date()));
	
}
}
