package cn.it.shop.action;

import cn.it.shop.model.Category;
import cn.it.shop.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 9:29
 */
public class CategoryAction extends ActionSupport{
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

    public void setCategoryService(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
