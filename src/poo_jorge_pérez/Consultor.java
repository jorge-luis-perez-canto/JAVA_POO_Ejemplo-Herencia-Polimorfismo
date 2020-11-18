/*
 * Copyright (C) 2020 Universidad de San Carlos de Guatemala
 */

package poo_jorge_pérez;

/**
 * 
 * @author Jorge Luis Pérez Canto <george.jlpc@gmail.com>
 */
public class Consultor extends Trabajador {
    private int horas;
    private double tarifa;
    
    
    public Consultor(String nombre, int horas, double tarifa) {
        super(nombre);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    public double calcularPaga(){
        return (horas*tarifa);
    }
    
    public String toString(){
        return "Consultor: " + super.toString();
    }
    
}
