package com.ademozalp.strategyPattern;

import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public String pay(PaymentDto paymentDto) {
        return "Paid " + paymentDto.total() + " with credit card.";
    }
}
