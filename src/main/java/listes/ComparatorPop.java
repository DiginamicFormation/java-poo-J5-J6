package listes;

import java.util.Comparator;

public class ComparatorPop implements Comparator<Pays> {
 
	private int sens;
	private int critere;
	
	public static final int ASC = 1;
	public static final int DESC = -1;
	
	public static final int CRITERE_POPULATION = 1;
	public static final int CRITERE_NOM = 2;
	
	public ComparatorPop(int sens, int critere){
		this.sens = sens;
		this.critere = critere;
	}
	
	@Override
	public int compare(Pays o1, Pays o2) {
		
		if (critere==CRITERE_POPULATION){
			if (o1.getPop() > o2.getPop()){
				return sens;
			}
			else if (o1.getPop() < o2.getPop()){
				return -sens;
			}
		}
		else if (critere==CRITERE_NOM){
			return sens * o1.getNom().compareTo(o2.getNom());
		}
		
		return 0;
	}

}
