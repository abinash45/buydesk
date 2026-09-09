package com.buydesk.order.client.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.buydesk.order.client.config.SupplierFeignConfig;
import com.buydesk.order.dto.SupplierResponse;

@FeignClient(
        name = "supplier-service",
        configuration = SupplierFeignConfig.class) // Apply token forwarding
public interface SupplierClient {

    @GetMapping("/api/suppliers/{id}")
    SupplierResponse getSupplierById(@PathVariable("id") Long id);
}