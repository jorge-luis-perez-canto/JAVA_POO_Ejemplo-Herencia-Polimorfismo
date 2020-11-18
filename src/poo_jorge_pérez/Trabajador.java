/*
 * Copyright (C) 2020 Universidad de San Carlos de Guatemala
 */

package poo_jorge_pérez;
import java.util.Date;
/**
 * 
 * @author Jorge Luis Pérez Canto <george.jlpc@gmail.com>
 */
public class Trabajador {
    
    // Atributos
    private String nombre;
    private String puesto;
    private String dirección;
    private String teléfono;
    private Date fechaNacimiento;
    private Date fechaContrato;
    
    
    // Constructor
    public Trabajador(String nombre) {
        this.nombre = nombre;
    }
    
    // Métodos
    public String toString(){
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    
    public double calcularPaga() {
        return 0.0;
    }
    
}
