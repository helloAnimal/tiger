package cn.it.shop.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 16:23
 */
public class SendAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        return "send";
    }
}
