/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;
import java.util.Scanner;

/**
 *
 * @author TIMO
 */
public class Miejercicio {
    
    public static void main(String[] args) {
    
        String nombre;
        String apellido;
        String ciudad;
        String pais;
        int edad;
        int nota1;
        int nota2;
        double promedio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese sus nombres");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor ingrese sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor Ingrese su ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Por favor Ingrese su país");
        pais = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        
        System.out.println("Por favor ingrese su primera nota");
        nota1 = entrada.nextInt();
        
        System.out.println("Por favor ingrese su segunda nota");
        nota2 = entrada.nextInt();
        
        promedio = (nota1+nota2)/2;
        
        System.out.printf("Su nombre y apellido es %S %S \nEdad: %S"
                + "\nCuidad: %S\nPais: %S\nNotas: %S,%S\nPromedio: %S"
                ,nombre, apellido, edad, ciudad, pais, nota1, nota2, promedio);
    }            
        
}
