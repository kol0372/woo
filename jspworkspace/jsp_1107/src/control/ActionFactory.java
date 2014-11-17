package control;

import action.Action;
import action.IndexModel;
import action.ValueModel;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

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
			action= new IndexModel();
		}else if(query.equals("v1")){
			action= new ValueModel();
		}
		return action;
	}

}