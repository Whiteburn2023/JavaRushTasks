package com.javarush.task.sql.task10.task1009;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            String hql = "select SUM(e.salary) from Employee e";
            Long result = session.createQuery(hql, Long.class).uniqueResult();
            return result != null ? result : 0L;
        }
    }

    public static Double getAverageAge() {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            String hql = "select AVG(e.age) from Employee e";
            Double result = session.createQuery(hql, Double.class).uniqueResult();
            return result != null ? result : 0.0;
        }
    }
}