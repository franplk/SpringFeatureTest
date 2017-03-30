/**
 * 创建日期 : 2017年1月11日
 * 修改历史 :
 * 1. [2017年1月11日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.advice;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.plk.log.LogService;
import cn.plk.web.WebResult;
import cn.plk.web.exception.DataAccessException;
import cn.plk.web.exception.ViewAccessException;

/**
 * Controller Advice
 * 用于:
 * 1.统一异常处理----@ExceptionHandler
 * 2.执行Controller前，加入特定对象到Model--@ModelAttribute
 * 3.为Controller绑定数据转化类--@InitBinder
 * 
 * @author {康培亮/AB052634}
 */

@Component
@ControllerAdvice
public class MyControllerAdvice {

    private static String DATE_FORMAT = "yyyy-MM-dd HH24:mm:ss";

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        LogService.info("initBinder", "Advice");
        CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat(DATE_FORMAT), true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }

    @ModelAttribute
    public void modelInitial(ModelMap model) {
        LogService.info("modelInitial", "Advice");
        model.put("nowtime", new Date());
    }

    @ExceptionHandler(ViewAccessException.class)
    public ModelAndView handlerViewException(HttpServletRequest req, HttpServletResponse res, Exception e) {
        LogService.info(e.getMessage(), "Advice");
        return new ModelAndView("error/500");
    }

    @ResponseBody
    @ExceptionHandler(DataAccessException.class)
    public WebResult handlerDataException(HttpServletRequest req, HttpServletResponse res, Exception e) {
        LogService.info(e.getMessage(), "Advice");
        return new WebResult();
    }
}
