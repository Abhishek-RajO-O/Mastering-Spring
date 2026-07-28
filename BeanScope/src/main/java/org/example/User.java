package org.example;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
//ststefull class
public class User {
    String name;
    int age;
}
