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

@WebServlet (name = "database" , value = "")
public class DatabaseRole extends HttpServlet {
    private List<Product>productsList;
    @Override
    public void init() {
        productsList=new ArrayList<>();
        productsList.add(new Product("iphone13","1500usd","https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS16WxMvQ6zVwkwb_s8PakAAtPzEs8RTxzQyOJfJqPrIBLfJdk0LMWW37pm-Tq3YBHVlIDZLkEM_GOD4Sv3BkGwPJM-_hOPapnR5raqetdwXv7GhuGJc14ezcdgOBgVMwx-WxNi6g&usqp=CAc"));
        productsList.add(new Product("iphone14","1500usd","https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcTPLxudIISIS-ZZvh4ZJcMrpJiyB-5VGIRwdTbgNUrw363yqEwQauFGWaKvBXaXxGpEcJygFRMX95FERgN4D-y9dB-urM_sb5At0iNRTRYSGl0FGycpRJQdDzG1d11A_YsH5G10QA&usqp=CAc"));
        productsList.add(new Product("iphone15","1500usd","https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcRt7hVeRE44jLaFseMHTOy892EVSTdkqQQunKF4F-75g_2O5jgvgtyAh0y6ZFwbYU_hFBPv6o7JbWlIIyGeB3Q2ZCDJwFQtB_rqOSzLncfoE0Zy4mLnd_VKTzBRPPnjMdz1rwxlnfY&usqp=CAc"));


    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session= req.getSession();
        session.setAttribute("product",productsList);
        req.getRequestDispatcher("home.jsp").forward(req,resp);

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
