package control;

import action.Action;
import action.BoardAddModel;
import action.BoardForm;
import action.BoardList;
import action.BoardListModel;
import action.ElModel;
import action.ElModel2;
import action.IndexModel;


// Servlet�� ���������� �����ϴ� Ŭ���� *****
public class ActionFactory {
	private static ActionFactory factory;

	public static synchronized ActionFactory getFactory() {
		if(factory == null) factory = new ActionFactory();
		return factory;
	}
	// ��Ʈ�����ÿ� �𵨻��̿��� �߰� ���� ������ �ϴ� ��ü  - C���Լ� ���� ��û�� �޾Ƽ� 
	// �ش� ���� ������ �ּҰ��� �ٽ� C���� �����ؼ�  C�� �ֹ��� ��(ActionForward)�� 
	// ���� �޵��� �����ϴ� ������ �Ѵ�.
	// -- ������/ ��ü���� ���յ��� ���߱����� ��ü�� ����� ���� ObjectFactory 
	// ��û�� ó���ϰ� �ڵ鸵�ϴ� ���䵵 �߿���.
	public Action makeAction(String query){
		Action action = null;
		if(query.equals("index")){
			action = new IndexModel();
		}else if(query.equals("boardList")){
			action = new BoardListModel();
		}else if(query.equals("boardForm")){
			action = new BoardForm();
		}else if(query.equals("boardAdd")){
			action = new BoardAddModel();
		}else if(query.equals("el")){
			action = new ElModel();
		}else if(query.equals("el2")){
			action = new ElModel2();
		}
		return action;
	}
	
}