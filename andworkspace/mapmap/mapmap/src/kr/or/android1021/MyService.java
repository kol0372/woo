package kr.or.android1021;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service implements Runnable {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		Thread myThread = new Thread(this);
		myThread.start();
	}

	private int count = 0;

	@Override
	public void run() {
		while (true) {
			count++;
			System.out.println("Count:" + count);
			if (count == 10) {
				// 특정 조건에 해당되면 아래의 인텐으를 사용해서 특정 액티비티 if(count == 10){ //
				// 로 이동 시키겠다.
				// 서비스에서 현재 액티비티로 이동을 하기 위해서는 //
				Intent intent = new Intent(MyService.this, AA.class);
				// 서비스에서 이동해야 될 액티비티의 를 활성해 해줘야 한다 // TASK .
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 서비스로 해야 될 일을 정의 한다 // .

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
