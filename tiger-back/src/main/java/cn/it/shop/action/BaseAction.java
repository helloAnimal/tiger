package cn.it.shop.action;

import cn.it.shop.service.AccountService;
import cn.it.shop.service.CategoryService;
import cn.it.shop.service.impl.AccountServiceImpl;
import cn.it.shop.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 14:51
 */
@Controller
@Scope("prototype")
public class BaseAction<T> extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    protected T model;
    protected Integer page;
    protected Integer rows;
    protected Integer total;
    protected Map<String, Object> pageMap;
    protected Map<String, Object> request;
    protected Map<String, Object> session;
    protected Map<String, Object> application;

    @Resource
    protected AccountService accountService;
    @Resource
    protected CategoryService categoryService;



    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public T getModel() {
        try {
            Type genType = this.getClass().getGenericSuperclass();
            Class clazz;
            if (genType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genType;
                clazz = (Class) parameterizedType.getActualTypeArguments()[0];
            } else {
                clazz = Object.class;
            }
            model = (T) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Map<String, Object> getPageMap() {
        return pageMap;
    }

    public void setPageMap(Map<String, Object> pageMap) {
        this.pageMap = pageMap;
    }
}
