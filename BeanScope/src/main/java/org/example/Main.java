package org.example;

import com.sun.net.httpserver.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        OrderService order2 = context.getBean(OrderService.class);

//        Singleton --> eager initialization  (default can be changed)
//        one object per bean defination
        System.out.println(order == order2);//true
//      Prototype --> lazy initialization  (default can be changed)
        System.out.println((order == order2)); //false

//        other scopes
//        >Request - new object per new http request
//        >Session - new object per user session
//        >Application - new object per time he application is up
    }

}
