package kr.or.kosta.and1020_myhelper;


import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Ex1_DBTest1 extends Activity {
	
	private EditText idtext, pswtext;
	private Button btn1, btn2;
	private MyDbHelper mHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helper);
		idtext = (EditText) findViewById(R.id.ex1_dbid);
		pswtext = (EditText) findViewById(R.id.ex_dbpsw);
		
		btn1 = (Button) findViewById(R.id.ex1_btn1);
		btn2= (Button) findViewById(R.id.ex1_btn2);
		
		mHelper = new MyDbHelper(this, "memo.db", null, 1);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db;
				ContentValues row;
				// TODO Auto-generated method stub
				db = mHelper.getWritableDatabase();
				
				row = new ContentValues();
				String idv = idtext.getText().toString();
				String pwdv = pswtext.getText().toString();
				
				row.put("mid", idv);
				row.put("pwd", pwdv);
				db.insert("memo", null, row);
				
				mHelper.close();
				
			}
		});
		
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Ex1_DBTest1.this,DBTest2.class);
				//Intent intent = new Intent(HomeWork.this, 
				//HomeWork2.class);
			}
		});
	}

}
