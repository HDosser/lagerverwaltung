import java.util.ArrayList;
import java.util.List;

public class ArtikelGenerator {

	private static List<Artikel> liste = new ArrayList<Artikel>();
		
	private static void artikelErstellen()
	{		
		
		liste.add(new Artikel(199, "Matratze", 1, "1 stck", LieferantenVerwaltung.getLieferant()));	
		liste.add(new Artikel(38.90, "Kindersitz", 2, "1 stck", LieferantenVerwaltung.getLieferant()));	
		liste.add(new Artikel(23, "TischLampe", 3, "1 stck", LieferantenVerwaltung.getLieferant()));	
		liste.add(new Artikel(70, "Tablet", 4, "1 stck", LieferantenVerwaltung.getLieferant()));	
		liste.add(new Artikel(28.50, "Rucksack", 5, "1 stck", LieferantenVerwaltung.getLieferant()));	
		liste.add(new Artikel(110, "Smartwatch",6, "1 stck", LieferantenVerwaltung.getLieferant()));		
		liste.add(new Artikel(33.90, "Akkuschrauber", 7, "1 stck", LieferantenVerwaltung.getLieferant()));
		liste.add(new Artikel(60, "Staubsauger", 8, "1 stck", LieferantenVerwaltung.getLieferant()));	
		
	}

	public static List<Artikel> getListe() {
		if(liste.isEmpty()) artikelErstellen();
		return liste;
	}

	
	
}
