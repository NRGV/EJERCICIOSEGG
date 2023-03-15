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
public class ejercicio6guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numero");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        siono = "";
        opciones = 0;
        System.out.println("================Ingrese una opcion===============");
        do  
            /*{*/ 
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5. SALIR");
            
            int opciones = leer.nextInt();
            String siono;
            switch (opciones) {
                case 1:
                    System.out.println("El resultado es: " + (num1+num2));
                 break; 
                case 2:
                    System.out.println("El resultado es: " + (num1-num2));
                break; 
                case 3: 
                    System.out.println("El resultado es: " + (num1*num2));
                   break; 
                case 4:
                    System.out.println("El resultado es: " + (num1/num2));
                   break; 
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? Y/N");
                    Scanner read = new Scanner(System.in);
                    siono = read.nextLine();
                    if (siono.equalsIgnoreCase("Y"));
                    break;        
        }
        while (opciones >0 && opciones <5) 
    

