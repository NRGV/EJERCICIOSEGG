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
public class ejercicio1guia4 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main. *
     */
    public static void main(String[] args) {

        int numero1, numero2;

        System.out.println("Ingrese dos numeros entero");
        Scanner read = new Scanner(System.in);
        numero1 = read.nextInt();
        numero2 = read.nextInt();

        System.out.println("//////////////////////////////////////////////////");
        System.out.println("//      Bienvenidos a la calculadora            //");
        System.out.println("////////////* 1): Sumar       ////////////////////");
        System.out.println("////////////* 2): Restar      ////////////////////");
        System.out.println("////////////* 3): Multiplicar ////////////////////");
        System.out.println("////////////* 4): Dividir     ////////////////////");
        System.out.println("////////////* 5): Salir       ////////////////////");
        System.out.println("//////////////////////////////////////////////////");
      int opc = 0;

        do {
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("El resultado de la suma es " + sumar(numero1, numero2));
                    continue;
                case 2:
                    System.out.println("El resultado de la resta es " + restar(numero1, numero2));
                    continue;
                case 3:
                    System.out.println("El resultado de la multiplicacion es " + multiplicar(numero1, numero2));
                    continue;
                case 4:
                    System.out.println("El resultado de la division es " + divir(numero1, numero2));
                    continue;
            }
                
            
        }while (opc != 5);
 
    
    }

    public static int sumar(int numero1, int numero2) {

        int resultado;

        resultado = (numero1 + numero2);

        return resultado;
    }

    public static int divir(int numero1, int numero2) {

        int resultado;

        resultado = (numero1 / numero2);

        return resultado;
    }

    public static int restar(int numero1, int numero2) {

        int resultado;

        resultado = (numero1 - numero2);

        return resultado;
    }

    public static int multiplicar(int numero1, int numero2) {

        int resultado;

        resultado = (numero1 * numero2);

        return resultado;
    }
}
