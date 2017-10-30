package com.filip.airport.persistence.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by sandof on 10/20/2017.
 */
public class UserRepository {


    public Long addUser(final User user){
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx=null;
        Long userId = null;

        try{
            tx=session.beginTransaction();
            userId = (Long) session.save(user);
            tx.commit();

        }catch(HibernateException e){
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return userId;
    }
}
