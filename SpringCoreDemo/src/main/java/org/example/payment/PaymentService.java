package org.example.payment;

import org.example.OrderService;

public interface PaymentService {

//     this is circular dependency . Bad Practice
//     OrderService order = new OrderService(PaymentService pay);
     void pay();
}
