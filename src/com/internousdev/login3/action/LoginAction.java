package com.internousdev.login3.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login3.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String username;
	private String password;

	private Map<String, Object> session;

	public String execute(){
		String ret = ERROR;
		LoginDAO dao=new LoginDAO();
///////ＤＴＯ使用時に書き加えた１行
//		LoginDTO dto=new LoginDTO();
///////////////////////////////////
//↓LoginDAOのselectメソッドの戻り値（値をDBから正常に取得できていればtrue）を変数bに代入
		boolean b = dao.select(username, password);
		if(b==true){
			if(username.equals(this.username))
				if(password.equals(this.password)){
					ret = SUCCESS;
				}
			}
		return ret;
	}
	/**
	 * <p>VALUESTACKに登録されたセッション情報を取得してフィールドに登録します。</p>
	 * @return セッション情報 session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * <p>フィールドに登録されたユーザ名をVALUE STACKに登録します。<br>
	 * VALUE STACKに登録されたユーザ名は次の画面へ引き継がれます。</p>
	 * @param session セッション情報
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
