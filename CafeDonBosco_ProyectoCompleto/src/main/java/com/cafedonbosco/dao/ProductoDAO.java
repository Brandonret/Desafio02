
package com.cafedonbosco.dao;

import com.cafedonbosco.model.Producto;
import java.sql.*;
import java.util.*;

public class ProductoDAO {
    public static List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM productos")) {
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getDouble("precio"));
                productos.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productos;
    }
}
