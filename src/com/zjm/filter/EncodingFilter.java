package com.zjm.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodingFilter extends DefaultFilter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;

        req.setCharacterEncoding("utf-8");
        MyHttpServletRequest myHttpServletRequest = new MyHttpServletRequest(req);
        filterChain.doFilter(myHttpServletRequest,resp);
    }

    class MyHttpServletRequest extends HttpServletRequestWrapper{

        public MyHttpServletRequest(HttpServletRequest request) {
            super(request);
        }

        @Override
        public String getParameter(String name) {
            String value = super.getParameter(name);
            if ("GET".equals(super.getMethod())){
                try {
                    value = new String(value.getBytes("iso-8859-1"),"utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            return value;
        }
    }
}
