package ao.com.artaxerxes001.calc.visao;

import ao.com.artaxerxes001.calc.model.Memoria;
import ao.com.artaxerxes001.calc.model.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

// paineis são como containers que agrupam varios elementos detro deles
public class Display extends JPanel implements MemoriaObservador {
    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
//Gerenciador de layout
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }

}
