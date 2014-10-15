package kr.or.kosta.and1014;

import java.util.Timer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.view.View;

public class Myview extends View{
	private Paint textp, textp2;
	private int sec, min, msec;
	
	public Myview(Context context) {
		super(context);
		textp = new Paint();
		
		textp.setTextSize(30);
		textp.setColor(Color.DKGRAY);
		textp.setAntiAlias(true);
//		textp2 = new Paint();
//		textp2.setTextSize(100);
//		textp2.setColor(Color.BLACK);
//		textp2.setAntiAlias(true);
		handler.sendEmptyMessageDelayed(0, 10);
	}
//화면을 그려주는 메서드 - 캔버스를 주입받아서 draw계열의 메서드를 호출해서 
	//사용
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawText("runtime : " + min+":" +sec + ":" +msec, 0, 80, textp);
		
	}
	
Handler handler = new Handler(){
	public void handleMessage(Message msg){
		
		msec += 1;
		if (msec  == 100){
			sec ++;
			msec=0;
		}
		if(sec == 60){
			min++;
			sec=0;
		}
		invalidate(); // canvas를 갱싱하기 위해서 호출
		handler.sendEmptyMessageDelayed(0, 10);
	}
};
}
