package com.ecommerce.backend.Services;

import com.ecommerce.backend.Models.CartModel;
import com.ecommerce.backend.Models.UserModel;
import com.ecommerce.backend.Repository.CartRepository;
import com.ecommerce.backend.Repository.UserRepository;
import com.ecommerce.backend.Utils.JSONConvert;
import com.ecommerce.backend.Utils.ResponseMessage;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements CartServiceInterface{
    private final UserRepository userRepository;
    private final CartRepository cartRepository;
    private final Gson gson;
    private JSONConvert jsonConvert;
    public CartService(UserRepository userRepository, CartRepository cartRepository, Gson gson) {
        this.userRepository = userRepository;
        this.cartRepository = cartRepository;
        this.gson = gson;
    }




    public ResponseMessage getCart(String userId) {
//        return new ResponseMessage(gson.toJson(cartRepository.findByUserId(userId)), HttpStatus.OK);
//        System.out.println(userId);
        List<CartModel> cartModel = cartRepository.findByUserId(userId);
//        System.out.println(cartModel);
        try{
            jsonConvert = new JSONConvert();
            String cartModelString = jsonConvert.convert(cartModel);
//            System.out.println(cartModelString);
            return new ResponseMessage(cartModelString, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseMessage("No items in cart", HttpStatus.NOT_FOUND);
        }
    }


    @Override
    public ResponseMessage getAll() {
        String cartModelString = gson.toJson(cartRepository.findAll());
        System.out.println(cartModelString);
        return new ResponseMessage(cartModelString, HttpStatus.OK);
    }

    public ResponseMessage addToCart(String userId, String productId, String brand, String color, String discount, String price, String sellingPrice, String imageUrl, String size, String title) {
//        CartModel cartModel = cartRepository.findByUserId(userId);
        UserModel userModel = userRepository.findByUsername(userId);
        if (userModel == null) {
            // Handle scenario where user is not found
            return new ResponseMessage("User not found", HttpStatus.NOT_FOUND);
        }

        CartModel cartModel = new CartModel();

//        cartModel.setUserId(userModel);
        cartModel.setUserId(userId);
        cartModel.setId(productId);

        cartModel.setBrand(brand);
        cartModel.setColor(color);
        cartModel.setDiscount(discount);
        cartModel.setPrice(price);
        cartModel.setSellingPrice(sellingPrice);
        cartModel.setImageUrl(imageUrl);
        cartModel.setSize(size);
        cartModel.setTitle(title);
        cartRepository.save(cartModel);
        String cartModelString = gson.toJson(cartModel);
        System.out.println(cartModelString);
        System.out.println(userId);
        return new ResponseMessage(gson.toJson(cartModel), HttpStatus.OK);
    }
}
