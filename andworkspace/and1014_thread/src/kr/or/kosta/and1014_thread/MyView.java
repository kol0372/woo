package kr.or.kosta.and1014_thread;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.view.View;

public class MyView extends View {
	private Paint textP; // ĵ�������� ���ڸ� ǥ��
	private int sec, min, mSec; // ��
	
	public MyView(Context context) {
		super(context);
		textP = new Paint();
		textP.setTextSize(30);
		textP.setColor(Color.RED);
		textP.setAntiAlias(true);
		handler.sendEmptyMessageDelayed(0, 10);
	}
	// ȭ���� �׷��ִ� �޼��� - ĵ������ ���Թ޾Ƽ� draw�迭�� �޼��带 ȣ���ؼ�
	// ����� �� �ִ�.
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawText("Time :"+min+":"+sec+":"+mSec, 0, 80, textP);
	}
	Handler handler = new Handler(){
		public void handleMessage(Message msg) {
			mSec +=1;
			if(mSec ==  100){
				sec++;
				mSec=0;
			}
			if(sec == 60){
				min++;
				sec=0;
			}
			invalidate(); // canvas�� �����ϱ� ���ؼ� ȣ��!
			handler.sendEmptyMessageDelayed(0, 10);
		};
	};
	
}



