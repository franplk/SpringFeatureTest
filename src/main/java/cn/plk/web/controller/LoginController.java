/**
 * 创建日期 : 2017年1月11日
 * 修改历史 : 
 *     1. [2017年1月11日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.plk.web.param.LoginParam;
import cn.plk.web.service.LoginService;

/**
 * Login Controller
 * @author {康培亮/AB052634}
 */

@Controller
@RequestMapping("/auth")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

    @RequestMapping("/login")
    public ModelAndView helloView (LoginParam param) {
    	loginService.verifyUserInfo(param);
        return new ModelAndView("index");
    }
    
    @RequestMapping("/logout")
    public ModelAndView helloJson () {
        return new ModelAndView ("auth/login");
    }
}
