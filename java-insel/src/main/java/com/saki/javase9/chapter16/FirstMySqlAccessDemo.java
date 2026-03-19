package com.saki.javase9.chapter16;

import java.sql.*;

public class FirstMySqlAccessDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javademo?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "javauser";
        String password = "javapass123";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            if (!con.getMetaData().getTables(null, null, "CUSTOMER", null).next()) ;
            String[] sqlStmts = {
                    "CREATE TABLE CUSTOMER(ID INTEGER NOT NULL PRIMARY KEY,FIRSTNAME VARCHAR(255),"
                            + "LASTNAME VARCHAR(255),STREET VARCHAR(255),CITY VARCHAR(255))",
                    "INSERT INTO CUSTOMER VALUES(0,'Laura','Steel','429 Seventh Av.','Dallas')",
                    "INSERT INTO CUSTOMER VALUES(1,'Susanne','King','366 - 20th Ave.','Olten')",
                    "INSERT INTO CUSTOMER VALUES(2,'Anne','Miller','20 Upland Pl.','Lyon')" };
            for (String sql : sqlStmts) {
                stmt.execute(sql);
            }
            System.out.println("created new table and filled with data");

            try (ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER")) {
                while (rs.next()) {
                    System.out.printf("id: %d, first name: %s, lastname %s, street: %s %n"
                            , rs.getInt(1)
                            , rs.getString(2)
                            , rs.getString(3)
                            , rs.getString(4));
                }
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

}
