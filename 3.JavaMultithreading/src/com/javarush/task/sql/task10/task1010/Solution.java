package com.javarush.task.sql.task10.task1010;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import java.util.List;

/* 
task1010
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getAll().forEach(System.out::println);
    }

    public static List<Employee> getAll() {
        List<Employee> list;
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()){
            String sql = "SELECT * FROM employee e ORDER BY e.id ASC";
            NativeQuery<Employee> nativeQuery = session.createNativeQuery(sql, Employee.class);
            list = nativeQuery.list();
        }
        return list;
    }
}