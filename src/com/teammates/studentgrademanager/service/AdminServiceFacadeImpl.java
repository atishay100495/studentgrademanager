package com.teammates.studentgrademanager.service;


import com.teammates.studentgrademanager.dao.AdminDAO;
import com.teammates.studentgrademanager.model.AdminData;

import java.sql.SQLException;


public class AdminServiceFacadeImpl implements IAdminServiceFacade {
    public AdminServiceFacadeImpl() {
        super();
    }

    private AdminDAO admindao = new AdminDAO();

    public boolean login(String username, String password) {
        boolean flag = false;
        try {
            flag = admindao.login(username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean register(AdminData adminData) {
        int rows = 0;
        try {
            rows = admindao.register(adminData.getUsername(),adminData.getPassword());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rows > 0) {
            return true;
        } else {
            return false;
        }
    }

}
