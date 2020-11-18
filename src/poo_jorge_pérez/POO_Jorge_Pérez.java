/*
 * Copyright (C) 2020 Universidad de San Carlos de Guatemala
 */

package poo_jorge_pérez;

/**
 * 
 * @author Jorge Luis Pérez Canto <george.jlpc@gmail.com>
 */
public class POO_Jorge_Pérez {
    public static void main(String[] args) {
        
        Trabajador[] trabajadores = new Trabajador[2];
        
        trabajadores[0] = new Empleado("Jorge", 8000);
        trabajadores[1] = new Consultor("Alejandro", 40, 150.00);
        
        for (int i = 0; i < 2; i++) {
            System.out.println(trabajadores[i].calcularPaga());
        }
        
    }
}
