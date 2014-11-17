package kr.or.kosta.test1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ExWebActivity extends Activity {
	private WebView wv;
	private AlertDialog.Builder builder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		wv = new WebView(this);
		setContentView(wv);

		WebSettings ws = wv.getSettings();
		ws.setJavaScriptEnabled(true);

		wv.setWebChromeClient(new MyWebChormeClient());

		wv.setWebViewClient(new MyWebViewClient());

		wv.loadUrl("http://192.168.7.245:8084/semi/pay.jsp");
		builder = new AlertDialog.Builder(this);
	}

	public class MyWebChormeClient extends WebChromeClient {
		

		@Override
		public void onProgressChanged(WebView view, int newProgress) {
			// TODO Auto-generated method stub
			super.onProgressChanged(view, newProgress);

		}

		@Override
		public boolean onJsAlert(WebView view, String url, String message,
				final JsResult result) {
			//Toast.makeText(view.getContext(), message, Toast.LENGTH_LONG)
			//		.show();
			//result.confirm();
			builder.setTitle("°æ°í").setMessage(message)
			.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					result.confirm();
					finish();
				}
			});
			AlertDialog dialog = builder.create();
			dialog.show();
			return true;// super.onJsAlert(view, url, message, result);
		}

	}

	public class MyWebViewClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO Auto-generated method stub
			return super.shouldOverrideUrlLoading(view, url);
		}

		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			// TODO Auto-generated method stub
			super.onPageStarted(view, url, favicon);
		}

		@Override
		public void onPageFinished(WebView view, String url) {
			// TODO Auto-generated method stub
			super.onPageFinished(view, url);
		}

	}

}
