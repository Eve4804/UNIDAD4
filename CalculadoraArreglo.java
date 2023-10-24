/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraarreglo;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class CalculadoraArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner opcion = new Scanner(System.in);
        double[] elementos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        System.out.println("Bienevenido a la calculadora con arreglos, elige una opcion");
        System.out.println("1. SUMAR EL ARREGLO");
        System.out.println("2. MULTIPLICAR EL ARREGLO");
        System.out.println("3. SALIR");
        int op = opcion.nextInt();
        switch (op) {
            case 1:
                double suma = 0;
                for (int i = 0; i < elementos.length; i++) {
                    suma += elementos[i];
                    System.out.println("La suma es: " + suma);

                }
                break;
            case 2:
                double multiplicacion = 1.0;
                for (int i = 0; i < elementos.length; i++) {
                    multiplicacion *= elementos[i];
                    System.out.println("La multiplicación es: " + multiplicacion);

                }
                break;
            case 3: 
                System.out.println("SALIR");
                break;
            default:
                System.out.println("Regrese, la opcion no es valida");
                break;

        }
    }

}
