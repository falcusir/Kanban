/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.MEquipoModelo;

/**
 *
 * @author Dell Core i7
 */
public class MEquipoControlador {
     //INSTANCIAR UN OBJETO DEL MODELO A INSERTAR
    private MEquipoModelo me;
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
    public void insertarMEquipo(MEquipoModelo mem){
        //1. UTILIZAR UNA EXCEPCIÓN SIEMPRE 
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO
            String sentenciaSQL="call sp_insertarMiembroE ('"+mem.getNombre()+"','"+mem.getApellido()+"','"+mem.getCedula()+"','"+mem.getFechaNac()+"','"+mem.getRol()+"','"+mem.getCorreo()+"','"+mem.getFechaIngesoPro()+"','"+mem.getEstado()+"');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int res = ejecutar.executeUpdate();//poner play a la sentencia sql // UPDATE -->recibo un REGISTRO de datos
            if (res > 0) {//>o transacción exitosa
                JOptionPane.showMessageDialog(null,"Miembro del Equipo Creado con éxito");//llamar ventanas emergentes--sacar mensaje de diálogo
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null,"El Miembro del Equipo no ha sido creado,"
                        + " revise que los datos ingresados sean correctos");
            }    
        } catch (SQLException e) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO
            JOptionPane.showMessageDialog(null,"Comuníquese con el Administrador para solicitar ayuda");
        }    
    }
    
    public ArrayList<Object[]> buscarMiembroE(String cedula) { 
            ArrayList<Object[]> listaObject=new ArrayList<>(); // instncia un objeto de tipo arrayList ingresa la cédula como parámetro
        try {
            // declara de tipo String una variable donde llama al sp con la cédula como parámetro
            String sql = "call sp_buscarMiembroE_porCedula('"+cedula+"');"; 
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            resultado = ejecutar.executeQuery(); // QUERY -->recibo un conjunto de datos
            int cont = 1;
            while (resultado.next()) {
                Object[] obmiembro = new Object[9]; //instancia un arreglo tipo objeto de 6
                for (int i = 1; i < 9; i++) {
                    obmiembro[i] = resultado.getObject(i);//obtener los valores de cada columna
                }
                obmiembro[0]=cont;
                listaObject.add(obmiembro);
                cont++;
            }
            ejecutar.close();//cierra la conexion
            return listaObject;//retorna el registro del miembro del equipo
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNÍQUESE CON EL ADMINISTRADOR");
        }
        return null;
    }
    
    public ArrayList<Object[]> datosMEquipo() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_listarMiembrosE();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[]  obmiembro = new Object[9];
                for (int i = 1; i <9; i++) {
                    obmiembro[i] = resultado.getObject(i);
                }
                obmiembro[0]=cont;
                listaObject.add( obmiembro);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNÍQUESE CON EL ADMINISTRADOR");

        }

        return null;
    }
    
    public void actualizarMiembroE(MEquipoModelo mem) {
        try {
            String sentenciaSQL = "call sp_actualizarMiembroE ('"+mem.getCedula()+"','"+mem.getNombre()+"','"+mem.getApellido()+"','"+mem.getFechaNac()+"','"+mem.getCorreo()+"','"+mem.getFechaIngesoPro()+"','"+mem.getEstado()+"');";
            //String sentenciaSQL = "sp_actualizarMiembroE ('"+mem.getNombre()+"','"+mem.getApellido()+"','"+mem.getCedula()+"','"+mem.getFechaNac()+"','"+mem.getRol()+"','"+mem.getCorreo()+"','"+mem.getFechaIngesoPro()+"','"+mem.getEstado()+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sentenciaSQL);
            int resultado1 = ejecutar.executeUpdate();
            if (resultado1 > 0) {
                JOptionPane.showMessageDialog(null, "Miembro del Equipo Actualizado con Éxito");
            
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Comuníquese con el administrador");
        }
    }

    public void eliminarMiembroE(String cedula) {
        try {
            String sql = "call sp_eliminarMiembroE('" + cedula + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int resultado1 = ejecutar.executeUpdate();
            if (resultado1 > 0) {
                JOptionPane.showMessageDialog(null, "Miembro del Equipo Eliminado con éxito");
 
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos a eliminar");
      
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Comuníquese con el administrador");
        }
    }
    
    
    
}


