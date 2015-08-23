package cn.it.shop.model;

import javax.persistence.*;

/**
 * 描述：
 * User:
 * Date: 2015/8/22
 * Time: 14:28
 */
@Entity
public class Category {
    private int id;
    private String type;
    private Byte hot;
    private Integer aid;
    private Account account;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "hot")
    public Byte getHot() {
        return hot;
    }

    public void setHot(Byte hot) {
        this.hot = hot;
    }

    @Basic
    @Column(name = "aid", insertable = false, updatable = false)
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "aid", referencedColumnName = "id")
    })
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != category.id) return false;
        if (aid != null ? !aid.equals(category.aid) : category.aid != null) return false;
        if (hot != null ? !hot.equals(category.hot) : category.hot != null) return false;
        if (type != null ? !type.equals(category.type) : category.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        return result;
    }
}
