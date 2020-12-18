package aula9.ex1;

/**Pretende-se construir um Scanner especial (ScannerAbeirense) que forne�a apenas alguns
dos m�todos da classe Scanner e que na leitura transforme todos os caracteres 'v' e 'V'
em 'b' e 'B', respectivamente.
public class ScannerAbeirense implements Iterator<String>, Closeable
Dever� fornecer os m�todos das interfaces indicadas e ainda o m�todo nextLine().
Teste a classe lendo do teclado e de um ficheiro de texto.*/

//import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;
import java.util.Iterator;

public class ScannerAbeirense implements Iterator<String>  {
	
	//Par�metros de Instancia
	private Scanner sc;
	
	//Construtor
	public ScannerAbeirense (Scanner sc) {
		this.sc = sc;
	}
	
	//M�todos
	public void close() throws IOException {
		sc.close();
	}
	
	public boolean hasNext() {
		return sc.hasNext();
	}
	
	public String next() {
		return sc.next().replaceAll("v", "b").replaceAll("V", "B");
	}
	
	//Outros M�todos
	public boolean equals(Object obj) {
		if(this == obj)	return true;
		if(obj == null)	return false;
		if(getClass() != obj.getClass()) return false;
		
		ScannerAbeirense other = (ScannerAbeirense) obj;
		
		if(sc == null) {
			if(other.sc != null)	return false;
		}
		else if(!sc.equals(other.sc)) {
			return false;
		}
		return true;
	}

}
