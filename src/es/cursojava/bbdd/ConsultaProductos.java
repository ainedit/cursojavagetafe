package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.cursojava.ficheros.ArchivoServicio;
import es.cursojava.utils.UtilidadesBD;

public class ConsultaProductos {
    private static final String CONSULTA_PRODUCTOS="SELECT "+
    		"ID,NOMBRE,CATEGORIA,PRECIO,STOCK,FECHA_ALTA,ESTADO,CODIGO_SKU,CREADO_POR,IVA " +
    		"FROM TB_PRODUCTOS_PROFE";
    
    public static void main(String[] args) {

    	List<Producto> productos = consultaProductos();
    	ArchivoServicio.crearArchivoProductos("./recursos/productos.txt", productos, ";");
    }

    public static List<Producto> consultaProductos() {
        
        Connection conexion = UtilidadesBD.crearConexion();
        Statement st = null;
        ResultSet rs = null;
        List<Producto> productos = new ArrayList<>();
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(CONSULTA_PRODUCTOS);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("NOMBRE");
                String categoria = rs.getString("CATEGORIA");
                double precio = rs.getDouble("PRECIO");
                String stock = rs.getString("STOCK");
                String estado = rs.getString("ESTADO");
                String sku = rs.getString("CODIGO_SKU");
                String creador = rs.getString("CREADO_POR");
                int iva = rs.getInt("IVA");
                Date fechaAlta = rs.getDate("FECHA_ALTA");
                
                Producto p = new Producto(id, nombre, categoria, precio, id, fechaAlta, estado, sku, creador, iva);
                productos.add(p);
                //System.out.println(id);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            UtilidadesBD.cierraConexion(conexion);
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        System.out.println("TERMINA");
        for (Producto producto : productos) {
			System.out.println(producto);
		}
        
        return productos;
    }
    
    private static void insertProductos(List<Producto> productos) {
    	
    	for (Producto producto : productos) {
			String insert = "INSERT INTO TB_PRODUCTOS_PROFE VALUES("+producto.getId()+""; 
		}
    	
    }


}


