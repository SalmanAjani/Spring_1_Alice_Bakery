package com.spring.alice_bakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrosting() {
        System.out.println("Chocolate frosting done!");
    }
}
