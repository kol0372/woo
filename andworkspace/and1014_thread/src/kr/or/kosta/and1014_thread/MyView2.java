package kr.or.kosta.and1014_thread;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class MyView2 extends View {
	int width, height;// ȭ���� ���� ����
	int bottleW, bottleH;// ���ֺ��� ���� ����.
	int centerX, centerY;// ȭ���� �߽���.
	Bitmap bottle;// ���ֺ� �̹���.
	// /int degree; // ĵ�ٽ��� ���ư� ����.
	private float degree, a;
	private boolean start, stop;

	public MyView2(Context context) {
		super(context);
		WindowManager manager = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		Display display = manager.getDefaultDisplay();
		width = display.getWidth();
		height = display.getHeight();
		// ȭ���� �߽��� �о����.
		centerX = width / 2;
		centerY = height / 2;
		// �̹��� �о����
		bottle = BitmapFactory
				.decodeResource(getResources(), R.drawable.bottle);
		// �̹����� ũ��
		bottleW = (bottle.getWidth() / 2) - 30;
		bottleH = (bottle.getHeight() / 2) - 30;
		bottle = Bitmap.createScaledBitmap(bottle, bottleW, bottleH, false);
		start = true;
		stop = false;
		degree = 1;
		handler.sendEmptyMessageDelayed(0, 10);
	}

	// �׸��� �޼ҵ�
	@Override
	protected void onDraw(Canvas canvas) {
		// ĵ�ٽ��� �ð�������� 30�� ȸ����Ű��. ȸ������ �߽� >> (centerX,centerY)
		canvas.rotate(degree, centerX, centerY);
		canvas.drawBitmap(bottle, centerX - bottleW / 2, centerY - bottleH / 2,
				null);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		handler.sendEmptyMessageDelayed(1, 10);
			start = false;
			stop = true;
		return true;
	}

	// �ڵ鷯 �����ϱ�
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {

			if (msg.what == 0) {
				invalidate();
				if (start == true) {
					if (degree < 500) {
						a += 0.1;
					}
					degree += a;
					handler.sendEmptyMessageDelayed(0, 10);
				} else if (stop == true) {
					if (a > 0) {
						a -= 0.1;
						handler.sendEmptyMessageDelayed(0, 10);
					} else if (a <= 0) {
						a = 0;
						stop = false;
						start = true;
						handler.removeMessages(0);
					}
					degree += a;
				}

			}

		}
	};
}
