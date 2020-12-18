package aula8.ex3;

import java.io.*;

public class Teste_QQSM
{
	@SuppressWarnings("unused")
	private static GameBoard game;

	public static void main(String[] args)
	throws IOException
	{
		game = new GameBoard("questions.txt");
	}
}
