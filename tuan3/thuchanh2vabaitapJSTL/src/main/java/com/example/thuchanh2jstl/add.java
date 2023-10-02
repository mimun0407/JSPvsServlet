package com.example.thuchanh2jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "add", value = "/add")
public class add extends HttpServlet {
    List<Product> products;

    @Override
    public void init() throws ServletException {
        products = new ArrayList<>();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String prPicture = req.getParameter("ig");
        String prName = req.getParameter("Name");
        String prCost = req.getParameter("Cost");

        products.add(new Product(prName,prCost,prPicture));
        HttpSession session = req.getSession();
        session.setAttribute("products" , products);
        req.getRequestDispatcher("home.jsp").forward(req,resp);
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}

