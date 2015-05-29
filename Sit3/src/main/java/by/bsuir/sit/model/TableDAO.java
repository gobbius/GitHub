/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.sit.model;

import by.bsuir.sit.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.StaleStateException;

/**
 *
 * @author notepad
 */
public class TableDAO extends AbstractDAO<Table> {

    @Override
    public List<Table> read() {
        Session session = null;
        List<Table> list = new ArrayList<Table>();
        int result = 0;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            list = session.createQuery("from Table").list();
            session.getTransaction().commit();
            result = 1;
        } catch (StaleStateException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delete(Table entity) {
        Session session = null;
        int result = 0;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
            result = 1;
        } catch (StaleStateException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean create(Table entity) {
        Session session = null;
        int result = 0;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
            result = 1;
        } catch (StaleStateException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(Table entity) {
        Session session = null;
        int result = 0;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
            result = 1;
        } catch (StaleStateException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }

}
