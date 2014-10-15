package kr.or.kosta.and1015;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

//�����带 ���ؼ� UI���ϴϱ� �̹�� - > �ڹٶ� 
//�ڵ鷯 ���ؼ� �ϸ� �ʿ����.

public class Ex1_Progress extends Activity {
	private Button btn1;
	private ProgressDialog progressBar; // ���α׷����� ��ü ����
	private int progressBarStatus = 0; // ���α׷������� ���°� �ʱ�ȭ
	private Handler progressBarHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex1_handler);

		btn1 = (Button) findViewById(R.id.ex1_btn1);
		progressBarHandler = new Handler();

		// ��ư�� Ŭ������ �� ���α׷����ٸ� �������Ѽ� ���� ��Ű�� ���α׷��� ����
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// ���α׷����ٸ� ����
				progressBar = new ProgressDialog(v.getContext());
				progressBar.setCancelable(true);
				progressBar.setMessage("working...."); // �޼���
				progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

				progressBar.setProgress(0);// �ʱⰪ ����
				progressBar.setMax(100); // ���ᰪ�̸鼭 �ִ밪
				progressBar.show();
				progressBarStatus = 0;

				// �͸���ó���Ŭ����
				new Thread(new Runnable() {

					@Override
					public void run() {
						while (progressBarStatus < 100) {
							progressBarStatus = doSomeTask();
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							//�ǽð����� �׷���� �ؼ� 
							//post�ȿ��� �ݵ��� runnable�� ���ڰ��� �����ؾ��ϸ� 
							//�ڵ鷯���� �����带 �����ϴ� ����߿� �ϳ��̴�.
							//post�� �޼��带 ��뤷�ؼ� �׷��尡 �����ϴ� progressBarStatus
							//���� progressBar UI�� �����ϴ� ���� ���ְ� �ֵ�.
							progressBarHandler.post(new Runnable() {
								
								@Override
								public void run() {
									//���⼱ UI ����
									progressBar.setProgress(progressBarStatus);
									
								}
							});
						}
					}
				}).start();
			}
		});
	}

	// ���α׷����ٸ� ���� �����ִ� ���� �ϴ� �޼��� - �����尡 �����ؼ� ȣ��!
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
