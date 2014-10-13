package kr.or.kosta.and1013;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.provider.Telephony.Sms.Conversations;
import android.text.AlteredCharSequence;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Ex3_GridView extends Activity {
	private GridView gv;
	//이미지를 배열로 생성
	private int[] arrImg = {R.drawable.rwg, R.drawable.rwg2,  R.drawable.rwg3, R.drawable.rwg4, 
			R.drawable.rwg5, R.drawable.rwg6, R.drawable.rwg7, R.drawable.rwg8, R.drawable.rwg9,
			 R.drawable.rwg10};
	
	private AlertDialog.Builder builder; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ex3_gridview);
		gv =  (GridView) findViewById(R.id.gridView1);
		
		builder = new AlertDialog.Builder(this);
		
		gv.setAdapter(new ImageAdapter(this)); //setAdapter: 정보를 Adapter 
		
		//그리드뷰 클릭 이벤트
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				
				builder.setTitle("My Darling ^^");
				builder.setMessage("GGong you");
				builder.setIcon(arrImg[position]);
				
				builder.show();
			}
		});
		
		
		
		
	}
	
	//Adapter를 커스터 마이징 하기 위해서 BaseAdapter(추상클래스)를 상속받아서 내부클래스로 정의한다.
public class ImageAdapter extends BaseAdapter{
	
	private Context context; //이 클래스 주소값 = context 
	
	public ImageAdapter(Context context){
		this.context=context;
	}

	@Override
	public int getCount() { //그리드뷰의 자료의 갯수.
		// TODO Auto-generated method stub
		return arrImg.length;
	}

	@Override
	public Object getItem(int position) { 
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertview, ViewGroup parent) {
		
		// 이미지 객체를 생성하여
		ImageView imageView;
		//배열로부터 이미지를 읽어와서 이미지뷰객체와 결합
		//뷰를 싱글톤(한번만처리한다.) 처리
		//최초의 view일때만 이미지 뷰를 초기화하여 생성한다.
		if(convertview == null){ //convertview 현재의 뷰
			imageView = new ImageView(context);
			//그리드뷰의 크기를 설정해서 이미지뷰의 크기를 조정
			imageView.setLayoutParams(new GridView.LayoutParams(110,110));
			//scale = 위치 
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			//안쪽여백
			imageView.setPadding(2, 2,2,2);
		}else{
			imageView = (ImageView) convertview;
		}
		
		imageView.setImageResource(arrImg[position]);
		//뷰를 싱글톤 처리
		return imageView;
	}
	
}
}
