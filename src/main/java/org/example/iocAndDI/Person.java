package org.example.iocAndDI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {

    private Pet pet;
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println(" bean Person is created");
    }



        public Person( Pet pet) {
        System.out.println("set pet in Person");
        this.pet = pet;
    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("happend DI pet in Person");
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my Pet");
        pet.say();
    }



    public void init(){
        System.out.println("Init method is sussecful Person");
    }


    public void destroy(){
        System.out.println("destroy method is sussecful Person");
    }
}
