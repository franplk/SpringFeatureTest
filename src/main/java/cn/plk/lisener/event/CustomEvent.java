/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.lisener.event;

import org.springframework.context.ApplicationEvent;

/**
 * 用户自定义事件
 * @author {康培亮/AB052634}
 */
public class CustomEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public CustomEvent(Object source) {
        super(source);
    }

}
