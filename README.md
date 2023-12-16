# springboot.ecommerce.backend
**API ROUTES**
- http://localhost:8080/api/user/register
```json
{
    "username": "admin",
    "password": "admin",
    "cpassword":"admin",
    "phone":"6201060889",
    "email":"resoshubham2002@gmail.com",
    "fname":"shubham",
    "laname":"kumar"
}
```
- http://localhost:8080/api/user/login
```json
{
    "username": "admin",
    "password": "admin"
}
```
- http://localhost:8080/api/user/all
- http://localhost:8080/api/cart/getcart
```json
{
    "userId":"10"
}
```
- http://localhost:8080/api/cart/addtocart
```json
{
  "userId":"shubham",
  "productId":"xyzw",
  "brand":"HnM",
  "color":"red",
  "discount":"70%off",
  "price":"200",
  "sellingPrice":"1000",
  "imageUrl":"abc.com.jpg",
  "size":"36",
  "title":"Hello from shubham"
  
}
```
