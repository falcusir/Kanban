/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class MEquipoModelo extends PersonaModelo{
    private int dMiembro;
    private String fechaIngesoPro;
    private String estado;
    private PersonaModelo idPersona;

    public MEquipoModelo() {
    }

    public MEquipoModelo(int dMiembro, String fechaIngesoPro, String estado, PersonaModelo idPersona) {
        this.dMiembro = dMiembro;
        this.fechaIngesoPro = fechaIngesoPro;
        this.estado = estado;
        this.idPersona = idPersona;
    }

    public MEquipoModelo(int dMiembro, String fechaIngesoPro, String estado, int idPersona, String nombre, String apellido, String cedula, String fechaNac, String rol, String correo) {
        super(idPersona, nombre, apellido, cedula, fechaNac, rol, correo);
        this.dMiembro = dMiembro;
        this.fechaIngesoPro = fechaIngesoPro;
        this.estado = estado;
    }

    public int getdMiembro() {
        return dMiembro;
    }

    public void setdMiembro(int dMiembro) {
        this.dMiembro = dMiembro;
    }

    public String getFechaIngesoPro() {
        return fechaIngesoPro;
    }

    public void setFechaIngesoPro(String fechaIngesoPro) {
        this.fechaIngesoPro = fechaIngesoPro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
                "Rol/Cargo: "+getRol()+"\n"+
                "Correo Electrónico: "+getCorreo()+"\n"+
                "Fecha de Ingreso al Proyecto: "+getFechaIngesoPro()+"\n"+
                "Estado: "+getEstado()+"\n";
    }
    
}
