package kr.or.kosta.and1016_http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

/* 코드오류 500 
 * 
 * 
 * 
 * Get방식으로 Http연결 하기
 * 
 * 1.표준 httpClient객체를 생성한다.(DefaultHttpClient 객체)
 * 2.전송방식에 따른 httpGet/httpPost를 결정
 *   Get방식이라면 httpget(전송항 url)객체를 생성
 * 3. url로 Get으로 전송, (httpselvlet)response 객체를 통해서 클라이언트가 받도록 구현
 * 4. 전송받은  Response를 통해서 서버의 상태값을 가져올 수 있다.(비교분석처리)
 * 5. 응답객체(Response)로 부터 Entity : 서버의 모든 자원을 가지고 있다.
 * 6. 데이터를 얻어내기 위해서 Entity가 제공해주는 InputStream을 받아서 사용할 수 있다.
 * 7. 
 */

public class Ex4_GetJson extends Activity {
	private Button btn1;
	private ListView listv;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex3_jsondata);

		// 퍼미션 strictMode
		// android.os.Build.VERSION.SDK_INT 기기버전 정보
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		btn1 = (Button) findViewById(R.id.ex3_btn);
		listv = (ListView) findViewById(R.id.ex3_listView);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 서버의 url

				// http://localhost:8084/server1016/ex3_jsondata.jsp
				String url = "http://192.168.7.245:8084/server1016/ex3_jsondata.jsp";
				//192.168.7.245
				getHttpGet(url);
			}
		});
	}

	public String getHttpGet(String url) {
		// 1. httpClient 객체 생성
		HttpClient client = new DefaultHttpClient();
		StringBuffer str = new StringBuffer();
		// 2.전송방식 결정

		HttpGet httpGet = new HttpGet(url);
		// 3.response 객체러 받아준다.

		try {
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();

			if (statusCode == 200) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				// 적절한 2차 스트림을 사용해서 내용을 모두
				// StringBuffer에 저장하시오.
				BufferedReader br = new BufferedReader(new InputStreamReader(
						content));
				String c = "";
				while ((c = br.readLine()) != null) {
					str.append(c).append("\r\n");
				}

				JSONArray data;
				ArrayList<HashMap<String, String>> myaArrList = new ArrayList<HashMap<String, String>>();
				HashMap<String, String> map;
				data = new JSONArray(str.toString());
				for (int i = 0; i < data.length(); i++) {
					JSONObject d = data.getJSONObject(i);
					map = new HashMap<String, String>();
					map.put("CustomerID", d.getString("CustomerID"));
					map.put("Name", d.getString("Name"));
					map.put("Email", d.getString("Email"));
					map.put("CountryCode", d.getString("CountryCode"));
					map.put("Budget", d.getString("Budget"));
					map.put("Used", d.getString("Used"));
					myaArrList.add(map);

				}
				SimpleAdapter sAdapter;
				sAdapter = new SimpleAdapter(Ex4_GetJson.this, myaArrList,
						R.layout.ex3_column, new String[] { "CustomerID",
								"Name", "Email" },
						new int[] { R.id.colCustomerID, R.id.colName,
								R.id.colEmail });

				listv.setAdapter(sAdapter);

			} else {
				Log.d("Error", "접속실패");

			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {

			e.printStackTrace();

		}
		return str.toString();
	}

}
