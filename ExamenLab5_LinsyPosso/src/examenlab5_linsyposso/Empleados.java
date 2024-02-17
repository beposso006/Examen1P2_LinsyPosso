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
public class Empleados extends Usuarios {

    private String carrera;
    private String puestoLaboral;
    private int añostrabajando;

    public Empleados() {
    }

    public Empleados(String carrera, String puestoLaboral, int añostrabajando, String nombre, String apellido, String contraseña, Date fechaNacimiento, String sexo, String departamento) {
        super(nombre, apellido, contraseña, fechaNacimiento, sexo, departamento);
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.añostrabajando = añostrabajando;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public int getAñostrabajando() {
        return añostrabajando;
    }

    public void setAñostrabajando(int añostrabajando) {
        this.añostrabajando = añostrabajando;
    }

    @Override
    public String toString() {
        return "Empleados{" + "carrera=" + carrera + ", puestoLaboral=" + puestoLaboral + ", a\u00f1ostrabajando=" + añostrabajando + '}';
    }

}
