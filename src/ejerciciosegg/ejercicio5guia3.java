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
public class ejercicio5guia3 {

    /*
    Realizar un programa que pida dos números enteros positivos por teclado y 
    muestre por pantalla el siguiente menú:
    El usuario deberá elegir una opción y 
    el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
    si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

    */
    
public static void main(String[] args){
         int limite, num, suma;
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un valor limite");
         limite = leer.nextInt();
         num = 0;
         suma = 0;
                         
         
         while (suma <= limite) {
         System.out.println("Ingrese numeros");
         num = leer.nextInt();
         suma = num + suma;
                 }
         System.out.println("La suma de los valores ingresados ya superó el límite");
         
     }
}
