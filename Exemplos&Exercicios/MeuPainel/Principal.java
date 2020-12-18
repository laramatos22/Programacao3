package MeuPainel;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame {

    public Principal() {
        super("Minha janela");
        setSize(300, 200);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MeuPainel janela = new MeuPainel();

        Container con = getContentPane();
        con.add(janela);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Principal();
    }
}
