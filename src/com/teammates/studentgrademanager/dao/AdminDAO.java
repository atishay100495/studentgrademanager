package com.teammates.studentgrademanager.dao;


import com.teammates.studentgrademanager.helper.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
    public AdminDAO() {
        super();
    }
    
    ConnectionManager manager = new ConnectionManager();

    public boolean login(String username, String password) throws ClassNotFoundException,
                                                  SQLException {
        Connection conn = manager.openConnection();
        PreparedStatement statement = conn.prepareStatement("select * from admindetail where username=? and password=?");
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet result = statement.executeQuery();
        boolean flag = result.next();
        return flag;
    }

    public int register(String username, String password) throws ClassNotFoundException,
                                                       SQLException {
        Connection conn = manager.openConnection();
        PreparedStatement statement =
            conn.prepareStatement("insert into admindetail values(?, ?)");
        statement.setString(1, username);
        statement.setString(2, password);

        int row = statement.executeUpdate();
        return row;
    }

}
