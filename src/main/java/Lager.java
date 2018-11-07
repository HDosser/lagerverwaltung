import java.util.List;

public class Lager implements I_lager{
	
	private List<Artikel> lagerBestand;
	
	public Lager() {
		this.lagerBestand = ArtikelGenerator.getListe();
	}
	public void neuerArtikelErstellen(String[] werte) {
		double preis = Double.parseDouble(werte[0]);		
		lagerBestand.add(new Artikel(preis,werte[1], getID(),werte[2], LieferantenVerwaltung.getLieferant()));
	}
	//zum fuellen eine neue id vergeben
	private int getID()
	{
		return  lagerBestand.get((lagerBestand.size()-1)).getArtikelnummer()+1;
		
	}
	public void sucheArtikelName(String suche)
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
			System.out.println("Reihe :" +(gefunden.getPosition().getX()+1));
			System.out.println("Spalte :" +(gefunden.getPosition().getY()+1));
		}
		else System.out.println("Keinen Artikel mit der Bezeichnung "+suche+" gefunden!");
	}
	
	public void sucheArtikelPosition(int reihe, int spalte)
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
	
	public void loescheArtikel(String nameArtikel)
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
	
	public void setLagerBestand(List<Artikel> lagerBestand) {
		this.lagerBestand = lagerBestand;
	}

	public List<Artikel> getListe() {
		return this.lagerBestand;
	}



	
	
	 
}
