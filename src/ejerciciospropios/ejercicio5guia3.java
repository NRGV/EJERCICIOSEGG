/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospropios;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ejercicio5guia3 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
     * El programa deberá ejecutarse hasta que se elija la opción 5. 
     * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
     * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        
        int numero1, numero2;
        numero1 = 0;
        numero2 = 0;
        aux = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("//      Bienvenidos a la calculadora            //");
        System.out.println("////////////* 1): Sumar       ////////////////////");
        System.out.println("////////////* 2): Restar      ////////////////////");
        System.out.println("////////////* 3): Multiplicar ////////////////////");
        System.out.println("////////////* 4): Dividir     ////////////////////");
        System.out.println("////////////* 5): Salir       ////////////////////");
        System.out.println("//////////////////////////////////////////////////");
        numero1 = read.nextInt();
        numero2 = read.nextInt();
      
        
        funcionmenu(numero1,numero2);
    }
 
    
    public static int funcionmenu(int numero1, int numero2) {
        int opcionsalir, opcionmenu, 
        
        
        
        switch (opcionmenu ) {
            case 1:
                 System.out.println(numero1 + numero2);
                break;
            case 2:
                 System.out.println(numero1 - numero2);
                break;
            case 3:
                 System.out.println(numero1 * numero2);
                break;
            case 4:
                 System.out.println(numero1 / numero2);
                break;    
            case 5:
                 System.out.println("Are you sure you want to exit? Y/N");
                  Scanner readmenu = new Scanner(System.in);
                  opcionsalir = readmenu.nextInt();
                    if (opcionsalir.equalsIgnoreCase("Y")){
                    break;  
                    } else (continue)
        return funcionmenu;
        
        
    
    
    




