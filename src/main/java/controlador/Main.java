/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        ConexionBDD bddGKanban=new ConexionBDD();
        bddGKanban.conectar();
    }
}
