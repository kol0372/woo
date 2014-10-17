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
	private ProgressDialog progressBar; // ���α׷����� ��ü ����
	private int progressBarStatus = 0; // ���α׷������� ���°� �ʱ�ȭ
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
				progressBar.setMessage("working...."); // �޼���
				progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

				progressBar.setProgress(0);// �ʱⰪ ����
				progressBar.setMax(100); // ���ᰪ�̸鼭 �ִ밪
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
		// ���α׷��� ���°� ���� �� �� ���� �����ش�.
		progressBarStatus++;
		// ���α׷����� �ִ밪���� �������� ������ �ϴٰ�.
		if (progressBarStatus < 100) {
			return progressBarStatus;
		}
		// --------------------���α׷������� ����� ------------
		try {
			Thread.sleep(1000);// ��� �����ð��� �ְ�
			progressBar.dismiss();// ���α׷����ٸ� ����
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		progressBar.dismiss();// ���α׷����ٸ� ����
		return 100;
	}
}
