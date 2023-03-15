/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ejercicio2guia4 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e 
     * imprima los datos de las personas ingresadas por teclado e 
     * indique si son mayores o menores de edad. Después de cada persona, 
     * el programa debe preguntarle al usuario si quiere seguir mostrando personas y 
     * frenar cuando el usuario ingrese la palabra “No”.

     */
    public static void main(String[] args) {
       String nombre;
       int edad;
     
       
     do{  
         
      System.out.println("Ingrese el nombre");     
       Scanner read = new Scanner(System.in);
       
       nombre = read.nextLine();
         if (nombre == "No") {
             break;
         } else {
             System.out.println("Ingrese la edad de la persona");
             edad = read.nextInt();
         }
        if (retorno(edad ) == true)
        System.out.println(nombre + " es mayor de edad: " );
     
       else 
           System.out.println(nombre + " es menor de edad" );
      
     }  while (nombre != "No");   
       
      
    }
    
    public static boolean retorno(int edad) {
        boolean respuesta;
        
        if (edad>18)
            respuesta = true;
            else
            respuesta = false;
        return respuesta;
    }   
    
        
      
        

