import java.util.List;

public class AnzeigeLager {

	private static int reihen = 4;
	private static int spalten = 2;
		
	public static void anzeige(List<Artikel> liste)
	{
		int z = 0;
		int anzahlItems = liste.size();
		
		System.out.print("  ");
		for(int i = 0; i < spalten;i++)
		{
			System.out.print("|\t"+(i+1)+"\t\t|");
		}
		
		System.out.println();
		for(int i = 0; i < reihen; i++ )
		{
			if(i<10) System.out.print(" "+(i+1));			
			else  System.out.print((i+1));
			
			for(int y = 0; y < spalten; y++)
			{
				if(z >= anzahlItems) break;
				liste.get(z).setPosition(new Position(i,y));
				if(liste.get(z).getBezeichnung().length() >=12)	System.out.print("| "+ liste.get(z).getBezeichnung()+"\t|");
				else System.out.print("| "+ liste.get(z).getBezeichnung()+"\t\t|");
				z++;
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int getReihen() {
		return reihen;
	}
	public static void setReihen(int reihe) {
		reihen = reihe;
	}
	public static int getSpalten() {
		return spalten;
	}
	public static void setSpalten(int spalte) {
		spalten = spalte;
	}
	
}
