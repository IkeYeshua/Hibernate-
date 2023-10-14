package com.first.hibernate.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();



        Song song1 = new Song();
        song1.setId(1);
        song1.setSongArtist("Nathaniel Bassey");
        song1.setSongName("Imela");
        session.save(song1);
    }
}