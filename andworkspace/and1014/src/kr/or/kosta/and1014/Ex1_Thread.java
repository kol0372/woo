package kr.or.kosta.and1014;

import kr.or.kosta.and1014.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ex1_Thread extends Activity {

	private TextView text1, text2;
	private Button btn1,btn2,btn3;
	private int fnum, bnum;// 버튼이 클릭될 때 마다 증가될 수

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex1_thread);

		text1 = (TextView) findViewById(R.id.ex1_text2);
		text2 = (TextView) findViewById(R.id.ex1_text3);

		btn1 = (Button) findViewById(R.id.ex1_btn1);
		btn2 = (Button) findViewById(R.id.ex1_btn2);
		btn3 = (Button) findViewById(R.id.ex1_btn3);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				text1.setText("For : " + fnum++);
				// text2.setText("Back" + bnum++);

			}
		});
		//스탑일때 핸들러 삭제.(removeMessage(What)) 
		//버튼2를 사라지게. gone 상태 만들기 -> btn3은 visible
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				handler.sendEmptyMessageDelayed(1, 1000);
				
			}
		});
		//스타트
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				handler.sendEmptyMessageDelayed(3, 1000);
				
			}
		});

		// MyThread myT = new MyThread();
		// myT.setDaemon(true);//스레드 데몬으로 만들기 : 안정적으로 종료할수 있다.
		// myT.start();
		//handler 
//		핸들러 객체에 메세지를 보내기 ui를 주기적인 반복작업이 필요할때 스레드를 대신해서 사용
//		내부적으로  핸들러도 하나의 스레드로 움직임.

		handler.sendEmptyMessageDelayed(0, 1000);
	}

	public class MyThread extends Thread {

		@Override
		public void run() {
			while (true) {
				// text2의 값인 bnum을 스레드가 증가/조작 하도록 헤ㅐ보자.

				try {
					bnum++;
					// 스레드안에서는 UI를 직접 호출 할 수 없다.
					// text2.setText("Back" + bnum++);
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

	// 핸들러 생성해서 적용해보기 .
	Handler handler = new Handler() {
		
		@Override
		public void handleMessage(Message msg) {
			if (msg.what == 0) {
				bnum++;
				text2.setText("Back" + bnum++);
				// 재귀호출을 통해서 스레드의 반복을 구현 한다.
				handler.sendEmptyMessageDelayed(0, 1000);
			}else if(msg.what == 1){//스탑
				handler.removeMessages(0);
				btn2.setVisibility(View.GONE);
				btn3.setVisibility(View.VISIBLE);
				
			}else if(msg.what == 3){
				bnum++;
				text2.setText("Back" + bnum++);
				
				handler.sendEmptyMessageDelayed(0, 1000);
				btn2.setVisibility(View.VISIBLE);
				btn3.setVisibility(View.GONE);
			}
		}

	};
}
