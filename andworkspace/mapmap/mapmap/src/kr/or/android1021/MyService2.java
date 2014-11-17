package kr.or.android1021;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

//���񽺷� ��׶��忡�� Ȱ���� ��ü //
public class MyService2 extends Service implements Runnable {
	private NotificationManager mNotification;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// ���񽺰� ���۵ɶ� �����带 �����ϰ� ���� ��Ų�� // .
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
				// Ư�� ���ǿ� �ش�Ǹ� �Ʒ��� �������� ����ؼ� Ư�� ��Ƽ��Ƽ if(count == 10){ //
				// �� �̵� ��Ű�ڴ�.
				Notification noti = new Notification(R.drawable.ic_launcher,
						"���", System.currentTimeMillis());
				noti.defaults |= Notification.DEFAULT_SOUND;
				noti.flags |= Notification.FLAG_INSISTENT;
				// ���񽺿��� ���� ��Ƽ��Ƽ�� �̵��� �ϱ� ���ؼ��� //
				Intent intent = new Intent(MyService2.this, AA.class);
				// ���񽺿��� �̵��ؾ� �� ��Ƽ��Ƽ�� �� Ȱ���� ����� �Ѵ� // TASK .
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