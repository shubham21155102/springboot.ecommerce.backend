package com.ecommerce.backend.Repository;

import com.ecommerce.backend.Models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    UserModel findByUsername(String username);

    UserModel findByEmail(String email);
}