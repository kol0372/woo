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
	private int fnum, bnum;// ��ư�� Ŭ���� �� ���� ������ ��

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
		//��ž�϶� �ڵ鷯 ����.(removeMessage(What)) 
		//��ư2�� �������. gone ���� ����� -> btn3�� visible
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				handler.sendEmptyMessageDelayed(1, 1000);
				
			}
		});
		//��ŸƮ
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				handler.sendEmptyMessageDelayed(3, 1000);
				
			}
		});

		// MyThread myT = new MyThread();
		// myT.setDaemon(true);//������ �������� ����� : ���������� �����Ҽ� �ִ�.
		// myT.start();
		//handler 
//		�ڵ鷯 ��ü�� �޼����� ������ ui�� �ֱ����� �ݺ��۾��� �ʿ��Ҷ� �����带 ����ؼ� ���
//		����������  �ڵ鷯�� �ϳ��� ������� ������.

		handler.sendEmptyMessageDelayed(0, 1000);
	}

	public class MyThread extends Thread {

		@Override
		public void run() {
			while (true) {
				// text2�� ���� bnum�� �����尡 ����/���� �ϵ��� �������.

				try {
					bnum++;
					// ������ȿ����� UI�� ���� ȣ�� �� �� ����.
					// text2.setText("Back" + bnum++);
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

	// �ڵ鷯 �����ؼ� �����غ��� .
	Handler handler = new Handler() {
		
		@Override
		public void handleMessage(Message msg) {
			if (msg.what == 0) {
				bnum++;
				text2.setText("Back" + bnum++);
				// ���ȣ���� ���ؼ� �������� �ݺ��� ���� �Ѵ�.
				handler.sendEmptyMessageDelayed(0, 1000);
			}else if(msg.what == 1){//��ž
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
