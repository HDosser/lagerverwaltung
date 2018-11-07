import java.util.List;

public interface UserInterface {
	void konfigurieren();
	int[] inhalt();
	String position();
	void menueAnzeigen();
	void artikelAnzeigen(List<Artikel> liste);
	String[] artikelEinlagern();
	String artikelAusliefern();
}
