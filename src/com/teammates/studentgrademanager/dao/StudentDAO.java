package com.teammates.studentgrademanager.dao;


import com.teammates.studentgrademanager.helper.ConnectionManager;
import com.teammates.studentgrademanager.model.StudentData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


public class StudentDAO {
    public StudentDAO() {
        super();

    }

    ConnectionManager manager = new ConnectionManager();
    Connection conn = null;
    
//    public void setConnectionJNDI(Connection conn) {
//        this.conn = conn;
//    }
    
    public void setDefaultConnection() {
        try {
            this.conn = manager.openConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean login(String username, String password) throws ClassNotFoundException,
                                                  SQLException {
        Connection conn = manager.openConnection();
        PreparedStatement statement = conn.prepareStatement("select * from studentdetail where collegeid=? and studentpassword=?");
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet result = statement.executeQuery();
        boolean flag = result.next();
        return flag;
    }

    public int register(String firstname, String lastname,
                        String studentGender, String collegeID,
                        String studentEmail, String studentBranch,
                        String addressLine1, String addressLine2, String city,
                        String state, String pincode, String studentPhone,
                        Double studentPercentMarks,
                        String studentPassword) throws ClassNotFoundException,
                                                       SQLException {
        if(conn==null)
        {
            setDefaultConnection();
        }
        PreparedStatement statement =
            conn.prepareStatement("insert into studentdetail values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        statement.setString(1, firstname);
        statement.setString(2, lastname);
        statement.setString(3, studentGender);
        statement.setString(4, collegeID);
        statement.setString(5, studentEmail);
        statement.setString(6, studentBranch);
        statement.setString(7, addressLine1);
        statement.setString(8, addressLine2);
        statement.setString(9, city);
        statement.setString(10, state);
        statement.setString(11, pincode);
        statement.setString(12, studentPhone);
        statement.setDouble(13, studentPercentMarks);
        statement.setString(14, studentPassword);

        int row = statement.executeUpdate();
        return row;
    }
    
    
    public int update(String firstname, String lastname,
                        String studentGender, String collegeID,
                        String studentEmail, String studentBranch,
                        String addressLine1, String addressLine2, String city,
                        String state, String pincode, String studentPhone,
                        Double studentPercentMarks,
                        String studentPassword, String studentID) throws ClassNotFoundException,
                                                       SQLException {
        if(conn==null)
        {
            setDefaultConnection();
        }
        PreparedStatement statement =
            conn.prepareStatement("update studentdetail set firstname = ?, lastname = ?, studentgender = ?, collegeid = ?, studentemail = ?, studentbranch = ?, addressline1 = ?, addressline2 = ?, city = ?, state = ?, pincode = ?, studentphone = ?, studentpercentmarks = ?, studentpassword = ? where collegeid= ?");
        statement.setString(1, firstname);
        statement.setString(2, lastname);
        statement.setString(3, studentGender);
        statement.setString(4, collegeID);
        statement.setString(5, studentEmail);
        statement.setString(6, studentBranch);
        statement.setString(7, addressLine1);
        statement.setString(8, addressLine2);
        statement.setString(9, city);
        statement.setString(10, state);
        statement.setString(11, pincode);
        statement.setString(12, studentPhone);
        statement.setDouble(13, studentPercentMarks);
        statement.setString(14, studentPassword);
        statement.setString(15, studentID);

        int row = statement.executeUpdate();
        return row;
    }


    public List<StudentData> getStudentDetails() throws ClassNotFoundException,
                                                    SQLException {
        if(conn==null)
        {
            setDefaultConnection();
        }
        Statement statement = conn.createStatement();
        ResultSet result =
            statement.executeQuery("select * from studentdetail");

        List<StudentData> list = new ArrayList<StudentData>();
        while (result.next()) {
            StudentData studentData = new StudentData();
            studentData.setFirstname(result.getString(1));
            studentData.setLastname(result.getString(2));
            studentData.setStudentGender(result.getString(3));
            studentData.setCollegeID(result.getString(4));
            studentData.setStudentEmail(result.getString(5));
            studentData.setStudentBranch(result.getString(6));
            studentData.setAddressLine1(result.getString(7));
            studentData.setAddressLine2(result.getString(8));
            studentData.setCity(result.getString(9));
            studentData.setState(result.getString(10));
            studentData.setPincode(result.getString(11));
            studentData.setStudentPhone(result.getString(12));
            studentData.setStudentPercentMarks(result.getDouble(13));
            studentData.setStudentPassword(result.getString(14));

            list.add(studentData);

        }
        return list;
    }
    
    public List<StudentData> getStudentDetailsSortBy(String sortfield) throws ClassNotFoundException,
                                                    SQLException {
        
        if(conn==null)
        {
            setDefaultConnection();
        }
        PreparedStatement statement =
            conn.prepareStatement("select * from studentdetail order by ? desc");
        statement.setString(1, sortfield);
        ResultSet result = statement.executeQuery();

        List<StudentData> list = new ArrayList<StudentData>();
        
        while (result.next()) {
            StudentData studentData = new StudentData();
            studentData.setFirstname(result.getString(1));
            System.out.println(studentData.getFirstname());
            studentData.setLastname(result.getString(2));
            studentData.setStudentGender(result.getString(3));
            studentData.setCollegeID(result.getString(4));
            studentData.setStudentEmail(result.getString(5));
            studentData.setStudentBranch(result.getString(6));
            studentData.setAddressLine1(result.getString(7));
            studentData.setAddressLine2(result.getString(8));
            studentData.setCity(result.getString(9));
            studentData.setState(result.getString(10));
            studentData.setPincode(result.getString(11));
            studentData.setStudentPhone(result.getString(12));
            studentData.setStudentPercentMarks(result.getDouble(13));
            studentData.setStudentPassword(result.getString(14));

            list.add(studentData);

        }
        return list;
    }
    
    public StudentData getStudentDetailsByStudentID(String studentID) throws ClassNotFoundException,
                                                    SQLException {
        if(conn==null)
        {
            setDefaultConnection();
        }
        PreparedStatement statement =
            conn.prepareStatement("select * from studentdetail where collegeid=?");
        statement.setString(1, studentID);
        ResultSet result = statement.executeQuery();
        
        StudentData studentData = new StudentData();
        if(result.next()) {
            studentData.setFirstname(result.getString(1));
            studentData.setLastname(result.getString(2));
            studentData.setStudentGender(result.getString(3));
            studentData.setCollegeID(result.getString(4));
            studentData.setStudentEmail(result.getString(5));
            studentData.setStudentBranch(result.getString(6));
            studentData.setAddressLine1(result.getString(7));
            studentData.setAddressLine2(result.getString(8));
            studentData.setCity(result.getString(9));
            studentData.setState(result.getString(10));
            studentData.setPincode(result.getString(11));
            studentData.setStudentPhone(result.getString(12));
            studentData.setStudentPercentMarks(result.getDouble(13));
            studentData.setStudentPassword(result.getString(14));
        }
        return studentData;
    }
    
    public void deleteRecord(String studentID) throws ClassNotFoundException,
                                                    SQLException {
        if(conn==null)
        {
            setDefaultConnection();
        }
        PreparedStatement statement =
            conn.prepareStatement("delete from studentdetail where collegeid=?");
        statement.setString(1, studentID);
        statement.executeUpdate();
    }
    
    
    public ResultSet getStudentDetailsResultSet() throws ClassNotFoundException,
                                                    SQLException {
        if(conn==null)
        {
            setDefaultConnection();
        }
        Statement statement = conn.createStatement();
        ResultSet result =
            statement.executeQuery("select * from studentdetail");

        return result;
    }
    
}
