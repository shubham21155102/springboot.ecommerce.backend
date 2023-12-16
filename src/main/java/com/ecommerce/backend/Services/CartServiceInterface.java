package com.ecommerce.backend.Services;

import com.ecommerce.backend.Utils.ResponseMessage;

public interface CartServiceInterface {
    ResponseMessage addToCart(String userId, String productId, String brand, String color, String discount, String price, String sellingPrice,String imageUrl, String size, String title);
    ResponseMessage getCart(String userId);
    ResponseMessage getAll();
}
