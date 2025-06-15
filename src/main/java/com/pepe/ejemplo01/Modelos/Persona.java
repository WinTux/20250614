
package com.pepe.ejemplo01.Modelos;

/**
 *
 * @author rusokverse
 */
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    
    public void asignarEdad(int e){
        if(e > 0)
            edad = e;
        else
            System.out.println("El valor "+ e + " es incorrecto");
    }
    
    public int obtenerEdad(){
        return edad;
    }
    public void asignarNombre(String x){
        nombre = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void caminar(){
        System.out.println("Soy una persona y estoy caminando.");
    }
}
