/**
 * 创建日期 : 2017年1月11日
 * 修改历史 :
 * 1. [2017年1月11日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.web;

import java.io.Serializable;

/**
 * Json 形式的Web请求结果封装
 * 
 * @author {康培亮/AB052634}
 */
public class WebResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String desc;
    private Object data;

    public WebResult () {}
    
    public WebResult (String code) {
        this(code, "");
    }
    
    public WebResult (String code, String desc) {
        this(code, desc, "");
    }
    
    public WebResult (String code, String desc, Object data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
