package com.pepe.ejemplo01;

import com.pepe.ejemplo01.Modelos.Persona;
import com.pepe.ejemplo01.Modelos.Estudiante;

/**
 *
 * @author rusokverse
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        // Numéricos
        int x; // Entero
        float y;
        double z;
        
        x = 5;
        y = 5; // ¿Porqué se puede?
        z = 4.5;
        
        //x = 3.1415; // ¿Porqué no se puede?
        
        y = 1.5f;
        
        // POO
        Persona pp = new Persona();
        
        pp.asignarNombre ( "Pepe Perales");
        pp.asignarEdad(19);
        
        System.out.println("La varible x es: "+x);
        System.out.println("La persona pp es: "+pp.obtenerNombre() + " ("+ pp.obtenerEdad()+")");
        
        pp.asignarEdad(20);
        System.out.println("La persona pp es: "+pp.obtenerNombre() + " ("+ pp.obtenerEdad()+")");
        
        pp.asignarEdad(-47474747);
        System.out.println("La persona pp es: "+pp.obtenerNombre() + " ("+ pp.obtenerEdad()+")");
        
        // Herencia
        
        pp.caminar();
        
        Estudiante uerwke = new Estudiante();// Constructor por defecto
        uerwke.caminar();
        uerwke.asignarEdad(20);
        uerwke.asignarNombre("Ana");
        uerwke.setCarrera("Ing. de Sistemas");
        uerwke.setMatricula(1234);
    }

    private static int esPrimo(int n) {
        int cont = 0;
        for(int i = 1; i <= n; n++){
            
        }
        if(cont == 2){
            return 1;
        }else{
            return 0;
        }
    }
}
