package kr.or.kosta.and1020_myhelper;

//완전 멋쟁이!!

import android.app.Activity;
import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

public class Tabtest extends TabActivity {

	TabHost tabHost;
	TextView tv, untv, txtview;
	LinearLayout ll;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bjo);

//		addImgText();

		tabHost = (TabHost) findViewById(R.id.tabMode);
		tabHost = getTabHost();

		TabSpec spec1 = tabHost.newTabSpec("tag 1").setIndicator("정보");
		spec1.setContent(R.id.tab1);
		// 탭추가
		tabHost.addTab(spec1);

		TabSpec spec2 = tabHost.newTabSpec("tag 2").setIndicator("리뷰");
		spec2.setContent(R.id.tab2);
		tabHost.addTab(spec2);

		TabSpec spec3 = tabHost.newTabSpec("tag 2").setIndicator("지도");
		spec3.setContent(R.id.tab3);
		tabHost.addTab(spec3);

		tabHost.setCurrentTab(0);

		tabHost.setOnTabChangedListener(new OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {

				for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {

					// 탭안된부분의 배경색
					tabHost.getTabWidget().getChildAt(i)
							.setBackgroundColor(Color.parseColor("#d0d0d0"));// unselected
					// 탭안된부분의 글씨색상과 사이즈
					untv = (TextView) tabHost.getTabWidget().getChildAt(i)
							.findViewById(android.R.id.title);
					untv.setTextColor(Color.parseColor("#000000"));
					untv.setTextSize(10);
				}
				// 탭된부분의 배경색
				tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab())
						.setBackgroundColor(Color.parseColor("#ee0000")); // selected
				// 탭된부분의 글씨색상과 사이즈
				tv = (TextView) tabHost.getTabWidget()
						.getChildAt(tabHost.getCurrentTab())
						.findViewById(android.R.id.title);
				tv.setTextColor(Color.parseColor("#ffffff"));
				tv.setTextSize(15);

			}
		});

	}

//	public void addImgText() {
//		ListView listv;
//		listv = (ListView) findViewById(R.id.listView1);
//
//		for(int i = 0; i < .length; i++){
//			
//		LinearLayout holl = new LinearLayout(Tabtest.this);
//		ll.addView(holl);
//		ll.setOrientation(LinearLayout.HORIZONTAL);
//		
//		if(이미지=true){
//			ImageView IG = new ImageView(Tabtest.this);
//			IG.setImageResource(R.drawable.sssssssssssssssssss);
//			holl.addView(IG);
//		}
//		
//		TextView text = new TextView(Tabtest.this);
//		text.setText("Ok");
//		holl.addView(text);
//		}
//	}

}
