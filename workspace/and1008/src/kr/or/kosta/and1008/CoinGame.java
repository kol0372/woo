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
	 메서드 동작 설계 : 
	frontBtn 일 경우에 game 메서드에 1이라는 인자값을 전달해서 호출하고
	backBtn 일 경우에 game 메서드에 2라는 인자값을 전달해서 호출한다.
	game 메서드가 호출 될때마다 random한 수(1or2)를 얻어와서 사용자가 입력한 값과 비교해서
	결과값을 출력(cpu에 대한 이미지 처리, 이겼는지 여부에 대한 결과처리)한다. 
	 */
	public void game(int n){
		int cpu = (int) (Math.random()*2 +1);
		//cpu가 1일때 동전의 앞면, 2이면 뒷면 보여준다.
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
