package com.saki.javainsel17.chapter21;

import java.sql.*;

public class FirstSQLAccess {

    public static void main(String[] args) {

        String url = "jdbc:h2:file:~/TutegoDB";
        try (Connection con = DriverManager.getConnection(url, "sa", "");
             Statement stmt = con.createStatement()) {

            // table CUSTOMER is missing ??? then create
            if (!con.getMetaData().getTables(null, null, "CUSTOMER", null).next()) {
                String[] sqlStms = {
                        "CREATE TABLE CUSTOMER(ID INTEGER NOT NULL PRIMARY KEY,FIRSTNAME VARCHAR(255),"
                                + "LASTNAME VARCHAR(255),STREET VARCHAR(255),CITY VARCHAR(255))",
                        "INSERT INTO CUSTOMER VALUES(0,'Laura','Steel','429 Seventh Av.','Dallas')",
                        "INSERT INTO CUSTOMER VALUES(1,'Susanne','King','366 - 20th Ave.','Olten')",
                        "INSERT INTO CUSTOMER VALUES(2,'Anne','Miller','20 Upland Pl.','Lyon')"};
                for (String sql : sqlStms) {
                    stmt.executeUpdate(sql);
                    System.out.println("Table created and data inserted.");
                }

                // Table query (abfragen)
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER")) {
                    while (rs.next()) {
                        // access FIRSTNAME, LASTNAME, STREET
                        System.out.printf("%s, %s, %s%n", rs.getString(1), rs.getString(2), rs.getString(3));
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
