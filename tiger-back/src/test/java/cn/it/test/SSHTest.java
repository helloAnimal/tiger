package cn.it.test;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
import cn.it.shop.service.impl.CategoryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 描述：spring 注解3.1和以后的版本才有作用
 * User:
 * Date: 2015/8/16
 * Time: 17:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-public.xml")
public class SSHTest {
    @Resource
    private Date date;
    @Resource
    private CategoryService categoryService;
    @Test
    public void springIoc(){
        System.out.println(date);
    }
//    @Test
//    public void hibernate(){
//        CategoryService categoryService=new CategoryServiceImpl();
//        Category category=new Category();
//        category.setType("男士休闲");
//        category.setHot((byte) 1);
//        categoryService.save(category);
//    }
//
    @Test
    public void hibernateAndSpring(){
        Category category=new Category();
        category.setId(1);
        category.setType("女士休闲");
        category.setHot((byte) 2);
        categoryService.update(category);
    }
}
