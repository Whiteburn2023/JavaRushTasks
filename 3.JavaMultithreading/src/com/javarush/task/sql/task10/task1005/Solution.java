package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books = null;
        //напишите тут ваш код
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
            String hql = "from Book b where b.author.fullName = 'Mark Twain' and b.publisher.name = 'Фолио'";
            session.getTransaction();
            Query<Book> query = session.createQuery(hql, Book.class);
            books = query.list();

            session.beginTransaction().commit();

        }
        books.forEach(System.out::println);
    }
}