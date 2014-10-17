package com.example.and1017_network;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.StringTokenizer;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

@SuppressLint("NewApi")
public class New_Semimock extends Activity {

	private Button btn;

	// ĵ���� ����
	private int x, y;
	private int[] colorList = { Color.RED, Color.GREEN, Color.YELLOW,
			Color.BLUE, Color.BLACK };
	private int[] sizeList = { 10, 15, 20, 25, 30 };
	private Spinner col, size; // �ڵ鸵 �ؾ���.
	private int color_s, size_s;
	private Style style_s, style;
	private String ip, port, nick;
	private int color, weight;

	// ��Ʈ��ũ
	private String proto1, proto2, proto3, proto4, proto5, proto6, proto7,
			proto8; // -> �迭�� �ϴ� �ٲ��.
	private StringTokenizer st;
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	private Handler networkHandler;

	private Grim view; // Ŀ���� ��.

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mock);

		// ��Ʈ��ũ �ڵ鷯 ����
		networkHandler = new Handler();

		// Thread Policy------------------------
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}


		LinearLayout ly = (LinearLayout) findViewById(R.id.layout_canvas);
		col = (Spinner) findViewById(R.id.spinner1);
		size = (Spinner) findViewById(R.id.spinner2);
		

		// Socket ����
		try {
			s = new Socket("192.168.7.245", 9999);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// View���� // �̳� Ŭ����
		view = new Grim(this, s);

		// �������� �����̳ʿ��� ����, ������Ʈ�� ��ġ.
		// ĵ������ �信 ��ġ�� �� �ִ�.
		ly.addView(view);

		// readLine Thead�� ������
		play();
		
		final ArrayAdapter<CharSequence> adspin= 
				ArrayAdapter.createFromResource(this, 
						R.array.ColorValue, 
						android.R.layout.simple_spinner_item);
		
		adspin.setDropDownViewResource(
				android.R.layout.simple_spinner_dropdown_item);
		
		//�ƴ�Ÿ �����ϱ�
		col.setAdapter(adspin);

		// ĵ���� ���� ���ǳ�
		col.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				color_s = colorList[position];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});
		
		final ArrayAdapter<CharSequence> adspin2= 
				ArrayAdapter.createFromResource(this, 
						R.array.SizeValue, 
						android.R.layout.simple_spinner_item);
		
		adspin2.setDropDownViewResource(
				android.R.layout.simple_spinner_dropdown_item);
		
		//�ƴ�Ÿ �����ϱ�
		size.setAdapter(adspin2);

		// ĵ���� ���� ���ǳ�
		size.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				size_s = sizeList[position];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});
	}

	private void play() {

		new Thread(new Runnable() {
			// ��Ʈ���� ���ؼ� �޾ƿ� ���������� �޾Ƴ�

			@Override
			public void run() {
				try {
					in = new BufferedReader(new InputStreamReader(
							s.getInputStream(), "UTF-8"));
					while (true) {

						String protocol = in.readLine();

						Log.d("Msg", protocol);

						st = new StringTokenizer(protocol, "/");

						// �������� ��������
						proto1 = st.nextToken();
						proto2 = st.nextToken();
						proto3 = st.nextToken();
						proto4 = st.nextToken();
						proto5 = st.nextToken();
						proto6 = st.nextToken();
						proto7 = st.nextToken();
						proto8 = st.nextToken();

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
