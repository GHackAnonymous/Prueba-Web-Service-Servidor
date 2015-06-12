/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

/**
 *
 * @author futpilari
 */
public class Querys {
    
    public String ConsultarTablaVentas(){
        String sql = "";
        
        sql = sql + " SELECT ";
        sql = sql + " `ventas`.`id_Ventas`, `ventas`.`Producto`,";
        sql = sql + " `ventas`.`Precio`,`ventas`.`Cantidad`";
        sql = sql + " FROM `webserviceprueba1server`.`ventas`;";
        
        return sql;
    }
}