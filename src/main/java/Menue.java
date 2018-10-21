
public class Menue implements UserInterface {
	
	private Lager lager;
	
	public Menue(Lager lager)
	{
		this.lager = lager;		
	}
	
	public void menueAnzeigen()
	{
		System.out.println("#################################");
		System.out.println("#          Menue                #");
		System.out.println("#-------------------------------#");
		System.out.println("#                               #");
		System.out.println("# 1. Inventar                   #");
		System.out.println("# 2. Lager kofigurieren         #");
		System.out.println("# 3. Artikel einlagern          #");
		System.out.println("# 4. Artikel ausliefern         #");
		System.out.println("# 5. Position                   #");
		System.out.println("# 6. Artikel Inhalt             #");
		System.out.println("# 7. Hilfe                      #");
		System.out.println("#                               #");
		System.out.println("#-------------------------------#");
		System.out.println("# 8. Beenden                    #");
		System.out.println("#                               #");
		System.out.println("#################################");
		System.out.println();
				
	}
	public void auswahl()
	{
		menueAnzeigen();
		while(true)
		{
			int auswahl = Tastatur.liesInt("Nr: ");
			
			if(auswahl == 1) artikelAnzeigen(); //anpassen die anzeige dan kann abschliessen
			else if(auswahl == 2) konfigurieren();
			else if(auswahl == 3) artikelEinlagern();
			else if(auswahl == 4) artikelAusliefern(); //muss noch machen anzeige anpassen um auszuwählen
			else if(auswahl == 5) position(); 
			else if(auswahl == 6) inhalt();
			else if(auswahl == 7) menueAnzeigen();
			else if(auswahl == 8) break;
			else;
		}
		
	}
	public void artikelAnzeigen()
	{
		lager.anzeigen();
	}
	
	public void konfigurieren() {
		int spalten = Tastatur.liesInt("Wie viele Splaten soll die Anzeige haben??");
		int reihen = Tastatur.liesInt("Wie viele Reihen soll die Anzeige haben??");
		AnzeigeLager.setSpalten(spalten);
		AnzeigeLager.setReihen(reihen);
	}
	
	public void artikelEinlagern() {
		lager.neuerArtikel();
	}
	public void artikelAusliefern()
	{
		String artikel = Tastatur.liesString("Welcher Artikel soll ausgeliefert werden?? (name)");
		lager.removeArtikel(artikel);
	}

	public void inhalt() {
		System.out.println("Artikel nach Position suchen:");
		int reihe = Tastatur.liesInt("In welcher Reihe befindet sich der Artikel ?");
		int spalte = Tastatur.liesInt("In welcher Spalte befindet sich der Artikel ?");
		lager.suchePosition(reihe,spalte);
	}
	public void position() {
		String suche =  Tastatur.liesString("Nach welchen artikel suchen Sie?? (name)");
		lager.sucheArtikel(suche);
		
	}
	

}
