package kr.or.android1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

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
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class Img extends Activity {

	private LinearLayout imgv;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.img);
		imgv = (LinearLayout) findViewById(R.id.woo);
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		//---------------------------이미지----------------------

		String url4 = "http://192.168.7.245:8084/server1016/board_json.jsp";

		ArrayList<NameValuePair> params4 = new ArrayList<NameValuePair>();
		params4.add(new BasicNameValuePair("store_no", "1"));
		JSONObject j = getHttpPost(url4, params4);
		
		try {
			URL url2 = new URL(j.getString("image"));
			HttpURLConnection conn = (HttpURLConnection) url2.openConnection();
			conn.setDoInput(true);
			conn.connect();
			Bitmap bitmap = BitmapFactory.decodeStream(conn.getInputStream());
			
			ImageView image = new ImageView(
					Img.this);
			image.setImageBitmap(bitmap);
			imgv.addView(image);
		} catch (JSONException e) {

			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public JSONObject getHttpPost(String url, ArrayList<NameValuePair> params) {
		HttpClient client = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		StringBuffer jsonQuery = new StringBuffer();
		JSONObject c = new JSONObject();
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

					JSONArray data = new JSONArray(jsonQuery.toString());

					for (int i = 0; i < data.length(); i++) {
						c = data.getJSONObject(i);

					}

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
		return c;
	}
}
