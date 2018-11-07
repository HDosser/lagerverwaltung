public class Logic {

	public static void main(String[] args) {
		
		I_lager lager  = new Lager();
		UserInterface menue = new Menue();
		
		menue.menueAnzeigen();
		while(true)
		{
		
			String auswahl = Tastatur.liesAuswahl("Nr: ");
	
			if(auswahl.equals("artikelAnzeigen")) {
				menue.artikelAnzeigen(lager.getListe()); 
			}
			else if(auswahl.equals("konfigurieren")) {
				menue.konfigurieren();
			}
			else if(auswahl.equals("artikelEinlagern")) {
				lager.neuerArtikelErstellen(menue.artikelEinlagern());
			}
			else if(auswahl.equals("artikelAusliefern")) {
				lager.loescheArtikel(menue.artikelAusliefern());
			}
			else if(auswahl.equals("position")) {
				lager.sucheArtikelName(menue.position());
			}
			else if(auswahl.equals("inhalt")) {
				int[] werte = menue.inhalt();
				lager.sucheArtikelPosition(werte[1], werte[2]);
			}
			else if(auswahl.equals("menueAnzeigen")) {
				menue.menueAnzeigen();
			}
			
			
			else if(auswahl.equals("beenden")) break;
			else System.out.println("Bitte eine zahl von 1-8 eingeben!!");
		}
			
		
	}

}
