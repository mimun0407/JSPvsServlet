package com.example.thuchanh2severl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/login")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username=req.getParameter("username");
        String password =req.getParameter("password");


        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        if ("admin".equals(username) && "admin".equals(password)){
            writer.println("<h1> welcome to my shit, you can eat more than me</h1>");
        }
        else {
            writer.println("<h1>Login like fucking cunt, get out of my fucking website</h1>");
        }
        writer.println("</html>");
    }

    public void destroy() {
        super.destroy();
    }
}