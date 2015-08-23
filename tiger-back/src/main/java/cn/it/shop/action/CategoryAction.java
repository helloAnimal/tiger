package cn.it.shop.action;

import cn.it.shop.model.Category;
import cn.it.shop.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 9:29
 */
@Controller
@Scope("prototype")
public class CategoryAction extends ActionSupport{
    @Resource
    private CategoryServiceImpl categoryService;
    private Category category;

    public String update(){
        System.out.println("-------update------");
        categoryService.update(category);
        return SUCCESS;
    }

    public String delete(){
        System.out.println("------delete-------");
        categoryService.delete(category.getId());
        return SUCCESS;
    }

//    public String query(){
//        categoryService.queryJoinAccount(category.getType());
//        return "send";
//    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
