package cn.it.shop.service.impl;

import cn.it.shop.service.BaseService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 11:04
 */
@Service
@Lazy(true)
public class BaseServiceImpl<T> implements BaseService<T> {
    private Class clazz;
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public BaseServiceImpl() {
        Type genType=this.getClass().getGenericSuperclass();
        if(genType instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType) genType;
            clazz = (Class) parameterizedType.getActualTypeArguments()[0];
        }else {
            clazz=Object.class;
        }
    }

    @Override
    public void save(T t) {
        getSession().save(t);
    }

    @Override
    public void update(T t) {
        getSession().update(t);
    }

    @Override
    public void delete(int id) {
        String hql = "delete " + clazz.getSimpleName() + " where id=:id";
        Query query = getSession().createQuery(hql);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public T get(int id) {
        return (T) getSession().get(clazz, id);
    }

    @Override
    public List<T> query() {
        String hql = "from " + clazz.getSimpleName();
        return getSession().createQuery(hql).list();
    }

}
