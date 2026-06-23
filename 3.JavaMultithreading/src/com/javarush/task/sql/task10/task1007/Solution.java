package com.javarush.task.sql.task10.task1007;
/**
 * import org.hibernate.Session;
 * import org.hibernate.query.Query;
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1007
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        List<Employee> list;
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            String hql = "from Employee e where e.smth in (:IN) order by e.age asc";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.setParameter("IN", in);
            list = query.list();
        }

        return list;
    }
}