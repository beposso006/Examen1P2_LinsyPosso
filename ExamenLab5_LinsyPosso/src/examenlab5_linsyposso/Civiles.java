/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5_linsyposso;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 29164
 */
public class Civiles extends Usuarios {

    ArrayList<Tramites> lista = new ArrayList();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contraseña, Date fechaNacimiento, String sexo, String departamento) {
        super(nombre, apellido, contraseña, fechaNacimiento, sexo, departamento);
    }

    public ArrayList<Tramites> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Tramites> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Civiles{" + "lista=" + lista + '}';
    }

}
