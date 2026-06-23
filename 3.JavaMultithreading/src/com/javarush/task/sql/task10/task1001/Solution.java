package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            String hql = "select distinct smth from Employee where age > 18 order by smth";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            for (Employee smth : query.list()) {
                System.out.println(smth);
            }

            /** List<String> list = session.createQuery(hql, Employee.class).getResultList();
             * for (String smth : list{
             * System.out.println(smth)
             * }
             */
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}