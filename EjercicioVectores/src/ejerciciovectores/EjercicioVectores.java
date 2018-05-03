/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leerDato = new Scanner(System.in);
        int cantElementos;

        do {
            System.out.println("Ingrese cuantos elementos va a cargar: ");
            cantElementos = leerDato.nextInt();
        } while (cantElementos <= 0);

        int factor_k;
        System.out.println("Ingrese el valor por el que multiplicará los números. Debe ser entero.");
        factor_k = leerDato.nextInt();

        int[] vector_1 = new int[cantElementos];
        int[] vector_2 = new int[cantElementos];

        System.out.println("Cargue los valores del arreglo");
        for (int i = 0; i < cantElementos; i++) {
            System.out.println("Nro. " + (i + 1));
            vector_1[i] = leerDato.nextInt();
            vector_2[i] = vector_1[i] * factor_k;

        }
        System.out.println("Los resultados son: ");
        for (int i = 0; i < cantElementos; i++) {
            {
                System.out.println(vector_1[i] + "  " + vector_2[i]);
            }

        }
    }
}
