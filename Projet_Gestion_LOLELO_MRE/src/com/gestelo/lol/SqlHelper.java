package com.gestelo.lol;

import org.jetbrains.annotations.NotNull;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class SqlHelper {

    public static void print( @NotNull ResultSet rs ) throws SQLException {
        String[] row = new String[0];
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] header = new String[columnCount];
        for(int i = 0; i < columnCount;i++){
            header[i] = metaData.getColumnName( i+1 );

            System.out.print( header[i] + " | ");
        }
        System.out.println(  );
        while (rs.next()) {
             row = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                String string = rs.getString(i + 1);
                if (string == null) {
                    string = "";
                }
                row[i] = string;
            }
            for ( String s : row ) {
                System.out.print( s + " | " );
            }
            System.out.println(  );

        }



    }


}
