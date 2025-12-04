package com.spring.alice_bakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateSyrup implements Syrup{
    @Override
    public void getSyrup() {
        System.out.println("Chocolate syrup added!");
    }
}
