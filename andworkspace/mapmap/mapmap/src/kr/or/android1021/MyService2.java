package kr.or.android1021;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

//서비스로 백그라운드에서 활동할 객체 //
public class MyService2 extends Service implements Runnable {
	private NotificationManager mNotification;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// 서비스가 시작될때 스레드를 생성하고 시작 시킨다 // .
		Thread myThread = new Thread(this);
		myThread.start();
		mNotification = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

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
				Notification noti = new Notification(R.drawable.ic_launcher,
						"비상", System.currentTimeMillis());
				noti.defaults |= Notification.DEFAULT_SOUND;
				noti.flags |= Notification.FLAG_INSISTENT;
				// 서비스에서 현재 액티비티로 이동을 하기 위해서는 //
				Intent intent = new Intent(MyService2.this, AA.class);
				// 서비스에서 이동해야 될 액티비티의 를 활성해 해줘야 한다 // TASK .
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				// startActivity(intent);
				PendingIntent p = PendingIntent.getActivity(MyService2.this, 0,
						intent, 0);
				noti.setLatestEventInfo(MyService2.this, " ", " ", p);
				mNotification.notify(1, noti);

			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
}