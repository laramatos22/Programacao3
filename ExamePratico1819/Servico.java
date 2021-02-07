
public enum Servico {
	
	CAFETARIA, RESTAURANTE, LAZER;
	
	public static Servico getServicoFromString(String s) {
		switch(s.toUpperCase()) {
		case "CAFETARIA":
			return CAFETARIA;
		case "RESTAURANTE":
			return RESTAURANTE;
		case "LAZER":
			return LAZER;
		default:
			throw new IllegalArgumentException();
		}
	}

}
