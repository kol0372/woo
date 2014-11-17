package kr.or.kosta.and1020_myhelper;

import java.io.IOException;
import java.util.List;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
//<uses-permission android:name="android.permission.INTERNET" />

public class Ex2_GeoCoding extends Activity {
	private Geocoder coder;
	private TextView result;
	private Button btn1, btn2;
	private EditText lattitude, longitude, address;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2);
		coder = new Geocoder(this);
		result = (TextView) findViewById(R.id.resText);
		btn1 = (Button) findViewById(R.id.ex2_btn1);
		btn2 = (Button) findViewById(R.id.ex2_btn2);
		lattitude = (EditText) findViewById(R.id.latitudeEditText);
		longitude = (EditText) findViewById(R.id.longitudeEditText);
		address = (EditText) findViewById(R.id.addressEditText);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// ������ �浵�� �ش��ϴ� �ּҵ��� ����Ʈ��
				// ��ȯ�ޱ� ���� List�� ����
				List<Address> list = null;
				String latt = lattitude.getText().toString().trim(); // ������
																		// �������ְ�
				String longi = longitude.getText().toString().trim();
				Log.d("lattitude", latt);
				Log.d("longitude", longi);
				try {
					list = coder.getFromLocation(Double.parseDouble(latt),
							Double.parseDouble(longi), 10); // 3��° ���ڴ�
															// maxResults����
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					result.setText(list.get(0).toString());
				}

			}
		});
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// �Ÿ��� �ش�Ǵ� �ּ��� ����Ʈ�� ��ȯ
				List<Address> list = null;
				try {
					list = coder.getFromLocationName(address.getText()
							.toString().trim(), 10);
					String ff = address.getText()
							.toString().trim();
					 Log.d("fffffffffffffff", ff);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					result.setText(list.get(0).toString());
				}
			}
		});
	}
}