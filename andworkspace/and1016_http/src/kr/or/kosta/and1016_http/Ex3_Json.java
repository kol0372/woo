package kr.or.kosta.and1016_http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import kr.or.kosta.and1016_http.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
//Json��
public class Ex3_Json extends Activity {
	private Button btn1;
	private ListView listv;
	//simpleAdater : �����÷��� �������� �����س���.

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex3_jsondata);

		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		listv = (ListView) findViewById(R.id.ex3_listView);
		btn1 = (Button) findViewById(R.id.ex3_btn);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				searchData();

			}
		});

	}

	private void searchData() {
		
		StringBuffer jsonQuery = new StringBuffer();
		jsonQuery
				.append("[{'CustomerID':'C001','Name':'Win Weerachai','Email':'win.weerachai@thaicreate.com' ,'CountryCode':'TH','Budget':'1000000','Used':'600000'},");
		jsonQuery
				.append("{'CustomerID':'C002','Name':'John Smith','Email':'john.smith@thaicreate.com' ,'CountryCode':'EN','Budget':'2000000','Used':'800000'},");
		jsonQuery
				.append("{'CustomerID':'C003','Name':'Jame Born','Email':'jame.born@thaicreate.com' ,'CountryCode':'US','Budget':'3000000','Used':'600000'},");
		jsonQuery
				.append("{'CustomerID':'C004','Name':'Chalee Angel','Email':'chalee.angel@thaicreate.com' ,'CountryCode':'US','Budget':'4000000','Used':'100000'}]");
		//����--------------------------------------
		//json�����͸� URL�� �޾Ƽ� �Ѹ���-1�ܰ�(get�̵� post��)
		//2�ܰ�
		//andmember���� �׷�(a,b,c)�� �߰��ؼ� 20��(5,5,10) �־
		//spinner���� a�� ������ a�� �ش��ϴ� �ֵ� ������ ���̽����� �̾Ƽ� 
		//json���� �Ľ��ؼ� jsp���� Ȯ��
		//------------------------------------------------
		// jsonData�� �о� ���̴� ����
		// [{key:val},{},{}] = > JSONArray�� jsonData�� �о�;�
		// �ݺ������� �ϳ� �� JSonObject�� �о� ���� �� �ִ�.
		JSONArray data;
		//--------------simpleadater�� �����ϱ� ���� �����
		ArrayList<HashMap<String, String>> myaArrList = 
				new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map;
		//--------------simpleadater�� �����ϱ� ���� �����

		try {
			data = new JSONArray(jsonQuery.toString());
			for (int i = 0; i < data.length(); i++) {
				JSONObject c = data.getJSONObject(i);
				map = new HashMap<String, String>();
				map.put("CustomerID", c.getString("CustomerID"));
				map.put("Name", c.getString("Name"));
				map.put("Email", c.getString("Email"));
				map.put("CountryCode", c.getString("CountryCode"));
				map.put("Budget", c.getString("Budget"));
				map.put("Used", c.getString("Used"));
				myaArrList.add(map);

			}
			SimpleAdapter sAdapter;
			sAdapter = new SimpleAdapter
					(Ex3_Json.this, myaArrList, R.layout.ex3_column,
							new String[]{"CustomerID","Name","Email"},
							new int[]{R.id.colCustomerID,R.id.colName,R.id.colEmail});
			
			listv.setAdapter(sAdapter);
		} catch (JSONException e) {

			e.printStackTrace();
		}

	}

}
