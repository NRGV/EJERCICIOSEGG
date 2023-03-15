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
public class ejercicio6guia3test {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
		int num1,num2,opc;
		double resultado;
		String opcion;
		resultado = 0;
		opc = 0;
		opcion = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		do {
			System.out.println("==============MENU===============");
			System.out.println("=============1-Sumar===============");
			System.out.println("=============2-Restar===============");
			System.out.println("=============3-Multiplicar===============");
			System.out.println("=============4-Dividir===============");
			System.out.println("=============5-Salir===============");
			opc = sc.nextInt();
			
			if(opc == 1) {
				resultado = num1+num2;
				System.out.println("La suma de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 2) {
				resultado = num1-num2;
				System.out.println("La resta de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 3) {
				resultado = num1*num2;
				System.out.println("La multiplicacion de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 4) {
				resultado = num1/num2;
				System.out.println("La division de los dos numeros es: "+resultado);
				System.out.println("Volviendo a menu...");
			}
			if(opc == 5) {
				Scanner sc2 = new Scanner(System.in);
				System.out.println("¿Está seguro que desea salir del programa (S/N)?");
				opcion = sc2.nextLine();
				if(opcion.equals("S")) {
					System.out.println("Chau nos vemos!");
				}else if(opcion.equals("N")) {
					System.out.println("Volviendo al menu...");
				}
			}
			
			
		}while(!opcion.equals("S"));
	
   }sc.close(); 
		
	