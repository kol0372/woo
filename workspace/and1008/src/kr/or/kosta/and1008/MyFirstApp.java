package kr.or.kosta.and1008;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

//1.�ȵ���̵� ȭ���� ���� ��ü�� ��ӹ޴´�.


public class MyFirstApp extends Activity {

	//2.�ȵ���̵��� jvm�� ���θ޼���ó�� ȣ�� - oncr(ctrl+space)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 3�����ϸ� �ȵ�
		super.onCreate(savedInstanceState);
		// 4 ����� ���̾ƿ� �ҷ�����
		setContentView(R.layout.activity_main);
		// 5 Ŀ���� ����¡
		//id�� ex1_msg�� textview�� ���α׷��� ���۵ɶ� 
		// ��Ʈ ���
		TextView text1 = (TextView)findViewById(R.id.ex1_msg);
		text1.setTextColor(Color.RED);
		text1.setText("��");
	}
}
