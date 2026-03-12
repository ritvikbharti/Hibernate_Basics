/*package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//------------------For student class ----
   /*  Student s1 = new Student();
        s1.setsName("Manu");
        s1.setRollNo(76);
        s1.setsAge(26);

        Student s2 = null;
        */

//
//                Configuration cfg = new Configuration();
//                cfg.configure();
//                cfg.addAnnotatedClass(Student.class); // ⭐ register entity
//
//                SessionFactory sf = cfg.buildSessionFactory();
//                Session session = sf.openSession();
// ---------------  Short method ---------------
      /*  SessionFactory sf = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        // When we perform any manipulation with the data in database then We use transaction
           /* Transaction tx = session.beginTransaction();
           // Save the data in database
            session.persist(s1);
              tx.commit();
            */
//         s2 = session.find(Student.class,69);

//--------------Update data in to  the database ------
      /*  Transaction tx = session.beginTransaction();
      //--- Update----
        // session.merge(s1);

        s2 = session.find(Student.class,76);
        session.remove(s2);
        tx.commit();


        session.close();
        sf.close();
//        System.out.println(s2.getsName());
        */
//-----------------Alien----------------
      /*  Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setName("Apple");
        l1.setModel("M2");
        l1.setRam(8);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setName("Zenbook");
        l2.setModel("Windows71");
        l2.setRam(16);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setName("Hp");
        l3.setModel("i7");
        l3.setRam(17);



        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Virus");
        a1.setTech("FullStack-Developer");




        Alien a2 = new Alien();
        a2.setAid(103);
        a2.setAname("Ritvik");
        a2.setTech("JAVA");


        Alien a3 = new Alien();
        a2.setAid(104);
        a2.setAname("Tamanna");
        a2.setTech("CPP");
//-----------------Many to Many ---------
        //        a1.setLaptops(Arrays.asList(l1,l2));
        //        a2.setLaptops(Arrays.asList(l2,l3));
        //        a3.setLaptops(Arrays.asList(l1,l3));
        //
        //        l1.setAliens(Arrays.asList(a1,a2));
        //        l2.setAliens(Arrays.asList(a2,a3));
        //        l3.setAliens(Arrays.asList(a1,a3));
        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));
//        a3.setLaptops(Arrays.asList(l2,l3)x);


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        transaction.commit();
        Alien a5 = session.find(Alien.class,101);
//        System.out.println(a5);
        session.close();

        sf.close();
    }
}

       */

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setModel("Asus");
        l1.setModel("Rog");
        l1.setRam(16);


        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setModel("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setModel("Apple");
        l3.setModel("Macbook air");
        l3.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");


        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Harsh");
        a2.setTech("Python");


        a1.setLaptops(Arrays.asList(l1, l2));
        a2.setLaptops(Arrays.asList(l3));


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        transaction.commit();


        session.close();

        Session session1 = sf.openSession();

        Alien a5 = session1.find(Alien.class, 101);
//        System.out.println(a5);
        session1.close();

        sf.close();


    }

}

