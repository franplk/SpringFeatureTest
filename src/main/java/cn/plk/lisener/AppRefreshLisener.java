/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.lisener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 事件监听器
 * @author {康培亮/AB052634}
 */
public class AppRefreshLisener implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * @see ApplicationListener#onApplicationEvent(ApplicationEvent)
     **/
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.err.println("更新应用程序已经完成");
    }

}
