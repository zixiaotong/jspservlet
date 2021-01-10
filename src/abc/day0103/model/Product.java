package abc.day0103.model;

import java.io.Serializable;

public class Product implements Serializable {

    private String id;
    private String pname;
    private double price;
    private int stock;
    private String type;

    public Product() {
        super();
    }

    public Product(String id, String pname, double price, int stock, String type) {
        super();
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
