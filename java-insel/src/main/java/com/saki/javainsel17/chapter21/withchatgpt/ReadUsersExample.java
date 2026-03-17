package com.saki.javainsel17.chapter21.withchatgpt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadUsersExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javademo?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "javauser";
        String password = "javapass123";

        String sql = "SELECT id, name, email FROM users";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet resultSet = stmt. executeQuery(sql)) {
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.printf("id: %d, name: %s, email: %s%n",id, name, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
