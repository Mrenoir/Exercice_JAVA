package com.gestelo.lol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd ="";
        Connection cn = null;
        Statement st = null;
        try {
            cn = DriverManager.getConnection( connectionUrl,user,passwd );
            st = cn.createStatement();
            try ( ResultSet sql = st.executeQuery( "SELECT * from pomme" ) ) {
                SqlHelper.print( sql );
            }

        } catch ( SQLException e) {
            e.printStackTrace( );
        }

    }
}