package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements DisposableBean /* implements InitializingBean */ {
    Map<String, Integer> map ;

    public CartService() {
        this.map = new HashMap<>();
        System.out.println("Cart Service Constructor called");
    }

    public void addToCart(){
        System.out.println("Added to Cart");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initialization Callback");
//        map.put("Pihu" , 1);
//        map.put("Abhi", 2);
//    }
    public void start() {
        map.put("Pihu" , 1);
        map.put("Abhi", 2);
    }

    @PostConstruct
    public void start2(){
        map.put("Pihu" , 1);
        map.put("Abhi", 2);
    }

    public Integer getValue(String key){
        return map.get(key);
    }


    @Override
    public void destroy() throws Exception {
        map.clear();
        System.out.println("Bean is getting Destroyed");
    }
}
