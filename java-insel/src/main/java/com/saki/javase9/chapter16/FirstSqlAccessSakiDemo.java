package com.saki.javase9.chapter16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstSqlAccessSakiDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javademo?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "javauser";
        String password = "javapass123";

        String query = "SELECT * FROM users";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet resultSet = stmt.executeQuery(query)) {
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.printf("%d, %s, %s, %n", id, name, email);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
