package com.gestelo.lol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelperQuery {


    public static ResultSet exectquery( String query , ConnectHelper co ) throws SQLException {
        if (co.getCn( ) != null) {
            Statement st = co.getCn( ).createStatement( );
            if (st.execute( query )) {
                return st.executeQuery( query );
            } else {
                System.out.println( "Erreur dans la requête SQL" );
                return null;
            }

        }
        return null;
    }

    public static boolean exectqueryI( String query , ConnectHelper co ) throws SQLException {
        if (co.getCn( ) != null) {
            Statement st = co.getCn( ).createStatement( );
            if (!st.execute( query )) {
                return !st.execute( query );
            } else {
                System.out.println( "Erreur dans la requête SQL" );
                return false;
            }

        } else {
            System.out.println( "Pas de connexion" );
        }
        return false;

    }
}
