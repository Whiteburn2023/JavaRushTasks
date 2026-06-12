package com.javarush.task.sql.task08.task0806;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT * FROM employee");
            while (results.next()) {
                int id = results.getInt("id");
                String name = results.getString("name");
                int age = results.getInt("age");
                String smth = results.getString("smth");

                employees.add(new Employee(id, name, age, smth));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        employees.forEach(System.out::println);
    }
}
