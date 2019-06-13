package com.zjm.entity;

public class Goods {
    private int id;
    private String name;
    private String pic;
    private String price;
    private String description;
    private String stock;
    private String flag;

    public Goods() {
    }

    public Goods(int id, String name, String pic, String price, String description, String stock, String flag) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", stock='" + stock + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
