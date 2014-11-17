package kr.or.android1021;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Service;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class PlaceMapFragment extends FragmentActivity {
	LocationManager manager;

	LatLng MYLOC;

	String locationprovider;
	String provider;
	String str_my_latitude, str_my_longitude;
	LocationListener sLocationListener = null;
	Location location;
	private GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpsmap);
		googleMap = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.fragment1)).getMap();

		googleMap.setMyLocationEnabled(true);
		if (manager == null) {
			manager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
		}
		if (sLocationListener == null) {
			sLocationListener = new MyLocationListener();
		}
		Criteria criteria = new Criteria();
		criteria.setAccuracy(Criteria.ACCURACY_FINE);
		criteria.setAltitudeRequired(true);
		criteria.setBearingRequired(true);
		criteria.setSpeedRequired(true);

		provider = manager.getBestProvider(criteria, true);
		// 주기거리감지자 초당 미터 거리 // provider, , , , 3 3
		manager.requestLocationUpdates(provider, 3000, 3, sLocationListener);

		location = manager.getLastKnownLocation(provider);
	}

	class MyLocationListener implements LocationListener {
		public void onLocationChanged(Location location) {
			double latitude = location.getLatitude();
			// Getting longitude of the current location
			double longitude = location.getLongitude();

			str_my_latitude = Double.toString(location.getLatitude());
			str_my_longitude = Double.toString(location.getLongitude());
			LatLng gpsValue = new LatLng(location.getLatitude(),
					location.getLongitude());
			googleMap.moveCamera(CameraUpdateFactory
					.newLatLngZoom(gpsValue, 15));

			Double Altitude = location.getAltitude();
			float Speed = location.getSpeed();
			float Bearing = location.getBearing();
			long Time = location.getTime();
			MarkerOptions markOp = new MarkerOptions();
			markOp.position(gpsValue);
			markOp.title("My Mark!");
			markOp.snippet("Test Snippet");
			// 마커를 추가하고 말풍선 표시한 것을 보여주도록 호출 //
			googleMap.addMarker(markOp);

		}

		public void onProviderDisabled(String provider) {

		}

		public void onProviderEnabled(String provider) {

		}

		public void onStatusChanged(String provider, int status, Bundle extras) {
		}
	}
}
