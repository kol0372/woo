package kr.or.kosta.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ex7_Res extends Activity {
	private Button btn;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex7_res);

		btn = (Button) findViewById(R.id.ex7_btn1);
		tv = (TextView) findViewById(R.id.ex7_resv);
		//intent�κ��� bundle�� �ޝۼ� �Ķ���Ͱ�(key)�� ����ؼ� ���� �̾Ƴ���.
		
		Intent intent = getIntent();
		Bundle myBundle = intent.getExtras();
		String data = myBundle.getString("val");
		
		tv.setText(data);
				
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});

	}
}
