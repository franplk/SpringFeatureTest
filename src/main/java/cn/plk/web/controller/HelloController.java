/**
 * 创建日期 : 2017年1月11日
 * 修改历史 : 
 *     1. [2017年1月11日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.plk.web.WebResult;

/**
 * Hello Controller
 * @author {康培亮/AB052634}
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/view")
    public ModelAndView helloView () {
        return new ModelAndView("hello/index");
    }
    
    @ResponseBody
    @RequestMapping("/json")
    public WebResult helloJson () {
        return new WebResult ("0000", "请求成功", "Hello, World!");
    }
}
