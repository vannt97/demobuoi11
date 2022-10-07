package com.cybersoft.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "wellcome page", urlPatterns = "/wellcome")
public class WellcomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/webapp/wellcome_page.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if(Objects.equals(user, "duong") && Objects.equals(pass,"123")){
            System.out.println("thanh cong");
            resp.sendRedirect(req.getContextPath() + "/wellcome");
        }else{
            System.out.println("that bai");
            req.getRequestDispatcher("/webapp/index.jsp").forward(req,resp);
        }
    }
}
