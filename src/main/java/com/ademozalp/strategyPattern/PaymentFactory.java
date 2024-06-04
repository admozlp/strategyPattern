package com.ademozalp.strategyPattern;

public interface PaymentFactory {

    String executePayment(PaymentDto paymentDto);
}
