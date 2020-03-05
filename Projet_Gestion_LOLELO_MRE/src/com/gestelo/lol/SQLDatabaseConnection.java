package com.gestelo.lol;

import java.sql.SQLException;
import java.util.HashMap;

public class SQLDatabaseConnection {
    public static void main( String[] args ) throws SQLException {

        HashMap<String, String> param = fileParam( "jdbc:mysql://localhost:3306/test" , "root" , "" );
        ConnectHelper co = new ConnectHelper( param.get( "url" ) , param.get( "user" ) , param.get( "passwd" ) );
        try {
            co.connect( );
            if (HelperQuery.exectqueryI( "INSERT INTO POMME values (NULL,5,'Rose','Test')" , co )) {
                //SqlHelper.print( sql );
                System.out.println( "test" );
            }

        } catch (SQLException e) {
            e.printStackTrace( );
        }

    }

    public static HashMap<String, String> fileParam( String url , String user , String passwd ) {
        HashMap<String, String> param = new HashMap<>( );
        param.put( "url" , url );
        param.put( "user" , user );
        param.put( "passwd" , passwd );
        return param;
    }
}