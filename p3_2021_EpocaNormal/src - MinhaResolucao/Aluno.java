import java.util.Objects;

public class Aluno extends Utilizador {
	
		//Construtor
		public Aluno(String nome, int nmec, LocalDate dataInscricao) {
			super(nome, nmec, dataInscricao);
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(super.hashCode());
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this == obj) return true;
			if(obj == null || getClass() != obj.getClass()) return false;
			if(!super.equals(obj)) return false;
			
			return true;
			
		}
		
		@Override
		public String toString() {
			return super.toString();
		}

}
