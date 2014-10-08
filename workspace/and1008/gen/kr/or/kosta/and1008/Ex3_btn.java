package kr.or.kosta.and1008;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//onclick  �ڵ鸵
public class Ex3_btn extends Activity implements OnClickListener {
	
	private Button btn1, btn2, btn3;
	private TextView resText;
	
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
	
	setContentView(R.layout.mybtn);
	//��ư�� �ؽ�Ʈ �� �ҷ�����
	
	btn1=(Button) findViewById(R.id.ex3_btn1);
	btn2=(Button) findViewById(R.id.ex3_btn2);
	btn3=(Button) findViewById(R.id.ex3_btn3);
	resText = (TextView) findViewById(R.id.ex3_text);
	
	//��ư�� ����
	btn1.setTextColor(Color.WHITE);
	btn1.setBackgroundColor(Color.RED);
	btn2.setTextColor(Color.WHITE);
	btn2.setBackgroundColor(Color.BLUE);
	btn3.setTextColor(Color.WHITE);
	btn3.setBackgroundColor(Color.RED);
	//��ư�� �̺�Ʈ������ ������ ����ϱ�. (Ŭ���̺�Ʈ)
	btn1.setOnClickListener(this);
	btn2.setOnClickListener(this);
	btn3.setOnClickListener(this);
	
}

@Override
public void onClick(View v) {
	if( v == btn1){
		resText.setText("Click btn1");
		
	}else if(v == btn2){
		resText.setText("Click btn2");
		
	}else if( v== btn3){
		resText.setText("Click btn3");
	}
	
}
}
