/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.lisener;

import org.springframework.context.ApplicationListener;

import cn.plk.lisener.event.CustomEvent;

/**
 * 用户自定义事件监听器
 * @author {康培亮/AB052634}
 */
public class CustomEventLisener implements ApplicationListener<CustomEvent> {

    /**
     * @see ApplicationListener#onApplicationEvent(ApplicationEvent)
     **/
    @Override
    public void onApplicationEvent(CustomEvent evt) {
        System.err.println("自定义事件类型发生");
    }

}
