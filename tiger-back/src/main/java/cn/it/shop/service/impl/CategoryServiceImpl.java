package cn.it.shop.service.impl;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
import org.hibernate.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 * User:
 * Date: 2015/8/21
 * Time: 20:00
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService{

    @Override
    public List<Category> queryJoinAccount(String type,int page,int size) {
        String hql="from Category t left join fetch t.account where t.type like:type";
        Query query=getSession().createQuery(hql);
        query.setString("type","%"+type+"%");
        query.setFirstResult((page-1)*size+1);
        query.setMaxResults(size);
        return query.list();
    }
}
