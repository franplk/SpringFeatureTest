/**
 * 创建日期 : 2017年1月10日
 * 修改历史 :
 * 1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.web.exception;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import cn.plk.log.LogService;
import cn.plk.web.WebResult;

/**
 * Spring全局异常处理类--方式一
 * 
 * @author {康培亮/AB052634}
 */
public class SpringExceptionResolver implements HandlerExceptionResolver {

    /**
     * @see HandlerExceptionResolver#resolveException(HttpServletRequest, HttpServletResponse, Object, Exception)
     **/
    @Override
    public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse res, Object obj, Exception e) {
        String msg = e.getMessage();
        LogService.debug(msg, "Exception");
        if (e instanceof DataAccessException) {
            msg = ((BussinessException) e).getErrinfo();
            WebResult result = new WebResult(msg);
            print(res, result);
        } else if (e instanceof ViewAccessException) {
            msg = e.getMessage();
        }
        return null;
    }
    
    private void print (HttpServletResponse res, WebResult result) {
        res.setContentType("application/json;charset=UTF-8");
        PrintWriter writer = null;
        try {
            writer = res.getWriter();
            writer.print(result);
            writer.flush();
        } catch (Exception e) {
            LogService.error("error", "ERROR");
        } finally {
            writer.close();
        }
    }

}
