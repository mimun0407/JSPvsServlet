package com.example.thuchanh4serverl;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {  String username=request.getParameter("username");
        String password=request.getParameter("password");
        String message;
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        if (username.equals("admin") && password.equals("admin")){
            message="conMeMay chao mung den voi dia nguc thang di ";
        }
        else {
            message="conMeMay Cuts ";
        }
        printWriter.println("<h1>"+message+"</h1>");
        printWriter.println("</html>");

    }

    public void destroy() {
        super.destroy();
    }
}