package com.ecommerce.backend.Controllers;

import com.ecommerce.backend.Requests.LogInRequest;
import com.ecommerce.backend.Requests.SignUpRequest;
import com.ecommerce.backend.Services.UserService;
import com.ecommerce.backend.Utils.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseMessage login(@RequestBody LogInRequest loginRequest) {
    String username = loginRequest.getUsername();
    String password = loginRequest.getPassword();
    String response = username+ " " + password + " " + username.equals("admin") + " " + password.equals("admin");

    System.out.println(username + " " + password);
    ResponseMessage responseMessage = userService.logIn(username, password);
    return responseMessage;
}

        @GetMapping("/all")
        public ResponseMessage getAllUsers(){
            return userService.getAllUsers();
        }
        @PostMapping("/register")
        public ResponseMessage registerUser(@RequestBody SignUpRequest signUpRequest){
            String username = signUpRequest.getUsername();
            String password = signUpRequest.getPassword();
            String email = signUpRequest.getEmail();
            String fname = signUpRequest.getFname();
            String lname=signUpRequest.getLname();
            String phone=signUpRequest.getPhone();
            String cpassword=signUpRequest.getCpassword();
            System.out.println(username + " " + password + " " + email + " " + fname + " " + lname + " " + phone + " " + cpassword);
            return userService.registerUser(username,password,email,fname,lname,phone,cpassword);
        }


}
