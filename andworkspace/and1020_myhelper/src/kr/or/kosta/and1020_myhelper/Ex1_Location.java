package kr.or.kosta.and1020_myhelper;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
//위치제공자 (Location Provider)
//위치 매니저(Location Manager)를 생성해서 위치서비스를 받을 수 있다.
//현철옵 ♥
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
		//GPS를 사용해서 위치 정보를 받기 위해서 꼭 필요한 객체
		//ACCESS_FINE_LOCATION : 앱에서 GPS센서의 기능을 사용할 수 있도록 해주는 설정.
		//READ_PHONE_STATE 전화기의 상태를 알 수 있게 해주는 설정
		//ACCESS_COARSE_LOCATION : Call-ID/와이파이
		LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		
		//안드로이드에서 다형성은 사용하지 않는다.
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
