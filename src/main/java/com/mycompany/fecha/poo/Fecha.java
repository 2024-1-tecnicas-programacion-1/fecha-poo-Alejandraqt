package com.mycompany.fecha.poo;

public class Fecha {    
    int dia;
    int mes;
    int anio;
        
    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/
    /**
    
     * Constructor de la clase Fecha: Inicializa los atributos de mi clase
     * @param dia
     * @param mes
     * @param anio
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Método para retornar la fecha corta
     * @return String: Retorna la fecha corta
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    String fechaCorta(){
        String resultado = dia+"/"+mes+"/"+anio;
        return resultado;
    }
    
    /**
     * Método para validar la fecha 
     * @return String: Valida si la fecha ingresada es correcta
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean validarFecha(){
        boolean resultado;
        
        if ((dia>0 && dia<=31) && (mes>0 && mes<=12) && (anio>0)) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    
    /**
     * Método para convertir el mes en letras 
     * @return String: Convierte el mes numerico a letras
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    String mesLetra(){
        String resultado;
        
        switch (mes) {
            case 1:
                resultado = "enero";
                break;
            case 2:
                resultado = "febrero";
                break;
            case 3:
                resultado = "marzo";
                break;
            case 4:
                resultado = "abril";
                break;
            case 5:
                resultado = "mayo";
                break;
            case 6:
                resultado = "junio";
                break;
            case 7:
                resultado = "julio";
                break;
            case 8:
                resultado = "agosto";
                break;
            case 9:
                resultado = "septiembre";
                break;
            case 10:
                resultado = "octubre";
                break;
            case 11:
                resultado = "noviembre";
                break;
            case 12:
                resultado = "diciembre";
                break;
            default:
                return "Número inválido. Debe ser entre 1 y 12.";
        }
        return resultado;
    }
    
    /**
     * Método para retornar la fecha larga
     * @return String: Retorna la fecha larga
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    String fechaLarga(){
        String mesNuevo = mesLetra();
        String resultado = dia+" de "+mesNuevo+" de "+anio;
        return resultado;
    }    
}

