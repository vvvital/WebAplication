package com.vvvital.webaplication;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Cookie cookie1=new Cookie("id","02051977");
            cookie1.setMaxAge(60*60*24);
            Cookie cookie2=new Cookie("someID","123456789");
            cookie2.setMaxAge(60*60*24);
            response.addCookie(cookie1);
            response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
