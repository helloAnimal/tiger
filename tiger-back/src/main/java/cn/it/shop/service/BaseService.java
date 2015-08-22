package cn.it.shop.service;

import java.util.List;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 11:01
 */
public interface BaseService<T> {
    public void save(T t);

    public void update(T t);

    public void delete(int id);

    public T get(int id);

    public List<T> query();
}
