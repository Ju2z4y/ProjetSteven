package cgi.stevenProjet.enums;

public enum VoitureEnum {
	
	RENAULT("Renault"),
	PEUGEOT("Peugeot");
	
	private String type;
	
	VoitureEnum(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}

}
