package kr.or.android1021;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {
	private GoogleMap mMap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.fragment)).getMap();
		// 맵의 위치를 이동하기
		CameraUpdate update = CameraUpdateFactory.newLatLng(
				new LatLng(37.478911, 127.012339)); 
		// 설정한 맵의 위치로 이동
		mMap.moveCamera(update);
		
		// 확대 설정
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(15); 
		mMap.animateCamera(zoom);
		
		// 마커표시 
		MarkerOptions markOp = new MarkerOptions();
		markOp.position(new LatLng(37.479097, 127.011784));
		markOp.title("My Mark!");
		markOp.snippet("Test Snippet");
		
		// 마커를 추가하고 말풍선 표시한 것을 보여주도록 호출
		mMap.addMarker(markOp).showInfoWindow();
		
		// 마커에 리스너를 달아서 처리 하기
		mMap.setOnMarkerClickListener(new OnMarkerClickListener() {
			
			@Override
			public boolean onMarkerClick(Marker arg0) {
				Toast.makeText(getApplicationContext(),"Mark Clicked", 3000).show();
				return false;
			}
		});
	}

	

}
