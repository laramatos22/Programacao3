package aula2;

import java.util.*;

public class ClientList {
	
	//ArrayList com os clientes da class CLients
	private ArrayList<Clients> clients = new ArrayList<>();
	
	//Adicionar cliente à lista clients
	public void addClient(Clients client) {
		clients.add(client);
	}
	
	//Remover cliente à lista clients
	public void removeClient (Clients client) {
		//Usar a função remove da classe Clients para remover
		clients.remove(client);
	}
	
	//Saber qual o cliente através do seu nº de CC
	public Clients showClient (int cc) {
		for(Clients client : clientsToArray()) {
			if(client.cc() == cc) {
				return client;
			}
		}
		throw new IllegalArgumentException();
	}
		
		//Array com todos os clientes
		private Clients[] clientsToArray() {
			return clients.toArray(new Clients[0]);
		}
		
	//Tamanho do array
	public int size() {
		return clients.size();
	}

}
