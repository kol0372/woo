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
//Json문
public class Ex3_Json extends Activity {
	private Button btn1;
	private ListView listv;
	//simpleAdater : 세부컬럼을 나눴을때 생각해내자.

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
		//과제--------------------------------------
		//json데이터를 URL로 받아서 뿌리기-1단계(get이든 post든)
		//2단계
		//andmember에서 그룹(a,b,c)을 추가해서 20명(5,5,10) 넣어서
		//spinner에서 a를 누르면 a에 해당하는 애들 데이터 베이스에서 뽑아서 
		//json으로 파싱해서 jsp에서 확인
		//------------------------------------------------
		// jsonData를 읽어 들이는 동작
		// [{key:val},{},{}] = > JSONArray로 jsonData를 읽어와야
		// 반복문으로 하나 씩 JSonObject로 읽어 들일 수 있다.
		JSONArray data;
		//--------------simpleadater에 저장하기 위한 저장소
		ArrayList<HashMap<String, String>> myaArrList = 
				new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map;
		//--------------simpleadater에 저장하기 위한 저장소

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
