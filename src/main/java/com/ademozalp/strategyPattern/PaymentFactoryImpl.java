package com.ademozalp.strategyPattern;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaymentFactoryImpl implements PaymentFactory{
    private final Map<String, PaymentStrategy> paymentStrategies;

    public PaymentFactoryImpl(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public PaymentStrategy getPaymentStrategy(String paymentType) {
        PaymentStrategy paymentStrategy = paymentStrategies.get(paymentType);
        if(paymentStrategy == null) {
            throw new IllegalArgumentException("Invalid payment type");
        }

        return paymentStrategy;
    }

    @Override
    public String executePayment(PaymentDto paymentDto) {
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentDto.paymentType());
        return paymentStrategy.pay(paymentDto);
    }
}
