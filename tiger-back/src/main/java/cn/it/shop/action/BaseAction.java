package cn.it.shop.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 14:51
 */
public class BaseAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
    protected Map<String,Object> request;
    protected Map<String,Object> session;
    protected Map<String,Object> application;
    @Override
    public void setRequest(Map<String, Object> request) {
        this.request=request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
    @Override
    public void setApplication(Map<String, Object> application) {
        this.application=application;
    }
}
