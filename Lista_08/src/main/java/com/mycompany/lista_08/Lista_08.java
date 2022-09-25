/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista_08;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Lista_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int numeroMaiorQue10 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um número: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10) {
                    numeroMaiorQue10++;
                }
            }
        }
        System.out.println("Houve " + numeroMaiorQue10 + " números maior que 10.");
        sc.close();
    }
}
