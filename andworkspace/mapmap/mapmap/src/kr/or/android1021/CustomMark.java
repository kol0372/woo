package kr.or.android1021;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class CustomMark extends FragmentActivity {
	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mMap = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.fragment)).getMap();
		// 맵의 위치를 이동하기
		CameraUpdate update = CameraUpdateFactory.newLatLng(new LatLng(
				37.478911, 127.012339));
	//	CameraUpdate update = CameraUpdateFactory.newLatLngZoom(new LatLng(37.478911, 127.012339), 16);

		// 설정한 맵의 위치로 이동
		mMap.moveCamera(update);

		// 확대 설정
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
		mMap.animateCamera(zoom);

		// 마크 옵션설정
		MarkerOptions markOp = new MarkerOptions();
		
		markOp.icon(BitmapDescriptorFactory.fromResource((R.drawable.marker)));
		markOp.anchor(0.0f, 1.0f);
		markOp.position(new LatLng(37.476097, 127.010784));

		mMap.addMarker(markOp);

		markOp.icon(BitmapDescriptorFactory.fromResource((R.drawable.marker)));
		markOp.anchor(0.0f, 1.0f);
		markOp.position(new LatLng(37.479097, 127.011784));

		mMap.addMarker(markOp);
	}

}
