package com.ecommerce.backend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CartModel {
    @Id
    @Column(name = "product_id")
    public String Id;
    @Column(name = "user_id")
    public String UserId;
    @Column(name = "brand")
    public String Brand;
    @Column(name = "color")
    public String Color;
    @Column(name = "discount")
    public String Discount;
    @Column(name = "imageUrl")
    public String ImageUrl;
    @Column(name = "price")
    public String Price;
    @Column(name = "sellingPrice")
    public String SellingPrice;
    @Column(name = "size")
    public String Size;
    @Column(name = "title")
    public String Title;
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getUserId() {
        return UserId;
    }
    public void setUserId(String userId) {
        UserId = userId;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public String getDiscount() {
        return Discount;
    }
    public void setDiscount(String discount) {
        Discount = discount;
    }
    public String getImageUrl() {
        return ImageUrl;
    }
    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        Price = price;
    }
    public String getSellingPrice() {
        return SellingPrice;
    }
    public void setSellingPrice(String sellingPrice) {
        SellingPrice = sellingPrice;
    }
    public String getSize() {
        return Size;
    }
    public void setSize(String size) {
        Size = size;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
}
