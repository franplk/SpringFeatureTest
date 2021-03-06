/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.lisener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * 时间监听器
 * @author {康培亮/AB052634}
 */
public class AppClosedLisener implements ApplicationListener<ContextClosedEvent> {

    /**
     * @see ApplicationListener#onApplicationEvent(ApplicationEvent)
     **/
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.err.println("应用程序已经关闭");
    }

}
