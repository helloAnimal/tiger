package cn.it.shop.service;

import cn.it.shop.model.Category;

import java.util.List;

/**
 * 描述：
 * User:
 * Date: 2015/8/21
 * Time: 19:59
 */
public interface CategoryService extends BaseService<Category>{
    public List<Category> queryJoinAccount(String type);
}
