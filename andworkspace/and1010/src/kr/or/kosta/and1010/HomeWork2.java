package kr.or.kosta.and1010;

import java.io.Serializable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HomeWork2 extends Activity {

	private TextView tv1;
	private Button btn;
	private HomeWork_Vo hv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homework2);

		tv1 = (TextView) findViewById(R.id.textView1);
		btn = (Button) findViewById(R.id.button1);

		Intent intent = getIntent();
		
		Bundle myBundle = intent.getExtras(); //
		
		hv = (HomeWork_Vo) myBundle.getSerializable("hv");
		
		tv1.setText("ID : "+hv.getId()+"\n"+
				"AGE : "+hv.getAge()+"\n"+
				"LOCATION : "+hv.getLocal()+"\n"+
				"NAME : "+hv.getName()+"\n"+
				"TEL : "+ hv.getTel());

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

			}
		});

	}

}
