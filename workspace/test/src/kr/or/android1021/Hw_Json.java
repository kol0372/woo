package kr.or.android1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.test.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Hw_Json extends Activity {
	private ListView listv;
	private Spinner sp;
	

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.hwjson);
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		
		sp = (Spinner) findViewById(R.id.hw_spin);
		listv = (ListView) findViewById(R.id.hw_listview);
		final ArrayAdapter<CharSequence> adspin = 
				ArrayAdapter.createFromResource(this, 
						R.array.list1, android.R.layout.simple_spinner_item);
		adspin.setDropDownViewResource(
				android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adspin);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				if(position >0) {
					String url = "http://192.168.7.245:8084/server1016/store_json.jsp";
					//http://localhost:8084/server1016/store_json.jsp
					ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
					params.add(new BasicNameValuePair
							("store_no",adspin.getItem(position).toString().trim()));
					getHttpPost(url,params);
				}				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
			
	}
	
	

	public void getHttpPost(String url,
			ArrayList<NameValuePair> params) {
		HttpClient client = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		StringBuffer jsonQuery = new StringBuffer();
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(params));
			HttpResponse response = client.execute(httpPost);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			if (statusCode == 200) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				BufferedReader br = new BufferedReader(new InputStreamReader(
						content));

				String m = "";
				while ((m = br.readLine()) != null) {
					jsonQuery.append(m).append("\r\n");
				}
				
				try {
					ArrayList<HashMap<String, String>> myArrayList = new ArrayList<HashMap<String, String>>();
					HashMap<String, String> map;
					JSONArray data = new JSONArray(jsonQuery.toString());
					for (int i = 0; i < data.length(); i++) {
						JSONObject c = data.getJSONObject(i);
						map = new HashMap<String, String>();
						map.put("store_no", c.getString("store_no"));
						map.put("store_name", c.getString("store_name"));
						map.put("store_image", c.getString("store_image"));
						map.put("store_avgpoint", c.getString("store_avgpoint"));
						map.put("store_address", c.getString("store_address"));
						map.put("store_time", c.getString("store_time"));
						map.put("store_delivery_location", c.getString("store_delivery_location"));
						map.put("store_tel", c.getString("store_tel"));
						map.put("store_category", c.getString("store_category"));
						map.put("store_avg_delivery_time", c.getString("store_avg_delivery_time"));
						
						myArrayList.add(map);
					}
					SimpleAdapter sAdapter = new SimpleAdapter(Hw_Json.this,
							myArrayList, R.layout.hw_columm, 
							//컬럼네임
							new String[] {"store_no", "store_name" }, 
							//레이아웃에 id
							new int[] {R.id.image, R.id.up});
					listv.setAdapter(sAdapter);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				Log.d("Error", "접속실패!");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}