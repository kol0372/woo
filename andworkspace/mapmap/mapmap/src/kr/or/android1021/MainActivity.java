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
		// ���� ��ġ�� �̵��ϱ�
		CameraUpdate update = CameraUpdateFactory.newLatLng(
				new LatLng(37.478911, 127.012339)); 
		// ������ ���� ��ġ�� �̵�
		mMap.moveCamera(update);
		
		// Ȯ�� ����
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(15); 
		mMap.animateCamera(zoom);
		
		// ��Ŀǥ�� 
		MarkerOptions markOp = new MarkerOptions();
		markOp.position(new LatLng(37.479097, 127.011784));
		markOp.title("My Mark!");
		markOp.snippet("Test Snippet");
		
		// ��Ŀ�� �߰��ϰ� ��ǳ�� ǥ���� ���� �����ֵ��� ȣ��
		mMap.addMarker(markOp).showInfoWindow();
		
		// ��Ŀ�� �����ʸ� �޾Ƽ� ó�� �ϱ�
		mMap.setOnMarkerClickListener(new OnMarkerClickListener() {
			
			@Override
			public boolean onMarkerClick(Marker arg0) {
				Toast.makeText(getApplicationContext(),"Mark Clicked", 3000).show();
				return false;
			}
		});
	}

	

}
