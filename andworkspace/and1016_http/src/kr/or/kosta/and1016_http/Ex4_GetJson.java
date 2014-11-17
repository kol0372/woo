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

/* �ڵ���� 500 
 * 
 * 
 * 
 * Get������� Http���� �ϱ�
 * 
 * 1.ǥ�� httpClient��ü�� �����Ѵ�.(DefaultHttpClient ��ü)
 * 2.���۹�Ŀ� ���� httpGet/httpPost�� ����
 *   Get����̶�� httpget(������ url)��ü�� ����
 * 3. url�� Get���� ����, (httpselvlet)response ��ü�� ���ؼ� Ŭ���̾�Ʈ�� �޵��� ����
 * 4. ���۹���  Response�� ���ؼ� ������ ���°��� ������ �� �ִ�.(�񱳺м�ó��)
 * 5. ���䰴ü(Response)�� ���� Entity : ������ ��� �ڿ��� ������ �ִ�.
 * 6. �����͸� ���� ���ؼ� Entity�� �������ִ� InputStream�� �޾Ƽ� ����� �� �ִ�.
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

		// �۹̼� strictMode
		// android.os.Build.VERSION.SDK_INT ������ ����
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
				// ������ url

				// http://localhost:8084/server1016/ex3_jsondata.jsp
				String url = "http://192.168.7.245:8084/server1016/ex3_jsondata.jsp";
				//192.168.7.245
				getHttpGet(url);
			}
		});
	}

	public String getHttpGet(String url) {
		// 1. httpClient ��ü ����
		HttpClient client = new DefaultHttpClient();
		StringBuffer str = new StringBuffer();
		// 2.���۹�� ����

		HttpGet httpGet = new HttpGet(url);
		// 3.response ��ü�� �޾��ش�.

		try {
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();

			if (statusCode == 200) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				// ������ 2�� ��Ʈ���� ����ؼ� ������ ���
				// StringBuffer�� �����Ͻÿ�.
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
				Log.d("Error", "���ӽ���");

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
