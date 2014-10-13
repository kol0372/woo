package kr.or.kosta.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Ex6_Form extends Activity {
	
	private Button btn;
	private EditText edit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.ex6_form);
	
	btn= (Button) findViewById(R.id.ex6_btn1);
	edit = (EditText) findViewById(R.id.ex6_edit);
	
	btn.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(Ex6_Form.this , Ex7_Res.class);
			//edit���� ���� �Է��� ���� ex7_Res.java�� �����ϱ� ���ؼ�
			//bindle��ü�� �����ؼ� ����Ѵ�.
			Bundle myBundle = new Bundle();
			//putXX("key", val);
			myBundle.putString("val", edit.getText().toString());
			intent.putExtras(myBundle);
			startActivity(intent);
			
		}
	});
	
	}

}
