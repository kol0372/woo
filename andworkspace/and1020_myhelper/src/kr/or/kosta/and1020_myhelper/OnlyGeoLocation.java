package kr.or.kosta.and1020_myhelper;

import android.app.Activity;
import android.app.Service;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

public class OnlyGeoLocation extends
Activity{
	
	LocationManager manager;
	TextView txtTime, txtBearing,txtSpeed,txtAltitude, txtProvider;
	
	String locationprovider;
	String provider;
	String str_my_latitude, str_my_longitude;
	
	LocationListener sLocationListener = null;
	Location location;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onlygeo);
		
		txtAltitude = (TextView) findViewById(R.id.altitude);
		txtSpeed = (TextView) findViewById(R.id.speed);
		txtBearing = (TextView) findViewById(R.id.bearing);
		txtTime = (TextView) findViewById(R.id.time);
		txtProvider =(TextView) findViewById(R.id.provider);
		
		if(manager == null){
			manager = (LocationManager)getSystemService(Service.LOCATION_SERVICE);
		}
		if(sLocationListener ==null){
			sLocationListener = new MyLocationLister();
		}
		
		Criteria criteria = new Criteria();
		criteria.setAccuracy(criteria.ACCURACY_FINE);
		criteria.setAltitudeRequired(true);
		criteria.setBearingRequired(true);
		criteria.setSpeedRequired(true);
		
		provider = manager.getBestProvider(criteria, true);
		
		manager.requestLocationUpdates(provider, 1000, 3, sLocationListener);
		location = manager.getLastKnownLocation(provider);
		
	}
	class MyLocationLister implements LocationListener{

		@Override
		public void onLocationChanged(Location location) {
			double latitude = location.getLatitude();
			double longitude = location.getLongitude();
			
			str_my_latitude = Double.toString(location.getLatitude());
			str_my_longitude = Double.toString(location.getLongitude());
			
			Double Altitude = location.getAltitude();
			float Speed = location.getSpeed();
			float Bearing = location.getBearing();
			long Time = location.getTime();
			
			txtTime.setText(String.valueOf(Time));
			txtBearing.setText(String.valueOf(Bearing));
			txtSpeed.setText(String.valueOf(Speed));
			txtAltitude.setText(String.valueOf(Altitude));
			
			
		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
