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
public class ejercicio8guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner numero = new Scanner(System.in);
    int lado;
    System.out.print("Ingrese un numero para su rectangulo: ");
    lado = numero.nextInt();

    int aux = 0;
    int contador = 1;

    // Prints out the first row 
    while (aux < lado) {
        System.out.print("*");
        aux++;
    }
    System.out.println();
    aux = 0;

    // Prints out the hollow part
    while (contador < lado-1) {
        System.out.print("*");  // 
        while (aux < lado - 2) { 
            System.out.print(" ");
            aux++;
        }
        System.out.println("*"); 
        aux=0;
        contador++;
    }

   
    while (aux < lado) {
        System.out.print("*");
        aux++;
    }
    }
    
}
