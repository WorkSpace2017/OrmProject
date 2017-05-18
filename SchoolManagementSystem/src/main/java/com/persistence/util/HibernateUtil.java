package com.persistence.util;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateUtil {

	private static final SessionFactory sessionFactory;
    static {
        try {
        	Properties dbConfig=new Properties();
        	HibernateUtil.class.getClassLoader();
        	dbConfig.load(ClassLoader.getSystemClassLoader().getResourceAsStream("dbConfiguration.properties"));
            sessionFactory = new AnnotationConfiguration()
                    .mergeProperties(dbConfig).configure()
                    //.setNamingStrategy(new Schema())
                    .buildSessionFactory();
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return sessionFactory.openSession();
    }
}
