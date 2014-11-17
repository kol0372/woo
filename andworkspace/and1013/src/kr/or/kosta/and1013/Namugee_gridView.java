package kr.or.kosta.and1013;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import android.provider.Telephony.Sms.Conversations;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Namugee_gridView extends Activity {
	private static final Builder Builder = null;
	private GridView gv;
	private int[] imgarr = {R.drawable.rwg, R.drawable.rwg2, R.drawable.rwg3, R.drawable.rwg4,
							R.drawable.rwg5, R.drawable.rwg6, R.drawable.rwg7, R.drawable.rwg8, 
							R.drawable.rwg9, R.drawable.rwg10 };
	
	private AlertDialog.Builder builder;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex3_gridview);
		
		gv = (GridView) findViewById(R.id.gridView1);
		builder = new AlertDialog.Builder(this);
		
		gv.setAdapter(new imagAdapter(this));
		
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				
				builder.setTitle("jong gyu");
				builder.setIcon(imgarr[position]);
				
			}
		});
		
	}
	
	public class imagAdapter extends BaseAdapter{
		
		private Context context;

	public imagAdapter(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imgarr.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ImageView imageView;
		
		if(arg1 == null){
			imageView = new ImageView(context);
			imageView.setLayoutParams(new GridView.LayoutParams(110,100));
			imageView.setPadding(2, 2, 2, 2);
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			
		}else{
			imageView = (ImageView)arg1;
		}
		imageView.setImageResource(imgarr[arg0]);
		
		return imageView;
	}
}
}
