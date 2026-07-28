package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    This will generate 2 bean of same class
    @Bean
    public OrderService getOrder(){
        return new OrderService();
    }

    @Bean
    public OrderService getOrder2(){
        return new OrderService();
    }
}
