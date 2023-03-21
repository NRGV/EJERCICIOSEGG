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
public class extra1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       Realizar un algoritmo que calcule la suma de 
        todos los elementos de un vector de tamaño N, 
        con los valores ingresados por el usuario.
         */
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del vector");
        n = read.nextInt();
        int[] vector = new int[n];

        int resultado = 0;
        int contador = 0;
        int numeroIngresado = 0;

        System.out.println("Ahora, ingresara numeros enteros hasta que el vector este completo, luego se sumaran");
        System.out.println("");
        do {

            System.out.println("Ingrese un numero");
            for (int i = 0; i < n; i++) {
                numeroIngresado = read.nextInt();
                vector[i] = numeroIngresado;
                contador++;
                resultado += numeroIngresado;
            }
        } while (contador != n);
        System.out.println("La suma de los numeros ingresados es: " + resultado);
    }
}
