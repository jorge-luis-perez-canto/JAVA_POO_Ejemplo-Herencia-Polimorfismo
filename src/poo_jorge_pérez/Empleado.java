/*
 * Copyright (C) 2020 Universidad de San Carlos de Guatemala
 */

package poo_jorge_pérez;

/**
 * 
 * @author Jorge Pérez <george.jlpc@gmail.com>
 */
public class Empleado extends Trabajador {
    private double sueldo;
    private double igss;
    
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.igss = 0.483 * sueldo;
    }
    
    public double calcularPaga(){
        return (sueldo - igss);
    }
    
    public String toString() {
        return "Empleado: " + super.toString();
    }
}
