package cn.it.shop.action;

import cn.it.shop.model.Account;
import cn.it.shop.service.impl.AccountServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 14:18
 */
public class AccountAction extends ActionSupport{
    private AccountServiceImpl accountService;

    public String save(){
        Account account=new Account();
        account.setLogin("admin");
        account.setName("管理员");
        account.setPass("123");
        accountService.save(account);
        return SUCCESS;
    }

    public void setAccountService(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }
}
