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
	//�̹����� �迭�� ����
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
		
		gv.setAdapter(new ImageAdapter(this)); //setAdapter: ������ Adapter 
		
		//�׸���� Ŭ�� �̺�Ʈ
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
	
	//Adapter�� Ŀ���� ����¡ �ϱ� ���ؼ� BaseAdapter(�߻�Ŭ����)�� ��ӹ޾Ƽ� ����Ŭ������ �����Ѵ�.
public class ImageAdapter extends BaseAdapter{
	
	private Context context; //�� Ŭ���� �ּҰ� = context 
	
	public ImageAdapter(Context context){
		this.context=context;
	}

	@Override
	public int getCount() { //�׸������ �ڷ��� ����.
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
		
		// �̹��� ��ü�� �����Ͽ�
		ImageView imageView;
		//�迭�κ��� �̹����� �о�ͼ� �̹����䰴ü�� ����
		//�並 �̱���(�ѹ���ó���Ѵ�.) ó��
		//������ view�϶��� �̹��� �並 �ʱ�ȭ�Ͽ� �����Ѵ�.
		if(convertview == null){ //convertview ������ ��
			imageView = new ImageView(context);
			//�׸������ ũ�⸦ �����ؼ� �̹������� ũ�⸦ ����
			imageView.setLayoutParams(new GridView.LayoutParams(110,110));
			//scale = ��ġ 
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			//���ʿ���
			imageView.setPadding(2, 2,2,2);
		}else{
			imageView = (ImageView) convertview;
		}
		
		imageView.setImageResource(arrImg[position]);
		//�並 �̱��� ó��
		return imageView;
	}
	
}
}
