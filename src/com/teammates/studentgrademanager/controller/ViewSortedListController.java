package com.teammates.studentgrademanager.controller;

import com.teammates.studentgrademanager.model.StudentData;
import com.teammates.studentgrademanager.service.IStudentServiceFacade;
import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class ViewSortedListController extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";
    private static final long serialVersionUID = 1376505950084315872L;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        
        IStudentServiceFacade facade = new StudentServiceFacadeImpl();
        List<StudentData> list = facade.getStudentDetails();
        
        List<StudentData> sortedList = sortList(list);
    
        request.setAttribute("list", sortedList); //request scope
        
        //Navigation rule: hard coded, tight coupling
        if(!list.isEmpty()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("ViewStudentDetails.jsp");
            dispatcher.forward(request, response);
        }
        else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }
    
    public List<StudentData> sortList(List<StudentData> list) {
        List<StudentData> newList = new ArrayList<StudentData>();
        Object[] objList = list.toArray();

        for(int i=0;i<objList.length-1;i++) {
            int max = i;
            StudentData data_max = (StudentData)objList[max];
            for(int j=i+1;j<objList.length;j++) {
                StudentData data_j = (StudentData)objList[j];
                if(data_j.getStudentPercentMarks() >= data_max.getStudentPercentMarks()) {
                    max = j;
                    data_max = (StudentData)objList[j];
                }
            }
            Object temp = objList[i];
            objList[i] = objList[max];
            objList[max] = temp;
        }
        
        
        
        for(int i=0;i<objList.length;i++) {
            System.out.println(((StudentData)objList[i]).getFirstname());
            newList.add((StudentData)objList[i]);
        }
        
        return newList;
    }
}
