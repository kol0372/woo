package kr.or.kosta.and1017;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ex1_AsyncTask extends Activity {

	private Button btn1, btn2, btn3;
	private TextView mTextView;
	private int i;
	private String[] msStringArray = { "w", "o", "o", "r", "i", "w", "a", "h",
			"c", "i" };
	private MyThread mythread = null;

	public class MyThread extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			for (i = 0; i < msStringArray.length; i++) {
				publishProgress();
				try {
					Thread.sleep(250);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			return null;
		}

		@Override
		protected void onProgressUpdate(Void... values) {
			mTextView.setText(mTextView.getText() + msStringArray[i]);
			super.onProgressUpdate(values);
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 레이아웃
		setContentView(R.layout.ex1);

		// 아이디 주기
		btn1 = (Button) findViewById(R.id.ex1_btn1);
		btn2 = (Button) findViewById(R.id.ex1_btn2);
		btn3 = (Button) findViewById(R.id.ex1_btn3);
		mTextView = (TextView) findViewById(R.id.ex1_text1);
		
		btn1.setOnClickListener(myOnClick);
		btn2.setOnClickListener(myOnClick);
		btn3.setOnClickListener(myOnClick);
		
		

	
		

	}
	OnClickListener myOnClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.ex1_btn1:
				// AsysncTask를 시작
				mythread = (MyThread) new MyThread().execute();
				break;
			case R.id.ex1_btn2:
				if (mythread != null) {
					mythread.cancel(true);

				}
				break;
			case R.id.ex1_btn3:
				mTextView.setText("");
				break;
			}

		}

	};

}
