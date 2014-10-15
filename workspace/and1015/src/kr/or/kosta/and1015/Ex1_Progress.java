package kr.or.kosta.and1015;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

//스레드를 통해서 UI못하니까 이방법 - > 자바랑 
//핸들러 통해서 하면 필요없어.

public class Ex1_Progress extends Activity {
	private Button btn1;
	private ProgressDialog progressBar; // 프로그래스바 객체 선언
	private int progressBarStatus = 0; // 프로그래스바의 상태값 초기화
	private Handler progressBarHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex1_handler);

		btn1 = (Button) findViewById(R.id.ex1_btn1);
		progressBarHandler = new Handler();

		// 버튼을 클릭했을 때 프로그래스바를 생성시켜서 동작 시키는 프로그램을 구현
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 프로그래스바를 생성
				progressBar = new ProgressDialog(v.getContext());
				progressBar.setCancelable(true);
				progressBar.setMessage("working...."); // 메서지
				progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

				progressBar.setProgress(0);// 초기값 세팅
				progressBar.setMax(100); // 종료값이면서 최대값
				progressBar.show();
				progressBarStatus = 0;

				// 익명로컬내부클래스
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
							//실시간으로 그려줘야 해서 
							//post안에는 반듯이 runnable로 인자값을 전달해야하며 
							//핸들러에서 스레드를 통제하는 방법중에 하나이다.
							//post란 메서드를 사용ㅇ해서 그레드가 동작하는 progressBarStatus
							//값을 progressBar UI로 적용하는 일을 해주고 있따.
							progressBarHandler.post(new Runnable() {
								
								@Override
								public void run() {
									//여기선 UI 가능
									progressBar.setProgress(progressBarStatus);
									
								}
							});
						}
					}
				}).start();
			}
		});
	}

	// 프로그래스바를 증가 시켜주는 일을 하는 메서드 - 스레드가 접근해서 호출!
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
