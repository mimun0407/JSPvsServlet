package com.example.customermanagement.controller;

import com.example.customermanagement.model.Customer;
import com.example.customermanagement.service.CustomerService;
import com.example.customermanagement.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private final CustomerService customerService=new CustomerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if (action==null){
            action="";
            switch (action){
                case "create":
                    createCustomer(req, resp);
                   break;
                case "edit":
                    updateCustomer(req,resp);
                    break;
                case "delete":
                    deleteCustomer(req, resp);
                    break;
                default:
                    break;
            }

        }
    }

    private void createCustomer(HttpServletRequest req, HttpServletResponse resp) {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String address=req.getParameter("address");
        int id=(int)(Math.random()*1000);

        Customer customer=new Customer(id,name,email,address);
        this.customerService.save(customer);
        RequestDispatcher dispatcher=req.getRequestDispatcher("customer/create.jsp");
        req.setAttribute("message","New customer was created");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void deleteCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer.equals(null)) {
            this.customerService.remove(id);
            resp.sendRedirect("/customers");
        } else {
            dispatcher = req.getRequestDispatcher("error-404.jsp");
            dispatcher.forward(req,resp);
        }
    }
    private void updateCustomer(HttpServletRequest request,HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer==null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else {
            customer.setName(name);
            customer.setEmail(email);
            customer.setAddress(address);
            this.customerService.update(id,customer);
            request.setAttribute("customer",customer);
            request.setAttribute("message","Customer Information was update");
            dispatcher=request.getRequestDispatcher("customer/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action =req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                showCreateForm(req,resp);
                break;
            case "edit":
                showEditForm(req,resp);
                break;
            case "delete":
                shotDeleteForm(req,resp);
                break;
            case "view":
                viewCustomer(req,resp);
                break;
            default:
                listCustomer(req,resp);
                break;
        }
    }

    private void listCustomer(HttpServletRequest req, HttpServletResponse resp) {
        List<Customer>customers=this.customerService.findAll();
        req.setAttribute("customers",customers);

        RequestDispatcher dispatcher=req.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void viewCustomer(HttpServletRequest req, HttpServletResponse resp) {
        int id= Integer.parseInt(req.getParameter("id"));
        Customer customer=this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null){
            dispatcher=req.getRequestDispatcher("error-404.jsp");
        }else {
            req.setAttribute("customer",customer);
            dispatcher=req.getRequestDispatcher("customer/view.jsp");
        }
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void shotDeleteForm(HttpServletRequest req, HttpServletResponse resp) {
        int id= Integer.parseInt(req.getParameter("id"));
        Customer customer=this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer==null) {
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        }
        else {
            req.setAttribute("customer",customer);
            dispatcher=req.getRequestDispatcher("customer/delete.jsp");
        }
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        } else {
            req.setAttribute("customer", customer);
            dispatcher = req.getRequestDispatcher("customer/edit.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        private void showCreateForm (HttpServletRequest req, HttpServletResponse resp){
        RequestDispatcher dispatcher=req.getRequestDispatcher("customer/create.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

}
