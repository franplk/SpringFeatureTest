/**
 * 创建日期 : 2017年1月11日
 * 修改历史 :
 * 1. [2017年1月11日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.web.exception;

/**
 * @author {康培亮/AB052634}
 */
public class BussinessException extends AbstractBussinessException {

    private static final long serialVersionUID = 1L;

    private String errcode;
    private String errinfo;
    private Object data;

    @Deprecated
    public BussinessException () {}
    
    public BussinessException (String errcode, String errinfo) {
        this(errcode, errinfo, "");
    }
    
    public BussinessException (String errcode, String errinfo, Object data) {
        this.errcode = errcode;
        this.errinfo = errinfo;
        this.data = data;
    }
    
    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrinfo() {
        return errinfo;
    }

    public void setErrinfo(String errinfo) {
        this.errinfo = errinfo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
