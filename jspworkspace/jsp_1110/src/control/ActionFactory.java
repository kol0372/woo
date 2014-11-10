package control;

import action.Action;
import action.IndexAction;




//servlet�� ���������� �����ϴ� Ŭ����***
//�ڿ��� ȿ���� ���� ..��,��
public class ActionFactory {

	private static ActionFactory factory;

	public static synchronized ActionFactory getFactory() {
		if (factory == null)
			factory = new ActionFactory();
		return factory;
	}
	// ��Ʈ�ѷ��� �𵨻��̿��� �߰� ���� ���� �� �ϴ� ��ü- ��Ʈ�ѷ����� ��û�� �޾�
	//��û�� ���� �ش���� ������ �ּҰ��� �ٽ� c���� �����ؼ� c�� �ֹ��� ��
	//(actionfoward_�� 
	//���� �޵��� �����Ѵ�.)
	//������/��ü���� ���յ��� ���߱� ���� ��ü�� ����� ���� objectfactory
	//��û���� ó���ϰ� �ڵ鸵�ϴ� ���䵵 �߿�
	
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
