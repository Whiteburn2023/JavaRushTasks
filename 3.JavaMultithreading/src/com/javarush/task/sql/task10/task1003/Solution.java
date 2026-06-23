package com.javarush.task.sql.task10.task1003;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1003
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            String hql = "update Employee set smth = concat('senior ', smth)";
            session.beginTransaction();
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.executeUpdate();

            session.getTransaction().commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}