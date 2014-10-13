package kr.or.kosta.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ex4_Main extends Activity{
	private Button btn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.ex4_main);
	
	btn1 = (Button) findViewById(R.id.ex4_btn1);
	//��ưŬ���Ҷ� subActivity�� �̵��� �ϱ� ���ؼ� 
	//intent �۾��� �Ѵ�.
	//intent�� �ɺθ������� A->B �̵��ϰ� ���ִ� ��ü
	btn1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			//open intent -> intent(context, �̵��Ұ�ü)
			Intent intent = new Intent(Ex4_Main.this, Ex5_sub.class);
			//intent�� ���ؼ� �̵������ִ� �޼��带 ȣ��
			//ACtivity�� �����Ҷ� ������ ����Ʈ������ ���ڷ� ����
			//�Ŵ��н�Ʈ���� ���ǵ� ��Ƽ��Ƽ�� ȣ���� ��!
			startActivity(intent);
		}
	});
	
	}

}
