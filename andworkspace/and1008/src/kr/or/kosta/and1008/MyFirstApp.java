package kr.or.kosta.and1008;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

//1.안드로이드 화면을 가진 객체를 상속받는다.


public class MyFirstApp extends Activity {

	//2.안드로이드의 jvm이 메인메서드처럼 호출 - oncr(ctrl+space)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 3삭제하면 안됨
		super.onCreate(savedInstanceState);
		// 4 사용할 레이아웃 불러오기
		setContentView(R.layout.activity_main);
		// 5 커스텀 마이징
		//id가 ex1_msg인 textview에 프로그램이 시작될때 
		// 하트 출력
		TextView text1 = (TextView)findViewById(R.id.ex1_msg);
		text1.setTextColor(Color.RED);
		text1.setText("●");
	}
}
