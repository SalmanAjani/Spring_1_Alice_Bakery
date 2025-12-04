package com.spring.alice_bakery;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrup() {
        System.out.println("Strawberry syrup added!");
    }
}
