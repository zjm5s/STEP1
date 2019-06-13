package com.zjm.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    private static String classname = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/step1";
    private static String username = "root";
    private static String password = "root";

    public static Connection getConnection(){
        Connection connection = null;

        try{
            Class.forName(classname);
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}
