package aula2;

import java.util.*;

public class VideoList {
	
	//ArrayList com os videos da classe Video
	private ArrayList<Video> videos = new ArrayList<>();
	
	//Adicionar um video à lista
	public void addVideo (Video video) {
		videos.add(video);
	}
	
	//Remover um video da lista
	public void removeVideo(Video video) {
		videos.remove(video);
	}
	
	//Mostrar Video através do seu ID
	public Video showVideo (int ID) {
		//Para todos os videos que pertence à classe Video
		for (Video video : videosToArray()) {
			if(video.ID() == ID) {
				return video;
			}
		}
		throw new IllegalArgumentException();
	}
	
		//Mostrar um array com todos os videos
		public Video[] videosToArray() {
			return videos.toArray(new Video[0]);
		}
	
	//Retorno do tamanho da lista de videos
	public int size() {
		return videos.size();
	}

}
