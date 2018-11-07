public class Lieferant {
	
	String name;
	String adresse;
	String ort;
	String telefonnummer;
	
	public Lieferant(String name,String adresse,String ort, String telefonnummer) {
		this.name = name;
		this.adresse = adresse;
		this.ort = ort;
		this.telefonnummer = telefonnummer;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	
}
