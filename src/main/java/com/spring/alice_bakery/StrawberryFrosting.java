package com.spring.alice_bakery;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting{
    @Override
    public void getFrosting() {
        System.out.println("Strawberry frosting done!");
    }
}
