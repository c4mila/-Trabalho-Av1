/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author aluno
 */
public class Exercicio1Thread extends Thread {

    public int numero;

    public Exercicio1Thread(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Número: " + numero);
    }

}
