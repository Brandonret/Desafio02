
package com.cafedonbosco.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usuario = req.getParameter("username");
        String clave = req.getParameter("password");

        if ("admin".equals(usuario) && "admin123".equals(clave)) {
            req.getSession().setAttribute("usuario", usuario);
            resp.sendRedirect("productos");
        } else {
            resp.sendRedirect("login.jsp?error=1");
        }
    }
}
