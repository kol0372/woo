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
	//인텐트를 사용해서 로 전달하면 그 객체는 서비스로 시 
	startService(it);

}
}


