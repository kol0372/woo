package ex1.kosta;

import org.apache.cordova.DroidGap;


import android.os.Bundle;


public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/map1.html");
	}

}
