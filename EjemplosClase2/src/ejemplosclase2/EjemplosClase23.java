/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author TIMO
 */
public class EjemplosClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal del proyecto
        
        String nombre;
        String apellido;
        String ciudad;
        int edad;
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Por favor ingrese sus nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingrese sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); // Limpieza de datos del buffer
                
        System.out.println("Por favor Ingrese su ciudad");
        ciudad = entrada.nextLine();
        /**
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido es: "
                +apellido+", edad: "+edad+"\n Ciudad: "+ciudad);
        */
        System.out.printf("Su nombre es %s\n\n\t Su apellido es %S, edad: %S\n"
                + " Cuidad: %S",nombre, apellido, edad, ciudad);
    }
    
}
