package kr.or.kosta.and1010;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Exam1 extends Activity implements OnItemSelectedListener{
	
	String[] items = {"1", "2", "3", "4", "5"};
	private ArrayAdapter<String> aa;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ex1_sp);
		
		Spinner spin = (Spinner) findViewById(R.id.ex1_select);
		
		 aa = new ArrayAdapter<String>(
				this,android.R.layout.simple_spinner_item,items);
		
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(aa);
		
		spin.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, 
			int position, long id) {
		// TODO Auto-generated method stub
		Toast.makeText(Exam1.this, "select" + aa.getItem(position), 3000).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

}
