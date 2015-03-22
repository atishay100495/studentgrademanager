package com.teammates.studentgrademanager.service;


import com.teammates.studentgrademanager.dao.StudentDAO;
import com.teammates.studentgrademanager.model.StudentData;

import java.sql.Connection;
import java.sql.SQLException;

import java.util.List;


public class StudentServiceFacadeImpl implements IStudentServiceFacade {
    public StudentServiceFacadeImpl() {
        super();
    }

    private StudentDAO studentdao = new StudentDAO();
    
//    public void setConnectionJNDI(Connection conn) {
//        studentdao.setConnectionJNDI(conn);
//    }

    public boolean login(String username, String password) {
        boolean flag = false;
        try {
            flag = studentdao.login(username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean register(StudentData studentData) {
        int rows = 0;
        try {
            rows =
studentdao.register(studentData.getFirstname(), studentData.getLastname(), studentData.getStudentGender(),
                    studentData.getCollegeID(), studentData.getStudentEmail(),
                    studentData.getStudentBranch(), studentData.getAddressLine1(),
                    studentData.getAddressLine2(), studentData.getCity(),
                    studentData.getState(), studentData.getPincode(),
                    studentData.getStudentPhone(),
                    studentData.getStudentPercentMarks(),
                    studentData.getStudentPassword());
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

    public List<StudentData> getStudentDetails() {
        List<StudentData> list = null;
        try {
            list = studentdao.getStudentDetails();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public StudentData getStudentDetailsByStudentID(String studentID) {
        StudentData studentData = null;
        try {
            studentData = studentdao.getStudentDetailsByStudentID(studentID);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentData;
    }

    public boolean update(StudentData studentData, String studentID) {
        int rows = 0;
        try {
            rows =
        studentdao.update(studentData.getFirstname(), studentData.getLastname(), studentData.getStudentGender(),
                    studentData.getCollegeID(), studentData.getStudentEmail(),
                    studentData.getStudentBranch(), studentData.getAddressLine1(),
                    studentData.getAddressLine2(), studentData.getCity(),
                    studentData.getState(), studentData.getPincode(),
                    studentData.getStudentPhone(),
                    studentData.getStudentPercentMarks(),
                    studentData.getStudentPassword(), studentID);
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


    public void deleteRecord(String studentID) {
        try {
            studentdao.deleteRecord(studentID);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public List<StudentData> getStudentDetailsSortBy(String sortField) {
        List<StudentData> list = null;
        try {
            list = studentdao.getStudentDetailsSortBy(sortField);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
