package ua;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionDriver {

    private static  String USERNAME = "root";
    private static  String PASSWORD= "root";
    private static  String URL= "root";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected!");

        } catch (SQLException e){
            System.out.println("not connected");
            e.printStackTrace();
        }finally {
            if(connection != null){
                try {
                     connection.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
