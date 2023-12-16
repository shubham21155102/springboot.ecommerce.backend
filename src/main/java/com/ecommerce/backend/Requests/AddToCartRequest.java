package com.ecommerce.backend.Requests;
public class AddToCartRequest {
    private String userId;
    private String productId;
    private String brand;
    private String color;
    private String discount;
    private String price;
    private String sellingPrice;
    private String imageUrl;
    private String size;
    private String title;
    public String getUserId() {
        return userId;
    }
    public String getProductId() {
        return productId;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public String getDiscount() {
        return discount;
    }
    public String getPrice() {
        return price;
    }
    public String getSellingPrice() {
        return sellingPrice;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getSize() {
        return size;
    }
    public String getTitle() {
        return title;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getImageUrl() {
        return imageUrl;
    }

}
