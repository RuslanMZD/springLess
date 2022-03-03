package org.example.iocAndDI;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("prototype")
public class Cat implements Pet {
    public Cat() {
        System.out.println("CAT  bean clear created");
    }

    @Override
    public void say() {
        System.out.println("Mew Mew");
    }
}
