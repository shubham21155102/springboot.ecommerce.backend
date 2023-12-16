package com.ecommerce.backend.Models;
import jakarta.persistence.*;
@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @Column(name = "id",nullable = false, updatable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="username",unique = true,nullable = false)
    private String username;
    @Column(name="password",nullable = false)
    private String password;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email", nullable = false, updatable = false,unique = true)
    private String email;
    @Column(name="phone")
    private String phone;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}