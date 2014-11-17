package kr.or.kosta.and1013;

import kr.or.kosta.and1013.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class Ex2_result extends Activity {

	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_result);

		text = (TextView) findViewById(R.id.ex2_re);

		Intent intent = getIntent();
		
		Bundle myBundle = intent.getExtras();
		
		String data = myBundle.getString("key");
		
		text.setText(data);

	}

}
