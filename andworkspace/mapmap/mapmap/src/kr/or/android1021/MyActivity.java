package kr.or.android1021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.babowoori);
	Intent it = new Intent(this, MyService2.class);
	//����Ʈ�� ����ؼ� �� �����ϸ� �� ��ü�� ���񽺷� �� 
	startService(it);

}
}


