package com.maryanto.dimas.training;

import com.maryanto.dimas.training.configuration.SessionFactoryUtil;
import com.maryanto.dimas.training.dao.BukuDao;
import com.maryanto.dimas.training.entity.Buku;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {

    private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {
        System.out.println("halo saya sedang belajar maven!");

        SessionFactoryUtil util = new SessionFactoryUtil();
        SessionFactory sessionFactory = util.getSessionFactory();

        sessionFactory.close();

        log.info("hibernate connection close!");

    }
}
