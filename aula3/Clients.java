package aula3;

import java.util.*;

public class Clients extends Person {
	
	//Fields
	private final String nome;								//nome da pessoa
	private final int cc;									//cartao de cidadao
	private final Data bDay;								//data de nascimento
	private ArrayList<Integer> allCheckedOutMovies; 		//todos os filmes verificados
	private ArrayList<Integer> currentlyCheckedOutMovies; 	//os filmes atualmente verificados
	
	//Construtor
	public Clients (String nome, int cc, Data bDay) {
		super(nome, cc, bDay);
		this.nome = nome;
		this.cc = cc;
		this.bDay = bDay;
		allCheckedOutMovies = new ArrayList<>();
		currentlyCheckedOutMovies = new ArrayList<>();
	}
	
	public String nome() {return nome;}
	public int cc() {return cc;}
	public Data bDay() {return bDay;}
	
	//MÉTODOS
	
	//permitir a um cliente fazer check-in de um filme do videoclube
	public void checkInVideo(int videoID) {
		//Para fazer um check-in de um filme remove-se o ID desse filme da lista de filmes do videoclube
		currentlyCheckedOutMovies.remove((Integer) videoID);
	}
	
	//@return do numero de filmes do videoclube que foram verificados até ao momento
	public int currentlyCheckedOutMovies() {
		return currentlyCheckedOutMovies.size();
	}
	
	//permitir a um cliente fazer check-out de um filme do videoclube
	public void checkOutVideo(int videoID) {
		//adicionar o ID do filme às duas listas de check out total e até àquele momento
		allCheckedOutMovies.add(videoID);
		currentlyCheckedOutMovies.add(videoID);
	}
	
	//@return de um array com historial de todos os ID dos videos de check out
	public ArrayList<Integer> CheckedOutHistory() {
		return allCheckedOutMovies;
	}
	
	//função toString()
	public String toString() {
		return super.toString() + "\nCartao de Cidadao: " + cc + "\nData de Nascimento: " + bDay;
	}
	
	//array com o historial de um video
	public Video[] videoHistoryArray() {
		return allCheckedOutMovies.toArray(new Video[0]);
	}
	
	//array com os vídeos vistos num momento
	public Video[] watchedVideosArray() {
		return currentlyCheckedOutMovies.toArray(new Video[0]);
	} 

}