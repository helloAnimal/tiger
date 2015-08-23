package cn.it.shop.action;

import cn.it.shop.model.Account;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 14:18
 */
@Controller
@Scope("prototype")
public class AccountAction extends BaseAction<Account>{

    public String save(){
        Account account=new Account();
        account.setLogin("admin");
        account.setName("管理员");
        account.setPass("123");
        accountService.save(account);
        System.out.println();
        return SUCCESS;
    }

    public String query(){
        request.put("accountList",accountService.query());
        session.put("accountList",accountService.query());
        application.put("accountList",accountService.query());
        return SUCCESS;
    }
    public String mainIndex(){
        return "mainIndex";
    }
}
