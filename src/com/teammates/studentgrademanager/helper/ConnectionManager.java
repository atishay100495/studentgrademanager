package com.teammates.studentgrademanager.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public ConnectionManager() {
        super();
    }

    public Connection openConnection() throws ClassNotFoundException,
                                              SQLException {
        //DataSource object will be injected in application from application server
        DataSource ds = new DataSource("db");
        Class.forName(ds.getDriver());
        Connection conn =
            DriverManager.getConnection(ds.getUrl(), ds.getUser(),
                                        ds.getPassword());
        return conn;

    }
}
