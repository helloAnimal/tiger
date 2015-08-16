package cn.it.shop.model;

/**
 * 描述：
 * User:
 * Date: 2015/8/16
 * Time: 18:15
 */
public class Category {
    private int id;
    private String type;
    private Byte hot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getHot() {
        return hot;
    }

    public void setHot(Byte hot) {
        this.hot = hot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != category.id) return false;
        if (hot != null ? !hot.equals(category.hot) : category.hot != null) return false;
        if (type != null ? !type.equals(category.type) : category.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        return result;
    }
}
