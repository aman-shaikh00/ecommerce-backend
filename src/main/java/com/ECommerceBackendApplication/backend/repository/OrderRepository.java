package com.ECommerceBackendApplication.backend.repository;


import com.ECommerceBackendApplication.backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Retrieves the purchase history for a specific customer
    List<Order> findByUserId(String userId);
}
