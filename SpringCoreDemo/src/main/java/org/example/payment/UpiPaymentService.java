package org.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpiPaymentService implements PaymentService{

    @Override
    public void pay(){
        System.out.println("UPI payment Done");

    }
}
