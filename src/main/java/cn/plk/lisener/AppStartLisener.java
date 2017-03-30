/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.lisener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * 事件监听器
 * 好像是不起作用
 * @author {康培亮/AB052634}
 */
public class AppStartLisener implements ApplicationListener<ContextStartedEvent> {

    /**
     * @see ApplicationListener#onApplicationEvent(ApplicationEvent)
     **/
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.err.println("应用程序已经启动");
    }

}
