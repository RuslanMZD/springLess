package org.example.iocAndDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App2 {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person =context.getBean("person",Person.class);
        person.callPet();

//        System.out.println(person.getName());
//        System.out.println(person.getAge());

        context.close();
    }
}