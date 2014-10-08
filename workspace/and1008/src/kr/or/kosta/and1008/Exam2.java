package kr.or.kosta.and1008;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Exam2 extends Activity implements OnClickListener {
	
	private Button btn1,btn2,btn3;
	private TextView total, user, cpu, win, Result,slnglul,sp ;
	private static int tot = 1;
    private int wi = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.exam2);
		
		btn1 = (Button)(findViewById(R.id.btn1));
		btn2 = (Button)(findViewById(R.id.btn2));
		btn3 = (Button)(findViewById(R.id.btn3));
		
		total = (TextView) findViewById(R.id.t);
		user = (TextView) findViewById(R.id.u);
		cpu = (TextView) findViewById(R.id.c);
		win = (TextView) findViewById(R.id.w);
		Result = (TextView) findViewById(R.id.result);
		slnglul=(TextView) findViewById(R.id.rs);
		sp=(TextView) findViewById(R.id.sp);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		
		
		
		
	}

	@Override
	public void onClick(View v) {
		if(v == btn1){
			  String cpuv = cpuvalue();
		        user.setText("hol");
		        total.setText(String.valueOf(tot++));
		        cpu.setText(cpuvalue());
		        win.setText(String.valueOf(wincnt(cpuv, "hol")));
		        Result.setText(compare(cpuv, "hol"));
			
		}else if(v == btn2){
			   String cpuv = cpuvalue();
		        user.setText("jjack");
		        total.setText(String.valueOf(tot++));
		        cpu.setText(cpuvalue());
		        win.setText(String.valueOf(wincnt(cpuv, "jjack")));
		        Result.setText(compare(cpuv, "jjack"));
			
		}else if(v == btn3){
			slnglul.setText(String.valueOf(winn(wi,tot)));
			sp.setText(gift(winn(wi,tot)));
			
			//System.exit(0);
		}
		
	}
	
	
//���� ����	
    public String cpuvalue(){
        int num = (int) (Math.random()*2)+1;
        if(num == 1){
            return "hol";
        }else{
            return "jjack";
    }
        
    }
    //�̱��
    public int wincnt(String cpu, String user){
        if(cpu.equals(user)){
            return ++wi;
        }else{
            return wi;
        }
    }
    //��
    public String compare(String cpu, String user){
        if(cpu.equals(user)){
            return "win";
        }else{
            return "lose";
        }
}
    //�·�
    public static int winn(int win, int total) {

    int rate = (int) (((double) win / total) * 100);

    return rate;
}
    //��ǰ
    public static String gift(int winNum) {
    String gMsg = "";
    if (winNum == 100) {
        gMsg = "ferari";
    } else if (winNum < 100 && winNum >= 70) {
        gMsg = "sonata2";
    } else if (winNum < 70 && winNum >= 40) {
        gMsg = "sonata";
    } else if (winNum < 40 && winNum >= 20) {
        gMsg = "ray";
    } else if (winNum < 20 && winNum >= 10) {
        gMsg = "car";
    } else {
        gMsg = "GGYANG";
    }
    return gMsg;
}
    //��Ż��
    public static int countTotal() {
    return tot++;
}

}