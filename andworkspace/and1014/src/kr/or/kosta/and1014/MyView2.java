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
	private int width, height; // 화면의 높이와 폭
	private int bottleW, bottleH;// 맥주병이미지 높이와 폭
	private int centerX, centerY;// 화면의 중심
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
		// getSystemService - class.forname()과 동일한 역할.
		// 안에 newInstance(); 있어.
		// 윈도우매니저 객체를 윈도우서비스로 생성
		Display display = manager.getDefaultDisplay();
		Log.d("View W : ", display.getWidth() + "");
		Log.d("View H : ", display.getHeight() + "");

		Log.d("logend ", "----------------------");

		width = display.getWidth();
		height = display.getHeight();

		// 화면의 중심점 구하기
		centerX = width / 2;
		centerY = height / 2;

		// 이미지 읽어오기 비트맵으로 가져오면 크기 조정을 섬네일로 가능
		// 1.이미지가 drawable에 있으니까 resource로 불러와
		// factory에 리소스 말고 file형태로 가져오는 것도 있음 !!**
		// 스트림도 있음 !!
		bottle = BitmapFactory
				.decodeResource(getResources(), R.drawable.bottle);

		// 2.이미지 크기 조정
		bottleW = bottle.getWidth() / 2;
		bottleH = bottle.getHeight() / 2;
		bottle = Bitmap.createScaledBitmap(bottle, bottleW, bottleH, false);
		handler.sendEmptyMessageDelayed(0, 10);
	}

	@Override
	public void draw(Canvas canvas) {
		// 반복문을 돌려서 캔버스를 회전시키면서 이미지를 그려보자.
		// for (int i = 0; i <12 ; i++) {
		// 페인트 있음 null대신 페인트
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
