package kr.or.kosta.and1014;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class MyView2 extends View {
	private int width, height; // ȭ���� ���̿� ��
	private int bottleW, bottleH;// ���ֺ��̹��� ���̿� ��
	private int centerX, centerY;// ȭ���� �߽�
	private Bitmap bottle;
	private float arc, a;
	private boolean start = true;
	private boolean stop = false;

	// private Paint pain;

	public MyView2(Context context) {
		super(context);
		Log.d("logstart ", "----------------------");
		// Log.d("View W : " , getWidth() + "");
		// Log.d("View H : " , getHeight() + "");
		WindowManager manager = (WindowManager) context
				.getSystemService(context.WINDOW_SERVICE);
		// getSystemService - class.forname()�� ������ ����.
		// �ȿ� newInstance(); �־�.
		// ������Ŵ��� ��ü�� �����켭�񽺷� ����
		Display display = manager.getDefaultDisplay();
		Log.d("View W : ", display.getWidth() + "");
		Log.d("View H : ", display.getHeight() + "");

		Log.d("logend ", "----------------------");

		width = display.getWidth();
		height = display.getHeight();

		// ȭ���� �߽��� ���ϱ�
		centerX = width / 2;
		centerY = height / 2;

		// �̹��� �о���� ��Ʈ������ �������� ũ�� ������ �����Ϸ� ����
		// 1.�̹����� drawable�� �����ϱ� resource�� �ҷ���
		// factory�� ���ҽ� ���� file���·� �������� �͵� ���� !!**
		// ��Ʈ���� ���� !!
		bottle = BitmapFactory
				.decodeResource(getResources(), R.drawable.bottle);

		// 2.�̹��� ũ�� ����
		bottleW = bottle.getWidth() / 2;
		bottleH = bottle.getHeight() / 2;
		bottle = Bitmap.createScaledBitmap(bottle, bottleW, bottleH, false);
		handler.sendEmptyMessageDelayed(0, 10);
	}

	@Override
	public void draw(Canvas canvas) {
		// �ݺ����� ������ ĵ������ ȸ����Ű�鼭 �̹����� �׷�����.
		// for (int i = 0; i <12 ; i++) {
		// ����Ʈ ���� null��� ����Ʈ
		canvas.rotate(arc, centerX, centerY);
		canvas.drawBitmap(bottle, centerX - bottleW / 2, centerY - bottleH / 2,
				null);

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			handler.sendEmptyMessageDelayed(1, 10);
		}
		return true;
	}

	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			if (msg.what == 0) {
				invalidate();
				if (start == true) {
					a += 0.1;
					arc += a;
					handler.sendEmptyMessageDelayed(0, 10);
				} else if (stop = true) {
					if (a > 0) {
						a -= 0.1;
						arc += a;
						handler.sendEmptyMessageDelayed(0, 20);
					} else if (a <= 0) {
						a = 0;
					}
					}
				} else if (msg.what == 1) {
					if (stop == false) {
						start = false;
						stop = true;

					} else if (stop == true) {
						start = true;
						stop = false;
					}
					handler.sendEmptyMessageDelayed(0, 10);
				}

			}

		
	};

}
