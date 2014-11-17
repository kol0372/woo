package kr.or.kosta.and1013;

import kr.or.kosta.and1013.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Ex1_ListView extends Activity {
	
	private ListView listv;
	private String[] cars={"sm3", "sm5" ,"sm7", "SONATA", 
			"AVANTE", "SOUL","SOUL2"} ;
	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex1_listview);
		listv = (ListView) findViewById(R.id.ex1_list);
		text = (TextView) findViewById(R.id.ex1_text);
		//spinner와 마찬가지로 listview에도 cars란 배열의 데이터를 표현하기 위해서 
		//adapter가 필여하다.
		ListAdapter adapter = new ArrayAdapter<String>
		(this, android.R.layout.simple_list_item_1,cars);
		listv.setAdapter(adapter);
		
		listv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> 
			parent, View view, int position, long id) {
				
				
				// textview에 선택한 아이템의 값을 출력하시오.
				
				text.setText(cars[position]);
				
			}
		});
	}

}
