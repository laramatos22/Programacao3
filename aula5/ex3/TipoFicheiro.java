package aula5.ex3;

import aula5.*;
import java.io.*;

public interface TipoFicheiro {
	
	public Person[] InfoFromFile(String file) throws IOException;
	public void InfoToFile(String file, Person[] p) throws IOException;

}
