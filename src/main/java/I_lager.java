import java.util.List;

public interface I_lager {
	
	List<Artikel> getListe();
	void neuerArtikelErstellen(String[] werte);
	void sucheArtikelName(String name);
	void sucheArtikelPosition(int reihe, int splate);
	void loescheArtikel(String name);
	
	
}
