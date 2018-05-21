/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;

/**
 *
 * @author Van Nghia
 */
public class DBConnect {
    static String dbURL="jdbc:sqlserver://DESKTOP-SSL101R;databaseName=QUANLIBANHANG;user=sa;password=vannghia145";
    public static Connection Moketnoi() {
        try {
            Connection  conn= DriverManager.getConnection(dbURL);
            System.out.println("Connected!!");
            return conn;
        } catch (SQLException e) {
             System.out.println("Error Connected!!");
//            e.printStackTrace();
              return null;
        }
    }
	
}
