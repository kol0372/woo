package kr.or.kosta.and1016_http;

//이걸 발견할 수 있을까? 했찌..................
//DB에서 jsp가 받아서
//jsp를 가져옴.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ex2_PostLogin extends Activity {
	private EditText idv, pwdv;
	private Button btn1;
	private TextView text;

	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {

		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_post);

		// 퍼미션 strictMode
		// android.os.Build.VERSION.SDK_INT 기기버전 정보
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		idv = (EditText) findViewById(R.id.ex2_idtext);
		pwdv = (EditText) findViewById(R.id.ex2_pswtext);
		btn1 = (Button) findViewById(R.id.ex2_btn1);
		text = (TextView) findViewById(R.id.ex2_resText);
		
		
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String url = "http://192.168.7.245:8084/server1016/login.jsp";
				//parameter를 전송하기 위한 담당객체(NameValuePair)를 생성후 대입하자.
				ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
				
				params.add(new BasicNameValuePair("id", idv.getText().toString().trim()));
				params.add(new BasicNameValuePair("pwd", pwdv.getText().toString().trim()));
				
				text.setText(getHttpPost(url,params));
			}
		});
	}

	protected String getHttpPost(String url,
			ArrayList<NameValuePair> params) {
		HttpClient client = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		StringBuffer str = new StringBuffer();
		
		try {
			//post방식으로 파라미터 값들을 가진 객체를 세팅!
			httpPost.setEntity(new UrlEncodedFormEntity(params));
			HttpResponse response = client.execute(httpPost);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			
			
			if(statusCode == 200){
				InputStream content = response.getEntity().getContent();
				//스캐너 사용 input에서는 Scanner / output에서는 printwriter
				Scanner reader = new Scanner(content);
				
				String line = "";
				while(reader.hasNext()){
					line = reader.nextLine();
					str.append(line);
					 
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
