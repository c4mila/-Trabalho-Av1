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
public class Exercicio1 {

    public static void main(String[] args) {
        Exercicio1Thread thread1 = new Exercicio1Thread(1);
        Exercicio1Thread thread2 = new Exercicio1Thread(2);
        Exercicio1Thread thread3 = new Exercicio1Thread(3);
        Exercicio1Thread thread4 = new Exercicio1Thread(4);
        Exercicio1Thread thread5 = new Exercicio1Thread(5);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}
