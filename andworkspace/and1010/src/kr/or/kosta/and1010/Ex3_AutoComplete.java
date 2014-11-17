package kr.or.kosta.and1010;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Ex3_AutoComplete extends Activity{
	private AutoCompleteTextView act;
	private static final String[] DATA = 
		{"java", "javabook", "Android", "AD", "AA",};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.ex3_auto);
	
	act = (AutoCompleteTextView) findViewById(R.id.ex3_autoComplete);
	
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, DATA);
	
	act.setAdapter(adapter);
	}

}
