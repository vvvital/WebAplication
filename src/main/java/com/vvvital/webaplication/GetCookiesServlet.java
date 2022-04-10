package com.vvvital.webaplication;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[]cookies= request.getCookies();

        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        for (Cookie c:cookies
             ) {
            writer.println("<h1>" +c.getName()+": "+c.getValue()+"<h1>");
        }
        writer.println("<html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
