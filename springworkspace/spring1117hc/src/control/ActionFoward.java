package control;

// ���� ���� �� ó�� ����� ��ȯ�� �������� ����� Ŭ���� 
public class ActionFoward {
	private String url; // ���� ���� �� �̵��� view�� ���
	private boolean method; // ���� ���� �� ������ �̵���� : redirect, forward

	public ActionFoward() {

	}

	public ActionFoward(String url, boolean method) {
		super();
		this.url = url;
		this.method = method;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isMethod() {
		return method;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}

}
