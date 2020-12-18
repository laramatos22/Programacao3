package JTextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestarJTextField extends JFrame {

       private static final long serialVersionUID = 1L;

       private JTextField txtExemplo;

    public static void main(String[] args)
    {
       TestarJTextField field = new TestarJTextField();
       field.testaJTextField();
    }

    private void testaJTextField() {
             this.setTitle("Exemplo");
        this.setSize(200, 180);

        //Definimos o tamanho padr�o do JTextField
        txtExemplo = new JTextField(10);

        //Passamos para o construtor o n�mero m�ximo de caracteres aceitos
        txtExemplo.setDocument(new TamanhoFixoJtextField(5));

        this.getContentPane().add(txtExemplo, "North");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

}
