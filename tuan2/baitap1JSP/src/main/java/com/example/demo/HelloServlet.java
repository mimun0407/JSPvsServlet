package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet (name="hello" ,value="")
public class HelloServlet extends HttpServlet {

private List<Customer>customers;

    @Override
    public void init()  {
      customers=new ArrayList<>();
      customers.add(new Customer("sao","12-3-4566","gei","https://deviet.vn/wp-content/uploads/2019/04/vuong-quoc-anh.jpg"));
      customers.add(new Customer("saoMai","12-3-4","gfi","https://deviet.vn/wp-content/uploads/2019/04/vuong-quoc-anh.jpg"));
      customers.add(new Customer("saoVAI","1-3-46","gbh","https://deviet.vn/wp-content/uploads/2019/04/vuong-quoc-anh.jpg"));

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.setAttribute("cust",customers);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}