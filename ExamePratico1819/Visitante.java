
public class Visitante {
	
	private static long currentID = 1;
	private long ID;
	private String data;
	
	public Visitante(String data) {
		String[] check = data.split(":");
		if(check.length != 3)
			throw new IllegalArgumentException();
		this.data = data;
		ID = currentID++;
	}
	
	public long getID() {return ID;}
	public String getData() {return data;}
	
	@Override
	public String toString() {
		return "Visitante [" + "num = " + ID + ", entrada = " + data + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(!(obj instanceof Visitante)) return false;
		
		Visitante visitante = (Visitante) obj;
		
		if(getID() != visitante.getID()) return false;
		return getData() != null ? getData().equals(visitante.getData()) : visitante.getData() == null;
		
	}
	
	@Override
	public int hashCode() {
		int result = (int) (getID() ^ (getID() >>> 32));
        result = 31 * result + (getData() != null ? getData().hashCode() : 0);
        return result;
	}

}
