package kr.or.kosta.and1013;

import android.R.color;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Ex4_Dialog extends Activity{
	private ImageButton btn1;
	private AlertDialog.Builder builder;
	private LinearLayout ll;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex4_dialog);
		
		btn1 = (ImageButton) findViewById(R.id.ex4_imgBtn);
		ll= (LinearLayout) findViewById(R.id.Linear1);
		//다이얼로그(화면에 뜨는거)는 생성자가 protected로 되어 있기 때문에 반드시 
		//Builder로 생성해야 한다.
		builder = new AlertDialog.Builder(this);
		
		//버튼누르면
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				builder.setTitle("My Darling ^^");
				builder.setMessage("Hunchul op");
				builder.setIcon(R.drawable.camera3);
				//빌더에 다시 이벤트 넣어주기.
				//그냥 닫기 - ("close", null) , 이벤트 콜백 - ("close", new DialogInterface.on
				//ClickListener(){override~~})
			builder.setPositiveButton("close", new DialogInterface.OnClickListener() {
				
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					int[] arr = 
						{Color.BLACK , Color.BLUE, Color.CYAN , Color.GRAY, Color.GREEN};
					ll.setBackgroundColor(arr[(int) (Math.random()*5)]);
					Log.d("Example", "ok");
					
				}
			});
			builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Log.d("Example", "ok2");
					
				}
			});
			builder.show();
			}
		});
		
	}

}
