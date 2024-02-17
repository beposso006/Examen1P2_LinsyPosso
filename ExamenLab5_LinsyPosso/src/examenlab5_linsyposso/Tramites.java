/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5_linsyposso;

import java.util.Date;

/**
 *
 * @author 29164
 */
public class Tramites {

    private String nombre;
    private String descripcion;
    private Date fechaEnvio;
    private Usuarios numId;

    public Tramites() {
    }

    public Tramites(String nombre, String descripcion, Date fechaEnvio, Usuarios numId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEnvio = fechaEnvio;
        this.numId = numId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Usuarios getNumId() {
        return numId;
    }

    public void setNumId(Usuarios numId) {
        this.numId = numId;
    }

    @Override
    public String toString() {
        return "Tramites{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fechaEnvio=" + fechaEnvio + ", numId=" + numId + '}';
    }

}
