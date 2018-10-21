
public class Artikel{
	private double preis;
	private String bezeichnung;
	private int artikelnummer;
	private String verpackungseinheit;
	private Lieferant lieferant;
	private Position position;
	
	public Artikel(double preis, String bezeichnung, int artikelnummer, String verpackungseinheit, Lieferant lieferant) {
		this.preis = preis;
		this.bezeichnung = bezeichnung;
		this.artikelnummer = artikelnummer;
		this.verpackungseinheit = verpackungseinheit;
		this.lieferant = lieferant;
	}

	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getArtikelnummer() {
		return artikelnummer;
	}
	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	public String getVerpackungseinheit() {
		return verpackungseinheit;
	}
	public void setVerpackungseinheit(String verpackungseinheit) {
		this.verpackungseinheit = verpackungseinheit;
	}
	public Lieferant getLieferant() {
		return lieferant;
	}
	public void setLieferant(Lieferant lieferant) {
		this.lieferant = lieferant;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
}
