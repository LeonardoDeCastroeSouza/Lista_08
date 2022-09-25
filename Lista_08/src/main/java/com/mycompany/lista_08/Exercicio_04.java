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
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int maiorValor = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o número " + (j + 1) + " da " + (i + 1) + " linha:");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("O maior número se encontra em matriz[" + x + "][" + y + "] e é igual a " + maiorValor);

        sc.close();
    }
}
