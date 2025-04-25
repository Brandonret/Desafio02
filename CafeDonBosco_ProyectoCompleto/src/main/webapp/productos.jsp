
<%@ page import="java.util.List, com.cafedonbosco.model.Producto" %>
<html><head><title>Productos</title></head><body>
<h2>Listado de Productos</h2>
<%
  List<Producto> productos = (List<Producto>) request.getAttribute("productos");
  for (Producto p : productos) {
%>
  <div>
    <h3><%= p.getNombre() %></h3>
    <p><%= p.getDescripcion() %></p>
    <p>Precio: $<%= p.getPrecio() %></p>
    <a href="detalleProducto.jsp?id=<%= p.getId() %>">Ver Detalles</a>
  </div>
<% } %>
</body></html>
