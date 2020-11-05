package aula4.ex3;


/**Um vídeo é caracterizado por um ID sequencial, um título, uma categoria (Ação,
Comédia, Infantil, Drama, etc.) e uma idade (ALL, M6, M12, M16, M18).*/

public class Video {
	
	static int numFilmes=1; 			//número total de filmes
	private int ID;						//ID do vídeo
	private String titulo;				//titulo do video
	private String categoria;			//categoria do vídeo
	private String idade;				//idade: ALL, M6, M12, M16, M18
	private boolean avaliar; 			//avaliação num sistema de rating
	private double ratingMedio;			//Rating Medio
	private int ratingTotal;			//Rating Total
	private int numSocio; 				//número de Sócio do cliente para efetuar as operações de empréstimo e devolução 
	
	public Video (String titulo, String categoria, String idade) {
		this.ID = numFilmes++; //o ID vai subindo sequencialmente conforme haja mais filmes
		this.titulo = titulo;
		this.categoria = categoria;
		this.idade = idade;
		this.avaliar = true;
		this.ratingMedio = 0.0;
		this.ratingTotal = 0;
	}
	
	public int ID() {return ID;}
	public String titulo() {return titulo;}
	public String categoria() {return categoria;}
	public String idade() {return idade;}
	public double rating() {return ratingMedio;}
	public boolean avaliar() {return avaliar;}
	
	public String toString() {
		return "ID: " + ID + "\nTítulo: " + titulo 
				+ "\nRating Total: " + ratingTotal 
				+ "\nRating Medio: " + ratingMedio
				+ "\nCategoria: " + categoria 
				+ "\nIdade: " + idade;
	}
	
	/**Recomenda-se que as operações de empréstimo e devolução sejam
	efetuadas com base no ID do vídeo e no número de sócio do cliente.*/
	
	public void emprestarVideo () {
		avaliar = false;
		numSocio++;
	}
	
	/** Altere a aplicação para permitir a introdução de um sistema de rating associado a
	cada vídeo do catálogo. Assim, na devolução (checkin) de vídeos, os utilizadores
	devem atribuir um nível de qualidade (1 a 10) ao filme. Cada vídeo passará a ter um
	rating total e um rating médio.*/
	
	public void devolverVideo(int rating) {
		avaliar = true;
		addRating(rating);
	}
		
		private void addRating(int rating) {
			ratingTotal += rating;
			ratingMedio = (double) ratingTotal/numSocio;
		}
		
	public int compareTo(Video video) {
		if(this.rating() == video.rating()) {
			return 0;
		}
		else if(this.rating() < video.rating()) {
			return -1;
		}
		else {
			return 1;
		}
	}

		
}