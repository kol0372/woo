package control;

import action.Action;
import action.IndexAction;




//servlet이 직접적으로 접근하는 클래스***
//자원의 효율을 위해 ..동,싱
public class ActionFactory {

	private static ActionFactory factory;

	public static synchronized ActionFactory getFactory() {
		if (factory == null)
			factory = new ActionFactory();
		return factory;
	}
	// 컨트롤러와 모델사이에서 중간 관리 역할 을 하는 객체- 컨트롤러에게 요청을 받아
	//요청에 따른 해당모델을 수행할 주소값을 다시 c에게 전달해서 c가 주문한 값
	//(actionfoward_을 
	//돌려 받도록 관리한다.)
	//다형성/객체간의 결합도를 낮추기 위한 객체의 공장과 같은 objectfactory
	//요청응ㄹ 처리하고 핸들링하는 개념도 중요
	
	public Action makeAction(String query){
		Action action = null;
		if(query.equals("index")){
			action= new IndexAction();
		}
//		else if(query.equals("v1")){
//			//action= new ValueModel();
//		}
		return action;
	}

}
