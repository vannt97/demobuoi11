package com.cybersoft.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//annotation ten dinh danh (ky hieu @)
//urlpattern dinh nghia đường dẫn

@WebServlet(name = "demobuoi11", urlPatterns = "/home-page")
public class HomePage extends HttpServlet {
//    truyen tham so: ?tenthamso=giatri&tenthamso=giatri method get
    @Override
    public void init() throws ServletException {
//        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String param1 = req.getParameter("param1");
//        String param2 = req.getParameter("param2");
//        System.out.println(param1);
//        System.out.println(param2);
//        resp.getWriter().println("hello world");
        req.getRequestDispatcher("/webapp/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
