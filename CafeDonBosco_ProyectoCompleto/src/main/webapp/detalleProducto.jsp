
<%@ page import="com.cafedonbosco.model.Producto" %>
<html><head><title>Detalle</title></head><body>
<%
  Producto producto = (Producto) request.getAttribute("producto");
  if (producto != null) {
%>
<h2><%= producto.getNombre() %></h2>
<p><%= producto.getDescripcion() %></p>
<p>Precio: $<%= producto.getPrecio() %></p>
<% } else { %>
<p>Producto no encontrado.</p>
<% } %>
</body></html>
