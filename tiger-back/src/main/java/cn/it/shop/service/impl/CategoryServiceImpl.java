package cn.it.shop.service.impl;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
import cn.it.shop.util.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * 描述：
 * User:
 * Date: 2015/8/21
 * Time: 20:00
 */
public class CategoryServiceImpl implements CategoryService{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    /**
     * 没有整合时的情况
     */
    public void save(Category category) {
        //通过工具类获取session
        Session session=HibernateSessionFactory.getSession();
        try {
            session.getTransaction().begin();
            session.save(category);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }
    public void update(Category category){
        sessionFactory.getCurrentSession().update(category);
    }
}