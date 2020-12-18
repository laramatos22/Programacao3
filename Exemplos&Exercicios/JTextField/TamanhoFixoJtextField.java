package JTextField;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TamanhoFixoJtextField extends PlainDocument {

       private int tamMax;

       public TamanhoFixoJtextField(int tamMax) {
             super();
             this.tamMax = tamMax;
       }

       public void insertString(int offset, String str, AttributeSet attr)
                    throws BadLocationException {

             if (str == null)
                    return;

             //Define a condi��o para aceitar qualquer n�mero de caracteres
        if (tamMax <= 0)
        {
            super.insertString(offset, str, attr);
            return;
        }

        int tam = (getLength() + str.length());

        //Se o tamanho final for menor, chama insertString() aceitando a String
        if (tam <= tamMax)
            super.insertString(offset, str, attr);
        }

}
