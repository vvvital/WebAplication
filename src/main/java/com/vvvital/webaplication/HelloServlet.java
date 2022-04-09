package com.vvvital.webaplication;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    /*public void init() {
        message = "Hello World!";
    }*/

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session= request.getSession();
        Cart cart= (Cart) session.getAttribute("cart");

        if (cart==null){
            cart=new Cart();
            cart.setName(request.getParameter("name"));
            cart.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        }else {
            String name= cart.getName();
            Integer quantity=cart.getQuantity();
        }




        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Hello your Cart: " + "</h1>");
        out.println("<h2>" + "Name: " + cart.getName()+"</h2>");
        out.println("<h2>" + "Quantity : "+cart.getQuantity() + "</h2>");
        out.println("</body></html>");


    }

    public void destroy() {
    }
}