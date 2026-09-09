package com.buydesk.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buydesk.order.entity.PurchaseOrder;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Long> {
    // Spring Data supplies standard database operations
}