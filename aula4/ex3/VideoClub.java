package aula4.ex3;

public class VideoClub {
	
	private ClientList clients = new ClientList();
	private VideoList videos = new VideoList();
	
	/**Altere a aplicação para passar a incluir um mecanismo de quotas de empréstimo.
	Assim, cada utilizador só poderá requisitar simultaneamente um máximo de N
	vídeos. O valor de N será definido aquando da inicialização do videoclube.*/
	private int maxVideos;
	
	public VideoClub (int N) {
		maxVideos = N;
	}
	
	//Adicionar um cliente à lista clients
	public void addClient (Clients client) {
		//Usar a função addClient(client) da classe ClientList 
		clients.addClient(client);
	}
	
	//Remover um cliente da lista clients
	public void removeClient (int clientID) {
		//Remover 
		clients.removeClient(clients.showClient(clientID));
	}
	
	public void printClientVideos(int clientID) {
		Clients client = clients.showClient(clientID);
		System.out.println();
		System.out.println("Videos de: " + client.Nome());
		System.out.println();
		for(Video video : client.watchedVideosArray()) {
			System.out.println(video);
		}
	}
	
	//Adicionar um video à lista videos
	public void addVideo(String titulo, String categoria, String idade) {
		videos.addVideo(new Video (titulo, categoria, idade));
	}
	
	//Remover video da lista videos
	public void removeVideo(int videoID) {
		videos.removeVideo(videos.showVideo(videoID));
	}
	
	//Confirmar se o video está disponível
	public void checkIfIsAvailabe(int videoID) {
		String estado = "disponível";
		if (!(videos.showVideo(videoID).avaliar())) {
			estado = "indisponível";
		}
		System.out.println("O vídeo " + videoID + " está " + estado);
	}
	
	//Requisitar um video
	public void emprestVideo (int videoID, int clientID) {
		Video video = videos.showVideo(videoID);
		Clients client = clients.showClient(clientID);
		if(client.currentlyCheckedOutMovies() >= maxVideos) {
			System.out.println("O cliente " + client.Nome() + " atingiu o limite de videos");
		}
		if(!(video.avaliar())) {
			System.out.println("O video " + videoID + " não está disponível, logo não pode ser requisitado");
		}
		video.emprestarVideo();
		client.checkOutVideo(videoID);
		System.out.println("Video requisitado com sucesso!!");
	}
	
	public void devolveVideo (int videoID, int clientID, int rating) {
		Video video = videos.showVideo(videoID);
		Clients client = clients.showClient(clientID);
		if(video.avaliar()) {
			System.out.println("O video " + videoID + " está disponível!");
		}
		video.devolverVideo(rating);
		client.checkInVideo(videoID);
		System.out.println("Video devolvido com sucesso!!");
	}
	
	//Lista dos histórico de vídeos requisitados por um cliente
	public void printClientVideoHistory (int clientID) {
		Clients client = clients.showClient(clientID);
		System.out.println();
		System.out.println("Histórico de vídeos do cliente: " + client.Nome());
		System.out.println();
		for (Video video : client.videoHistoryArray()) {
			System.out.println(video);
		}
	}
	
	//Print Catálogo de Videos
	public void printVideosCatalog() {
		System.out.println();
		System.out.println("Catálogo de Vídeos:");
		System.out.println();
		for (Video video : videos.videosToArray()) {
			System.out.println(video);
		}
	}
	
	//Print do Catálogo com o Rating de cada vídeo
	public void printCalalogWithRating() {
		Video[] sortedArray = videos.videosToArray().clone();
		boolean swap = true;
		Video temp;
		do {
			swap = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i].compareTo(sortedArray[i+1]) < 0) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					swap = false;
				}
			}
		} while (swap);
		
		System.out.println();
		System.out.println("Catálogo de vídeos por Rating: ");
		System.out.println();
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i].toString());
		}
	}
	
}