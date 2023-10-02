package com.example.thuchanh2jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            Customer customer=new Customer(username,password);

            if (CheckPassword.check(username, password)){
                HttpSession session=request.getSession();
                session.setAttribute(String.valueOf(customer),"customer");
                response.sendRedirect("home.jsp");
            }
            else{
                response.sendRedirect("login-error.jsp");
            }
    }

    public void destroy() {
        super.destroy();
    }
}
