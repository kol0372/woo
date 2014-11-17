package kr.or.kosta.and1008;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ExamJava extends Activity implements OnClickListener {
	
	private Button btn1,btn2,btn3;
	private ImageView iv;
	private LinearLayout ll;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exam1);
		
		btn1 = (Button)(findViewById(R.id.exambtn1));
		btn2 = (Button)(findViewById(R.id.exambtn2));
		btn3 = (Button)(findViewById(R.id.exambtn3));
		
		ll = (LinearLayout)findViewById(R.id.Woori);
		
		iv = (ImageView) findViewById(R.id.imgv);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		if( v == btn1){
			ll.setBackgroundColor(Color.WHITE);
			iv.setImageResource(R.drawable.rwg);
			
		}else if(v == btn2){
			ll.setBackgroundColor(Color.CYAN);
			iv.setImageResource(R.drawable.rwg2);
			
		}else if( v== btn3){
			ll.setBackgroundColor(Color.MAGENTA);
			iv.setImageResource(R.drawable.rwg3);
		}
		
	}

}
