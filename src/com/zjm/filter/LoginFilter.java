package com.zjm.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter extends DefaultFilter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        String uri = request.getRequestURI();
        String username = (String)request.getSession().getAttribute("username");


        System.out.println(uri);

        if (uri.endsWith("register.jsp") || uri.endsWith("UserServlet")
                || uri.endsWith("login.jsp") || uri.endsWith("index.jsp")){
            chain.doFilter(request,response);
        }else {
            if (username == null || "".equals(username)){
                response.sendRedirect("login.jsp");
            }else {
                chain.doFilter(request,response);
            }
        }
    }


}
