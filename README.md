# E-Commerce Backend

A simple E-Commerce Backend application built using Spring Boot, Spring Data JPA, and PostgreSQL.

## Features

### Product Management

* View all products
* Add new products

### Cart Management

* Get cart by user ID
* Add products to cart

### Order Management

* Checkout cart and create an order

---

## Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* PostgreSQL
* Maven
* Lombok

---

## Project Structure

```text
src/main/java
└── com.ECommerceBackendApplication
    ├── EcommerceBackendApplication.java
    └── backend
        ├── controller
        │   └── ECommerceController.java
        ├── model
        │   ├── Product.java
        │   ├── Cart.java
        │   ├── CartItem.java
        │   ├── Order.java
        │   └── OrderItem.java
        ├── repository
        │   ├── ProductRepository.java
        │   ├── CartRepository.java
        │   └── OrderRepository.java
        └── service
            ├── ProductService.java
            ├── CartService.java
            └── OrderService.java
```

---

## API Endpoints

### Products

#### Get All Products

```http
GET /api/products
```

#### Add Product

```http
POST /api/products
```

Example Request Body:

```json
{
  "name": "Laptop",
  "price": 50000
}
```

---

### Cart

#### Get Cart

```http
GET /api/cart/{userId}
```

Example:

```http
GET /api/cart/user1
```

#### Add Item To Cart

```http
POST /api/cart/{userId}/add?productId=1&quantity=2
```

Example:

```http
POST /api/cart/user1/add?productId=1&quantity=2
```

---

### Orders

#### Checkout Order

```http
POST /api/order/{userId}/checkout
```

Example:

```http
POST /api/order/user1/checkout
```

---

## Database Configuration

Configure PostgreSQL in:

```properties
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Run The Application

Build:

```bash
./mvnw clean install
```

Run:

```bash
./mvnw spring-boot:run
```

Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

---

## Author

Aman
