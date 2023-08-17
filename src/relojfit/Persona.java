/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojfit;

/**
 *
 * @author juanb
 */
public class Persona {
    
    private String nombre, apellido;
    private float altura;
    private int edad;
    private Reloj reloj;

    public Persona(String nombre, String apellido, float altura, int edad, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.edad = edad;
        this.reloj = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public float getAltura() {
        return altura;
    }
    
    
     public void asociarReloj(Reloj reloj) {
        this.reloj = reloj;
    }
     
     public void verHora() {
        if (reloj != null) {
            System.out.print(nombre + " " + apellido + " mira el reloj. ");
            reloj.getHora();
        } else {
            System.out.println(nombre + " " + apellido + " no tiene un reloj asociado.");
        }
    }

}
