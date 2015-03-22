package com.teammates.studentgrademanager.helper;

import java.util.ResourceBundle;

public class DataSource {
    public DataSource() {
        super();
    }

    private String driver;
    private String url;
    private String user;
    private String password;

    public DataSource(String baseName) {
        ResourceBundle bundle = ResourceBundle.getBundle(baseName);
        driver = bundle.getString("driver");
        url = bundle.getString("url");
        user = bundle.getString("user");
        password = bundle.getString("password");
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
