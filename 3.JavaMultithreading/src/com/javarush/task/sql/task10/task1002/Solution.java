package com.javarush.task.sql.task10.task1002;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            String hql = "from Employee where name = 'director'";
            Employee director = session.createQuery(hql, Employee.class).uniqueResult();
            return director;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}