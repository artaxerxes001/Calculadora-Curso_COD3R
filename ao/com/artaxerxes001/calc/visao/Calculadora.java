package ao.com.artaxerxes001.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
public Calculadora() {
    organizarLayout();
    setSize(232, 322);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
}

private void organizarLayout() {
//        o gerenciador de layout BoderLayout divide a tela em N, S, O, E
setLayout(new BorderLayout());
Display display = new Display();
display.setPreferredSize(new Dimension(233,60));
    add(display, BorderLayout.NORTH);
    Teclado teclado = new Teclado();
    add(teclado, BorderLayout.CENTER);
}

public static void main(String[] args) {
    new Calculadora();
}
}
