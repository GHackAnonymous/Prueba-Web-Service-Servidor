/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import BaseDatos.ConexionBD;
import BaseDatos.Querys;
import BaseDatos.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author futpilari
 */
public class Consultar {
    
    public Object[] consultarVentas(int Operacion){
    
        ResultSet resultadoBD = null;
        ArrayList resultadoOux = (ArrayList<Venta>) new ArrayList<Venta>();
        Venta venta = null;
        ConexionBD objConexionBD = null;
        Statement conexion = null;
        Querys query = new Querys();
        
        
        objConexionBD = new ConexionBD();
        //System.out.println(Operacion);
        //System.out.println("Entrando en switch");
        switch (Operacion){
            case 1:
                //System.out.println("switch opcion 1");
                String strSql = query.ConsultarTablaVentas();
                //System.out.println("Creo query");
                //System.out.println(strSql);
                //System.out.println(objConexionBD);
                
                conexion = objConexionBD.Conectar();

                //System.out.println(conexion);
                
                try {
                    resultadoBD = objConexionBD.consultarQuery(conexion, strSql);
                } catch (SQLException ex) {
                    //Logger.getLogger(RecibirMensaje.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //System.out.println(resultadoBD);
                
                if(resultadoBD != null){
                    
                    venta = new Venta();
                    
                    try {
                        while (resultadoBD.next()) {
                            venta = new Venta();
                            
                            //System.out.println("ID: "+resultadoBD.getString("id_Ventas"));
                            venta.setId_venta(resultadoBD.getString("id_Ventas"));
                           // System.out.println("Producto: "+resultadoBD.getString("Producto"));
                            venta.setProducto(resultadoBD.getString("Producto"));
                           // System.out.println("Precio: "+resultadoBD.getString("Precio"));
                            venta.setPrecio(resultadoBD.getString("Precio"));
                           // System.out.println("Cantidad: "+resultadoBD.getString("Cantidad"));
                            venta.setCantidad(resultadoBD.getString("Cantidad"));
                            
                           // System.out.println(" ");
                            
                           // System.out.println(venta);

                            resultadoOux.add(venta);  
                            
                          //  System.out.println(resultado);
                        }
                    } catch (SQLException ex) {
                        //Logger.getLogger(RecibirMensaje.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    //System.out.println("Se pone a null el resultado");
                    return null;
                }
                
            break;
        }
        if(resultadoOux.size() != 0){
            Object[] resultado = resultadoOux.toArray();
            return resultado;
        }else{
            return null;
        }
    }  
}
