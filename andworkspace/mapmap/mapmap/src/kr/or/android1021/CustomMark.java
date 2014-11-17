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
		// ���� ��ġ�� �̵��ϱ�
		CameraUpdate update = CameraUpdateFactory.newLatLng(new LatLng(
				37.478911, 127.012339));
	//	CameraUpdate update = CameraUpdateFactory.newLatLngZoom(new LatLng(37.478911, 127.012339), 16);

		// ������ ���� ��ġ�� �̵�
		mMap.moveCamera(update);

		// Ȯ�� ����
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
		mMap.animateCamera(zoom);

		// ��ũ �ɼǼ���
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
