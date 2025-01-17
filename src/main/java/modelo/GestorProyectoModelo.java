/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class GestorProyectoModelo extends PersonaModelo{
    private int idGestorProyecto;
    private String proyectosAsignados;
    private String Cargo;
    private String FechaAsig;
    private PersonaModelo idPersona;

    public GestorProyectoModelo() {
    }

    public GestorProyectoModelo(int idGestorProyecto, String proyectosAsignados, String Cargo, PersonaModelo idPersona) {
        this.idGestorProyecto = idGestorProyecto;
        this.proyectosAsignados = proyectosAsignados;
        this.Cargo = Cargo;
        this.idPersona = idPersona;
    }

    public GestorProyectoModelo(int idGestorProyecto, String proyectosAsignados, String Cargo, int idPersona, String nombre, String apellido, String cedula, String fechaNac, String rol, String correo) {
        super(idPersona, nombre, apellido, cedula, fechaNac, rol, correo);
        this.idGestorProyecto = idGestorProyecto;
        this.proyectosAsignados = proyectosAsignados;
        this.Cargo = Cargo;
    }

    public int getIdGestorProyecto() {
        return idGestorProyecto;
    }

    public void setIdGestorProyecto(int idGestorProyecto) {
        this.idGestorProyecto = idGestorProyecto;
    }

    public String getProyectosAsignados() {
        return proyectosAsignados;
    }

    public void setProyectosAsignados(String proyectosAsignados) {
        this.proyectosAsignados = proyectosAsignados;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getFechaAsig() {
        return FechaAsig;
    }

    public void setFechaAsig(String FechaAsig) {
        this.FechaAsig = FechaAsig;
    }

    public void setIdPersona(PersonaModelo idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "DATOS PERSONALES\n"+
                "Nombres: "+getNombre()+"\n"+
                "Apellidos: "+getApellido()+"\n"+
                "Cédula: "+getCedula()+"\n"+
                "Fecha de Nacimiento: "+getFechaNac()+"\n"+
                "Rol: "+getRol()+"\n"+
                "Correo Electrónico: "+getCorreo()+"\n"+
                "Proyectos Asignados: "+getProyectosAsignados()+"\n"+
                "Cargo: "+getCargo()+"\n"+
                "Fecha de Asignación: "+getFechaAsig();
    }
    
    
    
}
