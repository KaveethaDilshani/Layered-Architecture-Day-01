package com.example.layeredarchitecture.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection()throws SQLException{
    connection=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/sarasavi",
            "root",
            "1234"
    );
    }
    public static DBConnection getInstance()throws SQLException{
        return (null==dbConnection)?dbConnection=new DBConnection():dbConnection;
    }
}