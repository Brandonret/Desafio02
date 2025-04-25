
package com.cafedonbosco.controller;

import com.cafedonbosco.dao.ProductoDAO;
import com.cafedonbosco.model.Producto;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/productos")
public class ProductoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Producto> productos = ProductoDAO.obtenerProductos();
        req.setAttribute("productos", productos);
        req.getRequestDispatcher("productos.jsp").forward(req, resp);
    }
}
