package kr.or.kosta.and1008;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CoinGame extends Activity implements OnClickListener {
	private Button frontBtn, backBtn, endBtn;
	private ImageView imgv;
	private TextView resText, totalText;
	private int totalnum;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.coinlayout);
		
		
		frontBtn = (Button) findViewById(R.id.ga_fr_btn1);
		backBtn = (Button) findViewById(R.id.ga_bk_btn1);
		endBtn = (Button) findViewById(R.id.ga_end_btn1);
		
		imgv=(ImageView) findViewById(R.id.imageView1);
		
		resText = (TextView) findViewById(R.id.resMsg);
		totalText = (TextView) findViewById(R.id.ga_total_num);
		
		frontBtn.setOnClickListener(this);
		backBtn.setOnClickListener(this);
		endBtn.setOnClickListener(this);
		
		
		
	}


	@Override
	public void onClick(View v) {
		if(v == frontBtn){
			game(1);
		}else if( v == backBtn){
			game(2);
		}else if(v == endBtn){
			
		}
		
	}
	/*
	 �޼��� ���� ���� : 
	frontBtn �� ��쿡 game �޼��忡 1�̶�� ���ڰ��� �����ؼ� ȣ���ϰ�
	backBtn �� ��쿡 game �޼��忡 2��� ���ڰ��� �����ؼ� ȣ���Ѵ�.
	game �޼��尡 ȣ�� �ɶ����� random�� ��(1or2)�� ���ͼ� ����ڰ� �Է��� ���� ���ؼ�
	������� ���(cpu�� ���� �̹��� ó��, �̰���� ���ο� ���� ���ó��)�Ѵ�. 
	 */
	public void game(int n){
		int cpu = (int) (Math.random()*2 +1);
		//cpu�� 1�϶� ������ �ո�, 2�̸� �޸� �����ش�.
		if(cpu == 1){
			imgv.setImageResource(R.drawable.rwg2);
		}else if(cpu ==2){
			imgv.setImageResource(R.drawable.rwg);
		}
		if(n == cpu){
			resText.setTextColor(Color.BLUE);
			resText.setText("win");
			
		}else{
			resText.setTextColor(Color.RED);
			resText.setText("lost");
		}
		totalnum++;
		totalText.setText("total: " + totalnum);
	}
	
	
}