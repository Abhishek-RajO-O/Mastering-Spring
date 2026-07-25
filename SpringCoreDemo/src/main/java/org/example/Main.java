package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        CartService cart = context.getBean(CartService.class);
        cart.addToCart();

//        PaymentService paymentService = new PaymentService();
//        OrderService order = new OrderService(paymentService);
//        order.placeOrder();

//        Class<Student> c1 = Student.class;
    }
    /*
    Reflection API

    class name -Student
    fields - name, age
    Constructor - Student()
    Methods -> getAttendence() , print()
    Annotations
     */
    /*

    class  Student{
        private String name;
        private  int age;

        public Student(){

        }

        public void getAttendence(){

        }
        public void print(){

        }
    }

     */
}
