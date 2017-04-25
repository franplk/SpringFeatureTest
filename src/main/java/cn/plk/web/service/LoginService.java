/**
 * 
 */
package cn.plk.web.service;

import org.springframework.stereotype.Service;

import cn.plk.web.exception.ViewAccessException;
import cn.plk.web.param.LoginParam;

/**
 * @author {康培亮/AB052634}
 *
 */
@Service
public class LoginService {

	public void verifyUserInfo(LoginParam param) {
		if (param.isEmpty()) {
			throw new ViewAccessException("UserName OR Password Is Empty");
		}
	}
}
