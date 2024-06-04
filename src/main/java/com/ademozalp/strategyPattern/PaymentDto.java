package com.ademozalp.strategyPattern;

public record PaymentDto(
        Integer orderId,
        String info,
        Double total,
        String paymentType
) {
}
