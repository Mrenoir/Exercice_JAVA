package com.gestelo.lol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectHelper {
    private String url;
    private String usr;
    private String passwd;
    private Connection cn;

    public ConnectHelper( String url , String usr , String passwd ) {
        this.url = url;
        this.usr = usr;
        this.passwd = passwd;
        this.cn = null;
    }

    public void connect() throws SQLException {
        if (cn == null) {
            cn = DriverManager.getConnection( url , usr , passwd );
            setCn( cn );
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl( String url ) {
        this.url = url;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr( String usr ) {
        this.usr = usr;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd( String passwd ) {
        this.passwd = passwd;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn( Connection cn ) {
        this.cn = cn;
    }
}
