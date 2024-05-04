package com.proyectoasistencia.prasis.models;

public class InstructorModel {
    private int Documento;
    private int IDUsuarioInstructor;
    private int IDTipoDocumento;
    private String Nombres;
    private String  Apellidos;
    private int IDGenero;
    private int Telefono;
    private String Area;
    private int IDRol;
    private int IDSede;

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public int getIDUsuarioInstructor() {
        return IDUsuarioInstructor;
    }

    public void setIDUsuarioInstructor(int IDUsuarioInstructor) {
        this.IDUsuarioInstructor = IDUsuarioInstructor;
    }

    public int getIDTipoDocumento() {
        return IDTipoDocumento;
    }

    public void setIDTipoDocumento(int IDTipoDocumento) {
        this.IDTipoDocumento = IDTipoDocumento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getIDGenero() {
        return IDGenero;
    }

    public void setIDGenero(int IDGenero) {
        this.IDGenero = IDGenero;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public int getIDRol() {
        return IDRol;
    }

    public void setIDRol(int IDRol) {
        this.IDRol = IDRol;
    }

    public int getIDSede() {
        return IDSede;
    }

    public void setIDSede(int IDSede) {
        this.IDSede = IDSede;
    }
}
