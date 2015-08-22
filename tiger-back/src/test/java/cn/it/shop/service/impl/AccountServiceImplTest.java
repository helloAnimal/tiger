package cn.it.shop.service.impl;

import cn.it.shop.model.Account;
import cn.it.shop.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 21:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-public.xml")
public class AccountServiceImplTest {
    @Resource
    private AccountService accountService;
    @Test
    public void testGet() {
        Account account = accountService.get(1);
        System.out.println(account.getName());
    }
}
