
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LieferantenVerwaltung {
	static List<Lieferant> lieferantenListe = new ArrayList<Lieferant>();;
	
	
	public static Lieferant getLieferant()
	{
		Random rand = new Random();
		
		if(lieferantenListe.isEmpty()) erstelleLieferanten();
		return lieferantenListe.get(rand.nextInt(lieferantenListe.size()));			
		
	}
	
	private static void erstelleLieferanten() {
		lieferantenListe.add(new Lieferant("UPS AT", "Irgendwo 4", "Wien", "364236463248"));
		lieferantenListe.add(new Lieferant("Bartolli", "FranzHuber 25", "Bozen", "+39 9329474763"));
		lieferantenListe.add(new Lieferant("DHL DE", "Friedrichshafen 12", "Hamburg", "+42 286487237856"));
		lieferantenListe.add(new Lieferant("UPS IT", "Rennweg 13", "Meran", "+39 0473765435"));
	}
}
