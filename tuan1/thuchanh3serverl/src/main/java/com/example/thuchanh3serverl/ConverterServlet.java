package com.example.thuchanh3serverl;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int rate = Integer.parseInt(request.getParameter("rate"));
       int usd= Integer.parseInt(request.getParameter("usd"));
       int money=rate*usd;

       PrintWriter conC=response.getWriter();
       conC.println("<html>");
       conC.println("<h1> so tien"+money+"</h1>");
       conC.println("</html>");
    }

    public void destroy() {
    }
}