package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionFoward;

public class ActionForm implements Action{
	private String url;
	private boolean method;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}

	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		return new ActionFoward(url,method);
	}

}
