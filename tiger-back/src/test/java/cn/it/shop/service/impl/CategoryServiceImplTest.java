package cn.it.shop.service.impl;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 20:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-public.xml")
public class CategoryServiceImplTest {
    @Resource
    private CategoryService categoryService;
    @Test
    public void testQueryJoinAccount() throws Exception {
        List<Category> list=categoryService.queryJoinAccount("",1,2);
        for(Category tmp:list){
            System.out.println(tmp);
            System.out.println(tmp.getAccount());
        }
    }
}
