package cn.it.shop.action;

import cn.it.shop.model.Category;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 9:29
 */
@Controller
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {

    /**
     * 分页查询
     *
     * @return json数据格式
     */
    public String queryJoinAccount() {
        try {
            List<Category> categoryList = categoryService.queryJoinAccount(model.getType(), page, rows);
            pageMap = new HashMap<String, Object>();
            pageMap.put("rows", categoryList);
            pageMap.put("total", categoryService.getCount(model.getType()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "jsonMap";
    }

    public String deleteByIds() {
        int count = categoryService.deleteByIds(ids);
        inputStream = new ByteArrayInputStream("true".getBytes());
        return "stream";
    }

    public String save(){
        categoryService.save(model);
        return null;
    }


    public String update() {
        Category category = new Category();
        System.out.println("-------update------");
        categoryService.update(category);
        return SUCCESS;
    }

    public String delete() {
        Category category = new Category();
        System.out.println("------delete-------");
        categoryService.delete(category.getId());
        return SUCCESS;
    }


}
