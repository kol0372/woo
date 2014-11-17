package kr.or.kosta.and1014_thread;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ex1_Thread extends Activity {
	private TextView text1,text2;
	private Button btn1,btn2,btn3;
	private int fnum,bnum; // 버튼이 클릭될 때 마다 증가될 수
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1_thread);
		text1 = (TextView) findViewById(R.id.ex1_text2);
		text2 = (TextView) findViewById(R.id.ex1_text3);
		btn1 = (Button) findViewById(R.id.ex1_btn);
		btn2 = (Button) findViewById(R.id.ex1_btn2);//StopBtn
		btn3 = (Button) findViewById(R.id.ex1_btn3);//StartBtn
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				text1.setText("For:"+fnum++);
				//text2.setText("Back:"+bnum);
			}
		});
		// stop : stop일때는 핸들러를 삭제 (removeMessage(what))
		// btn2 -> GONE, btn3 -> VISIBLE 
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//handler.removeMessages(0);
				handler.sendEmptyMessage(1);
			}
		});
		// start
		btn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				handler.sendEmptyMessageDelayed(3, 1000);
			}
		});
//		MyThread myT = new MyThread();
//		myT.setDaemon(true);
//		myT.start();
		// 핸들러 객체에 메세지를 보내기
		// UI를 주기적인 반복작업이 필요할 때 스레드를 대신해서 사용
		// 스레드간의 메세지 전달이 필요할 때에도 사용
		// 내부적으로 핸들러도 하나의 스레드로 움직임
		handler.sendEmptyMessageDelayed(0, 1000);
	}
	//------Thread 생성해서 적용해보기
	public class MyThread extends Thread{
		@Override
		public void run() {
			while (true) {
				// text2의 값인 bnum을 스레드가 증가/조작 하도록 해보자.
				 try {
					 bnum++;
					 // 스레드 안에서는 UI를 직접 호출할 수 없다.
					 //text2.setText("Back:"+bnum);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	//------Handler 생성해서 적용해보기
	Handler handler = new Handler(){
		public void handleMessage(Message msg) {
			if(msg.what == 0){
				bnum++;
				text2.setText("Back:"+bnum);
				// 재귀호출을 통해서 스레드의 반복을 구현 한다.
				handler.sendEmptyMessageDelayed(0, 1000);
			}else if(msg.what == 1){ //stop
				handler.removeMessages(0);
				btn2.setVisibility(View.GONE);
				btn3.setVisibility(View.VISIBLE);
				
			}else if(msg.what == 3){ //start
				bnum++;
				text2.setText("Back:"+bnum);
				// 재귀호출을 통해서 스레드의 반복을 구현 한다.
				handler.sendEmptyMessageDelayed(0, 1000);
				btn2.setVisibility(View.VISIBLE);
				btn3.setVisibility(View.GONE);
			}
			
		};
	};
}











