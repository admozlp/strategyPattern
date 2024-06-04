package com.ademozalp.strategyPattern;

import org.springframework.stereotype.Service;

@Service("wireTransfer")
public class WireTransferStrategy implements PaymentStrategy {
    @Override
    public String pay(PaymentDto paymentDto) {
        return "Paid " + paymentDto.total() + " with wire transfer.";
    }
}
