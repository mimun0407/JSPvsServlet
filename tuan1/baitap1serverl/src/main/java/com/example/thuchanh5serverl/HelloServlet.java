package com.example.thuchanh5serverl;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Double Value= Double.valueOf(request.getParameter("value"));
        Double discount= Double.valueOf(request.getParameter("discount"));
        Double no=Value*discount;
        Double now=Value-no;
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>"+now+"<h1>");
        printWriter.println("</html>");
    }

    public void destroy() {
    }
}