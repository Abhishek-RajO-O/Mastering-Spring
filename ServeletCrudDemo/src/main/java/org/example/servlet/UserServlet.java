package org.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request , HttpServletResponse response){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

    }
    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse response){

    }
    @Override
    public void doPut(HttpServletRequest request , HttpServletResponse response){

    }
    @Override
    public void doDelete(HttpServletRequest request , HttpServletResponse response){

    }
}
