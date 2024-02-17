/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5_linsyposso;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author 29164
 */
public class Usuarios {

    private String nombre, apellido;
    private String contraseña;
    private Date fechaNacimiento;
    private String sexo;
    private String departamento;
    private String numId;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String contraseña, Date fechaNacimiento, String sexo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.departamento = departamento;

    }

    public Usuarios(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    @Override
    public String toString() {
        return sexo;
    }

    public String generarId() {
        String identificadorDept = "";
        if (departamento.equals("Francisco Morazán")) {
            identificadorDept = "01";
        } else if (departamento.equals("Cortés")) {
            identificadorDept = "02";
        } else if (departamento.equals("Comayagua")) {
            identificadorDept = "03";
        }
        Random rand = new Random();
        int identificadorMunicipio = 0;
        switch (departamento) {
            case "Francisco Morazán":
                identificadorMunicipio = rand.nextInt(28) + 1;
                break;
            case "Cortés":
                identificadorMunicipio = rand.nextInt(12) + 1;
                break;
            case "Comayagua":
                identificadorMunicipio = rand.nextInt(21) + 1;
                break;
        }

    //}
//}
