/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        Random random = new Random(100);
        Exercicio2Thread[] threads = new Exercicio2Thread[3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = random.nextInt(100);
            }
            threads[linha] = new Exercicio2Thread(matriz[linha], "Thread " + (linha + 1));
        }

        for (int linha = 0; linha < threads.length; linha++) {
            threads[linha].start();
        }

    }

}
