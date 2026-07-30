package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    OrderService orderService;

    public PaymentService(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("Payment Service Created");

    }

//    public PaymentService() {
//        System.out.println("Payment Service Created");
//    }

    public void pay() {
        System.out.println("Payment Done");
    }
}
