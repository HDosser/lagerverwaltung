import java.util.List;
import java.util.ArrayList;

public class Lager {
	
	private List<Artikel> lagerBestand;
	
	public Lager() {
		this.lagerBestand = ArtikelGenerator.getListe();
	}

	public void anzeigen()
	{		
		AnzeigeLager.anzeige(lagerBestand);
	}	
	
	public void neuerArtikel() {
		
		double preis = Tastatur.liesDouble("Preis :");
		String bezeichnung = Tastatur.liesString("Bezeichnung :");
		String verpackung  = Tastatur.liesString("Verpackungseinheit :");
		lagerBestand.add(new Artikel(preis,bezeichnung, getID(),verpackung, LieferantenVerwaltung.getLieferant()));
	}	
	private int getID()
	{
		return  lagerBestand.get((lagerBestand.size()-1)).getArtikelnummer()+1;
		
	}
	public void sucheArtikel(String suche)
	{
		Artikel gefunden = null;
		for(Artikel a: lagerBestand)
		{
			if(a.getBezeichnung().equals(suche)) {
				gefunden = a;
				break;
			}
		}
		if(gefunden != null)
		{
			System.out.println("Position von "+suche+": ");
			System.out.println("Reihe :" +gefunden.getPosition().getX());
			System.out.println("Spalte :" +gefunden.getPosition().getY());
		}
		else System.out.println("Keinen Artikel mit der Bezeichnung "+suche+" gefunden!");
	}
	
	public void suchePosition(int reihe, int spalte)
	{
		boolean gefunden = false;
		for(Artikel a : lagerBestand)
		{
			if(a.getPosition().getX() == (reihe-1) && a.getPosition().getY() == (spalte-1))
			{
				System.out.println("Der Artikel mit der Position Reieh:"+reihe+" Spalte:"+spalte+" heist :"+a.getBezeichnung());
				gefunden = true;
				break;
			}
		}
		if(!gefunden) System.out.println("Es wurde kein Artikel mit der position Reihe:"+reihe+" Splate:"+spalte+" gefunden!");
	}
	
	public void removeArtikel(String nameArtikel)
	{
		boolean gefunden = false;
		for(Artikel a : lagerBestand)
		{
			if(a.getBezeichnung().equals(nameArtikel))
			{
				lagerBestand.remove(a);
				gefunden = true;
				System.out.println(nameArtikel+" wurde ausgeliefert!");
				break;
			}
		}
		if(gefunden == false) System.out.println("Kein Artikel mit dem Namen"+nameArtikel+" gefunden!");
	}
	
	
	public List<Artikel> getLagerBestand() {
		return lagerBestand;
	}

	public void setLagerBestand(List<Artikel> lagerBestand) {
		this.lagerBestand = lagerBestand;
	}
	
	
	
	
	
	 
}
