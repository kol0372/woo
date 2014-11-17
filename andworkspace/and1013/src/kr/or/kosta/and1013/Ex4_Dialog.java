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
		//���̾�α�(ȭ�鿡 �ߴ°�)�� �����ڰ� protected�� �Ǿ� �ֱ� ������ �ݵ�� 
		//Builder�� �����ؾ� �Ѵ�.
		builder = new AlertDialog.Builder(this);
		
		//��ư������
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				builder.setTitle("My Darling ^^");
				builder.setMessage("Hunchul op");
				builder.setIcon(R.drawable.camera3);
				//������ �ٽ� �̺�Ʈ �־��ֱ�.
				//�׳� �ݱ� - ("close", null) , �̺�Ʈ �ݹ� - ("close", new DialogInterface.on
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
