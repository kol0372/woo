package kr.or.kosta.and1013;

import java.util.ArrayList;
import java.util.HashMap;

import kr.or.kosta.and1013.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class Ex2_ListView extends Activity {
	private ListView listv;

	@Override
	protected void onCreate(Bundle savedInstanceState)  {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ex2_listview);

		listv = (ListView) findViewById(R.id.ex2_list);
		// 들어갈 데이터

		final ArrayList<HashMap<String, String>> myList = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> map;
		map = new HashMap<String, String>();
		map.put("MemberID", "Aman1");
		map.put("Name", "KimWoori1");
		map.put("Tel", "010-7777-7771");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman2");
		map.put("Name", "KimWoori2");
		map.put("Tel", "010-7777-7772");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman3");
		map.put("Name", "KimWoori3");
		map.put("Tel", "010-7777-7773");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman4");
		map.put("Name", "KimWoori4");
		map.put("Tel", "010-7777-7774");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman4");
		map.put("Name", "KimWoori4");
		map.put("Tel", "010-7777-7774");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman5");
		map.put("Name", "KimWoori5");
		map.put("Tel", "010-7777-7775");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman6");
		map.put("Name", "KimWoori6");
		map.put("Tel", "010-7777-7776");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman7");
		map.put("Name", "KimWoori7");
		map.put("Tel", "010-7777-7777");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman4");
		map.put("Name", "KimWoori4");
		map.put("Tel", "010-7777-7774");
		myList.add(map);

		map = new HashMap<String, String>();
		map.put("MemberID", "Aman9");
		map.put("Name", "KimWoori9");
		map.put("Tel", "010-7777-7779");
		myList.add(map);
		//simpleadapter : xm1에 데이터를 쉽게 배치 적용할 수 있다.
		//simpleAdapter(context, data, 배열될에이아웃resource,
		//data에서 읽어올 키 값을 배열로 지정,
		//배치될 레이아웃 리소스에서 컬럼값을 id로 지정);
		SimpleAdapter sAdapter = null;
		sAdapter = new SimpleAdapter(this, myList, R.layout.ex2_column,
				new String[] { "MemberID", "Name", "Tel", }, new int[] {
						R.id.ex2_memID, R.id.ex2_memName, R.id.ex2_memTel });
		//listview에 세팅
		listv.setAdapter(sAdapter);
		
		listv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				HashMap<String, String> map = myList.get(position);
				
				String idv = map.get("MemberID");
				String namev = map.get("Name");
				String telv = map.get("Tel");
				
				StringBuffer s = new StringBuffer();
				s.append(idv).append("/").append(namev).append("/").append(telv);
				
				//Toast.makeText(Ex2_ListView.this, s.toString(), 3000).show();
				
				Intent intent = new Intent(Ex2_ListView.this, Ex2_result.class);
				
				Bundle myBundle = new Bundle();
				
				myBundle.putString("key", s.toString());
				
				intent.putExtras(myBundle);
				
				startActivity(intent);
				
			}
		});
		
		
		
		
		
	}

}
