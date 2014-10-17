package kr.or.kosta.and1016_http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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



public class Ex1_GetToday extends Activity{
	private Button btn1;
	private TextView result;
	
	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ex1_http);
		
		//�۹̼� strictMode
		//android.os.Build.VERSION.SDK_INT ������ ����
		if(android.os.Build.VERSION.SDK_INT > 9){
			StrictMode.ThreadPolicy policy = 
					new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		btn1 = (Button) findViewById(R.id.ex1_btn1);
		result = (TextView) findViewById(R.id.ex1_testres);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//������ url
				String url = "http://192.168.7.245:8084/server1016/ex3_jsondata.jsp";
				result.setText(getHttpGet(url));//192.168.7.245
			}
		});
	}
	//get����� ó���ϱ� ���� �޼���
	public String getHttpGet(String url){
		//1. httpClient ��ü ����
		HttpClient client = new DefaultHttpClient();
		StringBuffer str = new StringBuffer();
		//2.���۹�� ����
		HttpGet httpGet = new HttpGet(url);
		//3.response ��ü�� �޾��ش�.
		
		try {
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			
			//404 �������� ����
			//500 ��Ÿ...
			//200 ����
			
			if(statusCode == 200){
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				//������ 2�� ��Ʈ���� ����ؼ� ������ ���
				//StringBuffer�� �����Ͻÿ�. 
				BufferedReader br = new BufferedReader
						(new InputStreamReader(content));
				String c = "";
				while((c=br.readLine()) != null){
					 str.append(c).append("\r\n");
				}
				
			}else{
				Log.d("Error", "���ӽ���");
				
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str.toString();
	}

}
