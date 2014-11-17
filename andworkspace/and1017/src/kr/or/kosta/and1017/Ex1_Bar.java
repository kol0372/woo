package kr.or.kosta.and1017;

import kr.or.kosta.and1017.Ex1_AsyncTask.MyThread;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ex1_Bar extends Activity {
	private Button btn1;
	private ProgressDialog progressBar; // 프로그래스바 객체 선언
	private int progressBarStatus = 0; // 프로그래스바의 상태값 초기화
	private Handler progressBarHandler;
	private MyThread mythread = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex1_handler);

		btn1 = (Button) findViewById(R.id.ex1_btn1);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				progressBar = new ProgressDialog(v.getContext());
				progressBar.setCancelable(true);
				progressBar.setMessage("working...."); // 메서지
				progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

				progressBar.setProgress(0);// 초기값 세팅
				progressBar.setMax(100); // 종료값이면서 최대값
				progressBar.show();

				progressBarStatus = 0;

				mythread = (MyThread) new MyThread().execute();

			}
		});
	}

 class MyThread extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			while (progressBarStatus < 100) {

				progressBarStatus = doSomeTask();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				publishProgress();

			}
			return null;

		}

		@Override
		protected void onProgressUpdate(Void... values) {
			progressBar.setProgress(progressBarStatus);
			super.onProgressUpdate(values);
		}

	}

	public int doSomeTask() {
		// 프로그래스 상태값 증가 후 그 값을 돌려준다.
		progressBarStatus++;
		// 프로그래스의 최대값보다 적을때만 리턴을 하다가.
		if (progressBarStatus < 100) {
			return progressBarStatus;
		}
		// --------------------프로그래스바의 종료시 ------------
		try {
			Thread.sleep(1000);// 잠시 지연시간을 주고
			progressBar.dismiss();// 프로그래스바를 종료
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		progressBar.dismiss();// 프로그래스바를 종료
		return 100;
	}
}
