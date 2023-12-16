package com.ecommerce.backend.Repository;

import com.ecommerce.backend.Models.CartModel;
import com.ecommerce.backend.Models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository  extends CrudRepository<CartModel, Long>
{
//    CartModel findByUserId(UserModel userModel);
List<CartModel> findByUserId(String userId);


}
