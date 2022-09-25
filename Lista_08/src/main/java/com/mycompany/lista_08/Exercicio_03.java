/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_08;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float matriz[][] = new float[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o " + (j + 1) + " número da " + (i + 1) + " linha:");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j > 0) {
                    matriz[i][j] *= matriz[i][j - 1];
                    System.out.println("J = " + (j - 1));
                }
            }
        }

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (j != 0) {
                    matriz[j][i] = matriz[j - 1][i] * matriz[j - 1][i];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
