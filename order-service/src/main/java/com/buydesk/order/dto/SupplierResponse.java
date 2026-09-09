package com.buydesk.order.dto;

public record SupplierResponse(
        Long id,
        String supplierCode,
        String supplierName
) {
    // Match the JSON returned by supplier-service
}