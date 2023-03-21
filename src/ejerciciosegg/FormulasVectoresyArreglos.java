/*
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 *El programa deberá después mostrar el resultado de la suma

 */
package ejerciciosegg;


import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
/* public class FormulasVectoresyArreglos {
    /*

/*
/
___________________________________________________________________________________________-

menu con subprogramas dentro del DO y con el while


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
            } while(opc != 5); 
            
 
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
    
    
/*
    formula escribir vectores decreciente
    
            for (int i = 100; i > 0; i--) {
            vector[i] = i;
            System.out.println("[" + vector[i] + "]");
_______________________________________________________________________________
menu y opciones dentro de un DO en algoritmo    

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
	
	sc.close();
		
	}
	
}
    
    
    
    
    
    
    
    
    
    
    
    */