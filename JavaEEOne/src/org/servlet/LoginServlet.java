package org.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import org.model.*;
import org.dao.*;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        request.setCharacterEncoding("gb2312");
        LoginDao loginDao =new LoginDao();
        Login login = loginDao.checkLogin(request.getParameter("name"),request.getParameter("password"));
        if(login!=null){
            HttpSession session = request.getSession();
            session.setAttribute("login",login);
            response.sendRedirect("main.jsp");
        }else {
            response.sendRedirect("erro.jsp");
        }
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        doGet(request,response);
    }
}
