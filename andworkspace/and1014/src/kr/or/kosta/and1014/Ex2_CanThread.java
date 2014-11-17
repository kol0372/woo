package kr.or.kosta.and1014;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Ex2_CanThread extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new MyView2(this));
	}
	
	Handler handler = new Handler(){
		public void handleMessage(Message msg){
			
			
			
			handler.sendEmptyMessageDelayed(0, 1000);
		}
	};
	
}
