/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.lisener;

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * 时间监听器
 * @author {康培亮/AB052634}
 */
public class RequestHandledLisener implements ApplicationListener<RequestHandledEvent> {

    /**
     * @see ApplicationListener#onApplicationEvent(ApplicationEvent)
     **/
    @Override
    public void onApplicationEvent(RequestHandledEvent event) {
        
    }

}
