package kr.or.kosta.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class HomeWork extends Activity {
	
	private Button btn;
	private EditText idtext, nametext, agetext ,teltext , localtext;
	private HomeWork_Vo hv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homework);
		
		btn = (Button) findViewById(R.id.hw_btn1);
		idtext = (EditText) findViewById(R.id.hw_id);
		nametext = (EditText) findViewById(R.id.hw_name);
		agetext = (EditText) findViewById(R.id.hw_age);
		teltext = (EditText) findViewById(R.id.hw_tel);
		localtext = (EditText) findViewById(R.id.hw_location);
		
			
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				hv = new HomeWork_Vo();
				
				hv.setId(idtext.getText().toString());
				hv.setName(nametext.getText().toString());
				hv.setAge(agetext.getText().toString());
				hv.setLocal(localtext.getText().toString());
				hv.setTel(teltext.getText().toString());
				
				Intent intent = new Intent(HomeWork.this, 
						HomeWork2.class);
				
				Bundle mybundle = new Bundle();
				
			
				
				mybundle.putSerializable("hv", hv);
				
				intent.putExtras(mybundle);
				
				startActivity(intent);			
			}
		});	
	}
}
