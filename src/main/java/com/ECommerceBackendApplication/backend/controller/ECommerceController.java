package com.ECommerceBackendApplication.backend.controller;


import com.ECommerceBackendApplication.backend.model.*;
import com.ECommerceBackendApplication.backend.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ECommerceController {

    private final ProductService productService;
    private final CartService cartService;
    private final OrderService orderService;

    public ECommerceController(ProductService productService, CartService cartService, OrderService orderService) {
        this.productService = productService;
        this.cartService = cartService;
        this.orderService = orderService;
    }

    // --- PRODUCT API ---
    @GetMapping("/products")
    public List<Product> getAllProducts() { return productService.getAllProducts(); }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) { return productService.saveProduct(product); }

    // --- CART API ---
    @GetMapping("/cart/{userId}")
    public ResponseEntity<Cart> getCart(@PathVariable String userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }

    @PostMapping("/cart/{userId}/add")
    public ResponseEntity<Cart> addToCart(@PathVariable String userId, @RequestParam Long productId, @RequestParam int quantity) {
        return ResponseEntity.ok(cartService.addItemToCart(userId, productId, quantity));
    }

    // --- ORDER API ---
    @PostMapping("/order/{userId}/checkout")
    public ResponseEntity<Order> checkoutOrder(@PathVariable String userId) {
        return ResponseEntity.ok(orderService.checkout(userId));
    }
}
