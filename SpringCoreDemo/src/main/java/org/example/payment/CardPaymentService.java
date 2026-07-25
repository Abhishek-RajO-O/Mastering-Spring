package org.example.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService{

    public void pay(){
        System.out.println("Payment Done using Card");
    }
}
