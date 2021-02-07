
public class StandOrganizacao extends Stand {
	
	private String telefone;
	
	public static StandOrganizacao instance(String codigo, String nome, Participante responsavel, String telefone) {
        return new StandOrganizacao(codigo, nome, responsavel, telefone);
    }
	
	private StandOrganizacao(String codigo, String nome, Participante responsavel, String telefone) {
		super(codigo, nome, responsavel);
		this.telefone = telefone;
	}
	
	//Getter
	public String getTelefone() {return telefone;}
	
	//Métodos
	
	@Override
	public String toString() {
		return "StandOrganizacao [ " + "contacto = " + telefone + " ]" + super.toString(); 
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof StandOrganizacao)) return false;
        if (!super.equals(obj)) return false;

        StandOrganizacao other = (StandOrganizacao) obj;

        return getTelefone() != null ? getTelefone().equals(other.getTelefone()) : other.getTelefone() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getTelefone() != null ? getTelefone().hashCode() : 0);
        return result;
    }

}
