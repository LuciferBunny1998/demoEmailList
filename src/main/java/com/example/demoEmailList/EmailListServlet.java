package com.example.demoEmailList;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = "/EmailList.html";
        String action = req.getParameter("action");
        if(action==null)
            action="join";
        if(action.equals("join")){
            url = "/EmailList.html";
            System.out.println(url);}
        else if(action.equals("add"))
        {
            String email = req.getParameter("email");
            String name = req.getParameter("name");
            String phone = req.getParameter("phone");

            User user = new User(email,name,phone);
            //UserDB.insert(user);

            req.setAttribute("user", user);
            url = "/Thanks.jsp";
            System.out.println(url);
        }
        getServletContext().getRequestDispatcher(url).forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
