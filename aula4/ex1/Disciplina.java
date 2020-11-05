package aula4.ex1;

import java.util.*;

public class Disciplina {
	
	private String nome;
	private String area;
	private int ects;
	private Professor professor;
	private ArrayList <Estudante> estudante;
	
/**Implementar os seguintes métodos:
 * public boolean addAluno(Estudante est) 	//Adiciona um aluno à Disciplina
 * public boolean delAluno (int nMec) 	  	//Remove um aluno da Disciplina
 * public boolean alunoInscrito (int nMec)	//Verifica se aluno está inscrito à disciplina
 * public int numAlunos() 					//Retorna o número de alunos inscritos
 * public String toString()					//Retorna as características da disciplina
 * public Estudante[] getAlunos()			//Retorna uma lista com todos os alunos da disciplina
 * public Estudante[] getAlunos(String tipo)//Retorna uma lista com todos os alunos da disciplina do subtipo "tipo"
 */
	
	public Disciplina(String nome, String area, int ects, Professor professor) {
		this.nome = nome;
		this.area = area;
		this.ects = ects;
		this.professor = professor;
		estudante = new ArrayList<Estudante>();
	}
	
	
	//Adiciona um aluno à Disciplina
	public boolean addAluno(Estudante est) { 	
		
		if(alunoInscrito(est.Nmec())) {
			return false;
		}
		return estudante.add(est);
		
	}
	
	//Remove um aluno da Disciplina
	public boolean delAluno (int nMec) {	  	
		
		if(estudante.isEmpty()) {
			return false;
		} else {
			for (int i = 0; i < this.estudante.size(); i++) {
				if(estudante.get(i).Nmec() == nMec) {
					return estudante.remove(estudante.get(i));
				}
			}
		}
		return false;
		
	}
	
	//Verifica se aluno está inscrito à disciplina
	public boolean alunoInscrito (int nMec) {	
		
		for (int i = 0; i < estudante.size(); i++) {
			if(estudante.get(i).Nmec() == nMec)  {
				return true;
			}
		}
		return false;
		
	}
	
	//Retorna o número de alunos inscritos
	public int numAlunos() {					
		return estudante.size();
	}
	
	//Retorna as características da disciplina
	public String toString() {
		return ("Disciplina: " + this.nome + " ( " + this.ects + " ECTS) da Area de " + this.area 
				+ "\nRESPONSAVEL: Professor: " + this.professor
				+ "\nExistem " + this.numAlunos() + " inscritos");
	}	
	
	//Retorna uma lista com todos os alunos da disciplina
	public Estudante[] getAlunos() {
		return estudante.toArray(new Estudante[0]);
	}
	
	//Retorna uma lista com todos os alunos da disciplina do subtipo "tipo"
	public Estudante[] getAlunos(String tipo) {
		System.out.println(tipo);
		//Array temporário só com alunos de um dado tipo, por exemplo, tipo = "Bolseiro"
		ArrayList<Estudante> temp = new ArrayList<Estudante>();
		//Percorrer todo o array Estudante
		for(int i=0; i<estudante.size(); i++) {
			//Se os alunos enquadram-se no dado tipo
			if(estudante.get(i).getClass().getSimpleName().equalsIgnoreCase(tipo)) {
				//Acrescenta-o ao array temporário temp
				temp.add(estudante.get(i));
			}
		}
		//return do array temp com os alunos que se enquadram no dado tipo
		return temp.toArray(new Estudante[0]);
		
	}
	
}
