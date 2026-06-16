package com.ECommerceBackendApplication.backend.repository;


import com.ECommerceBackendApplication.backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    // Finds a shopping cart assigned to a specific user identifier
    Optional<Cart> findByUserId(String userId);
}

