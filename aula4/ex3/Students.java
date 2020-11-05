package aula4.ex3;

import aula4.*;

public class Students extends Clients {
	
	//Fields
	private final int nmec;			//número mecanográfico do aluno
	private final int course;		//número de curso
	
	public Students(String name, int cc, Data bDay, int nmec, int course) {
		super(name, cc, bDay);
		this.nmec = nmec;
		this.course = course;
				
	}
	
	//MÉTODOS
	
	public boolean equals (Students s) {
		return super.equals(s) && (nmec == s.nmec) && (course == s.course);
	}
	
	//função tostring()
	public String toString() {
		return super.toString() + "\nNúmero Mecanográfico: " + nmec + "\nCurso: " + course;
	}

}

