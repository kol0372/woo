package kr.or.android1021;





import com.example.test.R;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Test extends Activity{
	private Button btn;
	private LinearLayout ly;
	private Uri uri;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test1);
		btn = (Button) findViewById(R.id.button1);
		ly = (LinearLayout) findViewById(R.id.test);
		
		
		ImageView img = new ImageView(Test.this);
		img.setImageResource(R.drawable.sssssssssssssssssss);
		ly.addView(img);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				TextView text = new TextView(Test.this);
				text.setText("Ok");
				ly.addView(text);
				
				
				
				
			}
		});
	}
}
