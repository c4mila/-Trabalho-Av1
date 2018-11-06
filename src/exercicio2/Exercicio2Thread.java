/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno
 */
public class Exercicio2Thread extends Thread {

    private int[] linha;
    private String threadName;

    public Exercicio2Thread(int[] linha, String threadName) {
        this.linha = linha;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        System.out.print(threadName + " [ ");
        for (int i = 0; i < linha.length; i++) {
            System.out.print(linha[i] + " ");
        }
        System.out.print("]");
        System.out.println("=====================================");

    }
}
