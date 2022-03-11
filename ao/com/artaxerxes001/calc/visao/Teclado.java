package ao.com.artaxerxes001.calc.visao;

import ao.com.artaxerxes001.calc.model.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//      a implementação do ActionListener serve como um observer dos eventos dos botões
public class Teclado extends JPanel implements ActionListener {
    private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
    private final Color COR_CINZA_CLARO = new Color(99, 100, 98);
    private final Color COR_LARANJA = new Color(242, 163, 60);

    public Teclado() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);

        c.weightx = 1;
        c.weighty = 1;

        c.fill = GridBagConstraints.BOTH;

// linha 1
        c.gridwidth = 2;
        adicionaBotao("AC", COR_CINZA_ESCURO, c, 0, 0);

        c.gridwidth = 1;
        adicionaBotao("+/-", COR_CINZA_ESCURO, c, 2, 0);

        adicionaBotao("/", COR_LARANJA, c, 3, 0);


// linha 2
        adicionaBotao("7", COR_CINZA_CLARO, c, 0, 1);
        adicionaBotao("8", COR_CINZA_CLARO, c, 1, 1);
        adicionaBotao("9", COR_CINZA_CLARO, c, 2, 1);
        adicionaBotao("*", COR_LARANJA, c, 3, 1);

// linha 3
        adicionaBotao("4", COR_CINZA_CLARO, c, 0, 2);
        adicionaBotao("5", COR_CINZA_CLARO, c, 1, 2);
        adicionaBotao("6", COR_CINZA_CLARO, c, 2, 2);
        adicionaBotao("-", COR_LARANJA, c, 3, 2);

// linha 4
        adicionaBotao("1", COR_CINZA_CLARO, c, 0, 3);
        adicionaBotao("2", COR_CINZA_CLARO, c, 1, 3);
        adicionaBotao("3", COR_CINZA_CLARO, c, 2, 3);
        adicionaBotao("+", COR_LARANJA, c, 3, 3);

// linha 5
        c.gridwidth = 2;

        adicionaBotao("0", COR_CINZA_CLARO, c, 0, 4);

        c.gridwidth = 1;

        adicionaBotao(",", COR_CINZA_CLARO, c, 2, 4);
        adicionaBotao("=", COR_LARANJA, c, 3, 4);
    }

    private void adicionaBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
//        adiconando o observador
        botao.addActionListener(this);
        add(botao, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        lendo os dados dos botões
        JButton botao = (JButton) e.getSource();
        Memoria.getInstancia().processarComando(botao.getText());
    }
}
