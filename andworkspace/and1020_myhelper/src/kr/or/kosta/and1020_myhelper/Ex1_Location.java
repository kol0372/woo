package kr.or.kosta.and1020_myhelper;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
//��ġ������ (Location Provider)
//��ġ �Ŵ���(Location Manager)�� �����ؼ� ��ġ���񽺸� ���� �� �ִ�.
//��ö�� ��
import android.os.Bundle;
import android.widget.TextView;


public class Ex1_Location extends Activity{
	private TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1_gps);
		text = (TextView) findViewById(R.id.ex1_text);
		//GPS�� ����ؼ� ��ġ ������ �ޱ� ���ؼ� �� �ʿ��� ��ü
		//ACCESS_FINE_LOCATION : �ۿ��� GPS������ ����� ����� �� �ֵ��� ���ִ� ����.
		//READ_PHONE_STATE ��ȭ���� ���¸� �� �� �ְ� ���ִ� ����
		//ACCESS_COARSE_LOCATION : Call-ID/��������
		LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		
		//�ȵ���̵忡�� �������� ������� �ʴ´�.
		List<String> proviList = manager.getAllProviders();
		
		StringBuffer sb = new StringBuffer();
		int sizev =proviList.size();
		for(int i=0; i <sizev ; i ++){
			sb.append("Location MAnager").append(":");
			sb.append(proviList.get(i)).append(", status :");
			sb.append(manager.isProviderEnabled(proviList.get(i)));
			sb.append("\n");
		}
		text.setText(sb.toString());
	}

}
