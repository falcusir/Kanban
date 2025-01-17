/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.GestorProyectoModelo;

/**
 *
 * @author Carlos
 */
public class GestorProyectoControlador {
     //INSTANCIAR UN OBJETO DEL MODELO A INSERTAR
    private GestorProyectoModelo gp;
    //INSTANCIAR LA CONEXION A LA BASE DE DATOS
    //Tiene todos los drivers de conexión
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITE CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection)conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL a traves de cadenas
    PreparedStatement ejecutar;
    //obtener resultados de la consulta/estructura de datos--colecciones--fila o conjunto de resultados
    ResultSet resultado;
    
        //METODO DE TRANSACCIONABILIDAD
    public void insertarGestorProyecto(GestorProyectoModelo gpm){
        //1. UTILIZAR UNA EXCEPCIÓN SIEMPRE 
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO
            String sentenciaSQL="call sp_insertarGestorProyecto ('"+gpm.getNombre()+"','"+gpm.getApellido()+"','"+gpm.getCedula()+"','"+gpm.getFechaNac()+"','"+gpm.getRol()+"','"+gpm.getCorreo()+"','"+gpm.getProyectosAsignados()+"','"+gpm.getCargo()+"', '"+gpm.getFechaAsig()+"');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int res = ejecutar.executeUpdate();//poner play a la sentencia sql
            if (res > 0) {//>o transacción exitosa
                JOptionPane.showMessageDialog(null,"Gestor de Proyecto Creado con éxito");//llamar ventanas emergentes--sacar mensaje de diálogo
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null,"El Gestor de Proyecto no ha sido creado,"
                        + " revise que los datos ingresados sean correctos");
            }    
        } catch (SQLException e) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO
            JOptionPane.showMessageDialog(null,"Comuníquese con el Administrador para solicitar ayuda");
        }
        
    
    }
    
}
