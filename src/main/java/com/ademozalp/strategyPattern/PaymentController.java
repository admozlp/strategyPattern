package com.ademozalp.strategyPattern;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/payment")
@RestController
public class PaymentController {
    private final PaymentFactoryImpl paymentFactory;

    public PaymentController(PaymentFactoryImpl paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public String pay(@RequestBody PaymentDto paymentDto) {
        return paymentFactory.executePayment(paymentDto);
    }
}
