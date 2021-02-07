import java.util.*;
import java.util.stream.Collectors;

public class Feira {
	
	//Campos
	private String nome;
	private String local;
	private Set<Expositor> stands;
	private List<Visitante> visitantes;
	
	//Construtor
	public Feira(String nome, String local) {
		this.nome = nome;
		this.local = local;
		stands = new HashSet<>();
		visitantes = new ArrayList<>();
	}
	
	//Getters
	public String getNome() {return nome;}
	public String getLocal() {return local;}
	
	//Métodos
	
	//adicionar stand
	public void add(Stand stand) {
		stands.add(stand);
	}
	
	//adicionar visitante
	public void add(Visitante visitante) {
		visitantes.add(visitante);
	}
	
	@Override
	public String toString() {
		return "Feira " + nome + ": \nTotal de Expositores: " + stands.size() 
								+ "\nTotal de Visitantes: " + visitantes.size();
	}
	
	//emails dos responsaveis
	public String emailsDosResponsaveis() {
		
		return "[ " + stands.stream().map(Expositor::responsavel).map(Participante::getEmail).collect(Collectors.joining(", ")) + " ]";
	
	}
	
	//numero de visitantes entre duas datas (inicio e fim)
	public String visitantesEntreDatas(String inicio, String fim) {
		
		return "[ " + visitantes.stream().filter(v -> v.getData().compareTo(inicio) >= 0).filter(v -> v.getData().compareTo(fim) <= 0).map(Visitante::toString).collect(Collectors.joining(", ")) + " ]";
		
	}
	
	//qual o tipo de serviço (CAFETARIA, RESTAURANTE ou LAZER)
	public String getServico(Servico servico) {
		
		return "[ " + stands.stream().filter(s -> s instanceof StandServicos).map(s -> (StandServicos) s).filter(s -> s.getServico().equals(servico)).map(StandServicos::toString).collect(Collectors.joining(", ")) + " ]";
		
	}
	
	//Stands ordenados por codigos
	public Set<Expositor> getStandsOrderedByCodigo() {
		Set<Expositor> temp = new TreeSet<>(Comparator.comparing(Expositor::codigo));
		temp.addAll(stands);
		return temp;
	}

}
