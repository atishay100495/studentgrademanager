package com.teammates.studentgrademanager.controller;

import com.teammates.studentgrademanager.model.StudentData;
import com.teammates.studentgrademanager.service.IStudentServiceFacade;
import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;
import java.io.IOException;

import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class StudentRegistrationController extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";
    private static final long serialVersionUID = -6211165240022145073L;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        
        IStudentServiceFacade facade = new StudentServiceFacadeImpl();
        List<StudentData> list = facade.getStudentDetails();
        request.setAttribute("list", list); //request scope
        
        //Navigation rule: hard coded, tight coupling
        if(!list.isEmpty()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("StudentRegistrationDetails.jsp");
            dispatcher.forward(request, response);
        }
        else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        }
    }
}
