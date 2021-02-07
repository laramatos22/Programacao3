import java.util.ArrayList;
import java.util.List;

public class StandEmpresa extends Stand {
	
	private List<Participante> membros;
	
	public StandEmpresa(String codigo, String nome, Participante responsavel) {
		super(codigo, nome, responsavel);
		membros = new ArrayList<>();
		membros.add(responsavel);
	}
	
	public StandEmpresa(String codigo, String nome, Participante responsavel, List<Participante> lista) {
		super(codigo, nome, responsavel);
		membros = lista;
	}
	
	public void add(Participante p) {
		membros.add(p);
	}
	
	public List<Participante> membros() {return membros;}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
        if (!(obj instanceof StandEmpresa)) return false;
        if (!super.equals(obj)) return false;

        StandEmpresa other = (StandEmpresa) obj;

        return membros != null ? membros.equals(other.membros) : other.membros == null;
		
	}
	
	@Override
	public int hashCode() {
		
		int result = super.hashCode();
        result = 31 * result + (membros != null ? membros.hashCode() : 0);
        return result;
		
	}

}
