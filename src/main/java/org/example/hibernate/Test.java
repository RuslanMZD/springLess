package org.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session  session = null;
        try {
            session = factory.getCurrentSession();
         //   Employee employee = new Employee("Zair","Zairovich","HR",500L);
            session.beginTransaction();

//            session.save(employee);



            Employee employee1 =  session.get(Employee.class,2);

            System.out.println(employee1);
            session.beginTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }

    }

}
