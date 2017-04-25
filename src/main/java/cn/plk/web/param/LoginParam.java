/**
 * 
 */
package cn.plk.web.param;

import java.io.Serializable;

/**
 * @author {康培亮/AB052634}
 *
 */
public class LoginParam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEmpty() {
		return null == username || null == password;
	}
}
