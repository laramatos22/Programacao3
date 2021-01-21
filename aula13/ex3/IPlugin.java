package aula13.ex3;

import java.io.IOException;

public interface IPlugin {
	public boolean verified(String name);
	public Pessoa[] InfoFromFile(String filename) throws IOException;
	public void InfoToFile(String filename, Pessoa[] p) throws IOException;
}
