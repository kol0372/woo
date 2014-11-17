package kr.or.kosta.and1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Paint.Style;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class InnerCanvas extends View {

	private Path path;
	private Paint paint;
	private ArrayList<Path> pathList;
	private ArrayList<Paint> paintList;
	private int color, weight;
	private String motion;
	private int color_s, size_s;
	private BufferedReader in;
	private PrintWriter out;
	private Socket s;
	private float x, y; // 그림 좌표
	private Handler networkHandler;

	// 네트워크 프로토콜
	private String proto1, proto2, proto3, proto4, proto5, proto6, proto7,
			proto8;

	public InnerCanvas(Context context, Socket s) {
		super(context);
		this.s = s;
		// 초기화:선을 그릴 때 사용될 객체
		path = new Path();
		paint = new Paint();
		// 소켓으로부터 연결된 스트림을 초기화
		try {
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),
					true);
			// 인코딩 해.....
			in = new BufferedReader(new InputStreamReader(s.getInputStream(),
					"UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		networkHandler = new Handler();
		t.start();
	}

	@Override
	protected void onDraw(Canvas canvas) {

		super.onDraw(canvas);
		setBackgroundColor(Color.WHITE);// 배경색
		paint.setAntiAlias(true);// 선 부드럽게

		paint.setColor(Color.RED);
		paint.setStrokeWidth(20);// 선크기
		paint.setStyle(Style.STROKE);// 선
		color_s = Color.BLACK;// 선색상
		size_s = 10;
		
		canvas.drawPath(path, paint);//
		
	}
	
	//Touch일때 x,y값을 얻어내자.
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		StringBuffer sb = new StringBuffer();
		//터치시 좌표 얻기
		float x= event.getX();
		float y = event.getY();
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			motion = "start";
			
		}else if (event.getAction() == MotionEvent.ACTION_MOVE){
			motion = "drag";
		}
		//room/chat
		//room/draw/color_s/x/y/size/writer
		sb.append("room/draw/").append(color_s).append("/");
		sb.append(x).append("/").append(y).append("/");
		sb.append(motion).append("/").append(size_s).append("/");
		sb.append("writer");
		//서버로 전송하기.
		out.println(sb.toString());
		
		
		return true;
	}
	Thread t = new Thread(new Runnable() {
		//스트림 통해서 박아온 프로토콜을 받아냄.
		
		@Override
		public void run() {
			try {
				while(true){
					//읽어온 서버 메세지를 분석
					String protocol = in.readLine();
					StringTokenizer st = new StringTokenizer(protocol, "/");
					proto1 = st.nextToken();
					proto2 = st.nextToken();
					proto3 = st.nextToken();
					proto4 = st.nextToken();
					proto5 = st.nextToken();
					proto6 = st.nextToken();
					proto7 = st.nextToken();
					proto8 = st.nextToken();
					
					//UI핸들러 하기위함.
					networkHandler.post(new  Runnable() {
						public void run() {
							if(proto1.equals("room")&proto2.equals("draw")){
								Log.d("Msg", proto1+ "," +proto2);
								if(proto3.equals("RED")){
									color = Color.RED;
								}else{
									color = Color.BLUE;
								}
								weight = 10;
								x = Float.parseFloat(proto4);
								y = Float.parseFloat(proto5);
								if(proto6.equals("start")){
									path.moveTo(x, y);
								}else if(proto7.equals("drag")){
									path.moveTo(x, y);
								}
								invalidate();
							}
						}
					});
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	});

}
