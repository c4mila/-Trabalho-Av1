/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

/**
 *
 * @author aluno
 */
public class Exercicio3Frame extends JFrame {

    private final Dimension DEFAULT_DIMENSION = new Dimension(150, 20);

    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JLabel label = new JLabel();

    public Exercicio3Frame() {
        configurarJanela();
        inicializarComponents();
    }

    private void configurarJanela() {
        setSize(600, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void inicializarComponents() {
        JPanel panel = new JPanel();
        text1.setEditable(true);
        text2.setEditable(true);
        text3.setEditable(true);
        text1.setPreferredSize(DEFAULT_DIMENSION);
        text2.setPreferredSize(DEFAULT_DIMENSION);
        text3.setPreferredSize(DEFAULT_DIMENSION);

        JButton button = new JButton("Jogar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogar();
            }
        });

        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(button);
        panel.add(label);

        add(panel);
    }

    private void jogar() {
        Random random = new Random();
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i < 150; i++) {
                    // Simulates work
                    Thread.sleep(50);
                    text1.setText(String.valueOf(random.nextInt(7)));
                    text2.setText(String.valueOf(random.nextInt(7)));
                    text3.setText(String.valueOf(random.nextInt(7)));
                }

                boolean isWin = text1.getText().equals(text2.getText()) && text1.getText().equals(text3.getText());
                label.setText(isWin ? "Você Ganhou!!!" : "Você perdeu!!!");
                return null;
            }
        };

        worker.execute();
    }

}
