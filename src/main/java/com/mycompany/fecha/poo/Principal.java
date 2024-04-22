package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    /**
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int diaRecibido = sc.nextInt();
        int mesRecibido = sc.nextInt();
        int anioRecibido = sc.nextInt();
        
        Fecha miFecha = new Fecha(diaRecibido, mesRecibido, anioRecibido);
        
        if(miFecha.validarFecha()){
            System.out.println("La fecha es válida");
            System.out.println(miFecha.fechaLarga());
        }
    }
}
