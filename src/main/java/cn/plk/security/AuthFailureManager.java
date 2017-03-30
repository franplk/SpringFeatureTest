/**
 * 创建日期 : 2017年1月12日
 * 修改历史 :
 * 1. [2017年1月12日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

/**
 * 认证成功后的处理逻辑
 * 
 * @author {康培亮/AB052634}
 */
public class AuthFailureManager implements AuthenticationFailureHandler {

    /**
     * @see AuthenticationFailureHandler#onAuthenticationFailure(HttpServletRequest, HttpServletResponse, AuthenticationException)
     **/
    @Override
    public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse res, AuthenticationException auth)
            throws IOException, ServletException {

    }

}
