package com.teammates.studentgrademanager.service;


import com.teammates.studentgrademanager.model.AdminData;

public interface IAdminServiceFacade {
    public boolean login(String username, String password);
    public boolean register(AdminData adminData);
}