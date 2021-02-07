
public class StandServicos extends Stand {
	
	//Campo
	private Servico servico;
	
	//Construtor
	public StandServicos(String codigo, String nome, Participante responsavel, Servico servico) {
		super(codigo, nome, responsavel);
		this.servico = servico;
	}
	
	//Getter
	public Servico getServico() {return servico;}
	
	//Métodos
	
	@Override
	public String toString() {
		return "StandServicos [ " + "servico = " + servico + " ]" + super.toString();
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof StandServicos)) return false;
        if (!super.equals(obj)) return false;

        StandServicos other = (StandServicos) obj;

        return getServico() == other.getServico();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getServico() != null ? getServico().hashCode() : 0);
        return result;
    }

}
