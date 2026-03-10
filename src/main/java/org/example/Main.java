package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Billoo");
        s1.setRollNo(70);
        s1.setsAge(22);

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class); // ⭐ register entity

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.persist(s1);

        tx.commit();

        session.close();
        sf.close();
    }
}