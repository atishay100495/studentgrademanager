package com.teammates.studentgrademanager.controller;


import com.teammates.studentgrademanager.service.IStudentServiceFacade;
import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StudentLoginServlet extends HttpServlet {

    private static final String CONTENT_TYPE =
        "text/html; charset=windows-1252";
    private static final long serialVersionUID = -5582188381019862064L;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException,
                                                               IOException {

        response.setContentType(CONTENT_TYPE);
        // get request parameters for userID and password
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        
        
        //Use JNDI Lookup
        //Hashtable env = new Hashtable();
        //env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        //env.put(Context.PROVIDER_URL, "t3://localhost:7101");
        //Context context;
        try {
            //context = new InitialContext(env); //takes to jndi tree in application server
            //DataSource dataSource = (DataSource)context.lookup("JDBC/DataSource1");
            //Connection connection = dataSource.getConnection();
            
            IStudentServiceFacade facade = new StudentServiceFacadeImpl();
            //facade.setConnectionJNDI(connection);
            boolean result = facade.login(user, pwd);
            
            if(result==true)
            {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                //setting session to expiry in 2 min
                session.setMaxInactiveInterval(2 * 60);
                Cookie userName = new Cookie("user", user);
                userName.setMaxAge(2 * 60);
                response.addCookie(userName);
                response.sendRedirect("successStudentLogin.jsp");
            }
            else {
                RequestDispatcher rd =
                    getServletContext().getRequestDispatcher("/StudentLoginSession.html");
                PrintWriter out = response.getWriter();
                out.println("<font color=red>Either user name or password is wrong.</font>");
                rd.include(request, response);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
