package com.zjm.servlet;

import com.zjm.Dao.DaoImpl.UserDaoImpl;
import com.zjm.Dao.IUserDao;
import com.zjm.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    private IUserDao dao = new UserDaoImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "login":
                login(request,response);break;
            case "register":
                register(request,response);break;
        }
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String[] hobbies = request.getParameterValues("hobbies");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String addrs = request.getParameter("addrs");
        if (username.equals("") || username == null || password ==null || password.equals("")){
            request.setAttribute("msg","用户名或者密码不能为空");
            request.getRequestDispatcher("register.jsp").forward(request,response);
            return;
        }
        User user = new User(username,password,sex,hobbies,phone,email,addrs);
        int affected = dao.register(user);
        if (affected > 0){
            request.setAttribute("msg","注册成功");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }else {
            request.setAttribute("msg","注册失败");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("")||password.equals("")||password==null||username==null){
            request.setAttribute("msg","登录失败，用户名或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            return;
        }
        User user = dao.checkUser(username,password);
        if (user == null){
            request.setAttribute("msg","登录失败，用户名或密码错误");
            System.out.println("登录失败");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            return;
        }
        HttpSession session = request.getSession();
        session.setAttribute("username",user.getUsername());
        request.getRequestDispatcher("shop.jsp").forward(request,response);
    }
}
