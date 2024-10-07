package application_update_table;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OrderBean {
    private String orderNo;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public OrderBean(String orderNo, String productName, double price, int quantity) {
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
