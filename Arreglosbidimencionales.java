/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglosbidimencionales;

/**
 *
 * @author Usuario
 */
public class Arreglosbidimencionales {

    public static void main(String[] args) {
        int [][] numeros = new int [4][5];
        int numero = 1;
        
        for (int i = 0; i < 4; i++) {//control de filas
            for (int j = 0; j < 5; j++) { // control de columnas
                numeros [i][j] = numero;
                numero++;
            }
        } //hasta aqui se guarda informacion
        //aqui se empieza a leer
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print (numeros [i][j] + "");
            }
            System.out.println();
        }
          
    }
   
}
