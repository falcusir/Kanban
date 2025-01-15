/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Dell Core i7
 */
public class MainC {
    public static void main(String[] args) {
        //probar que este conectada a la base de datos
        ConexionBDD bddkanban = new ConexionBDD();
        bddkanban.conectar();
    }
    
}
