package com.ecommerce.backend.Controllers;

import com.ecommerce.backend.Requests.AddToCartRequest;
import com.ecommerce.backend.Requests.GetCartRequest;
import com.ecommerce.backend.Services.CartService;
import com.ecommerce.backend.Utils.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController
{
  public final CartService cartService;


    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/getcart")
    public ResponseMessage getCart(@RequestBody GetCartRequest getCartRequest) {
//        return cartService.getCart(userId);

        String userId = getCartRequest.getUserId();
        System.out.println(userId);
//        return new ResponseMessage("Hello", HttpStatus.OK);

        return cartService.getCart(userId);
    }
    @PostMapping("/addtocart")
    public ResponseMessage addToCart(@RequestBody AddToCartRequest addToCartRequest) {
        try{
            String userId = addToCartRequest.getUserId();
            String productId = addToCartRequest.getProductId();
            String brand = addToCartRequest.getBrand();
            String color = addToCartRequest.getColor();
            String discount = addToCartRequest.getDiscount();
            String price = addToCartRequest.getPrice();
            String sellingPrice = addToCartRequest.getSellingPrice();
            String imageUrl = addToCartRequest.getImageUrl();
            String size = addToCartRequest.getSize();
            String title = addToCartRequest.getTitle();
            return cartService.addToCart(userId, productId, brand, color, discount, price, sellingPrice,imageUrl, size, title);

        }
        catch (Exception e){
            return new ResponseMessage("Error", HttpStatus.BAD_REQUEST);
          }
    }
    @GetMapping("all")
    public ResponseMessage getAll() {
        return cartService.getAll();
    }

}
