/**
 * 
 */
package cn.plk.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.plk.bean.TimerBean;
import cn.plk.web.WebResult;

/**
 * @author {康培亮/AB052634}
 *
 */
@Controller
@RequestMapping("/binder")
public class DataBinderTestController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	@ResponseBody
	@RequestMapping("/data")
	public WebResult helloJson(TimerBean timer) {
		return new WebResult("0000", "请求成功", timer);
	}

}
