package com.vvvital.webaplication;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteCoodiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie=new Cookie("id","");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
