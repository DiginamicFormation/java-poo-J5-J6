package fr.diginamic.banque.daos;

import fr.diginamic.banque.entites.Compte;

/** Implémentation mémoire de {@link CompteDao}
 * @author DIGINAMIC
 *
 */
public class CompteDaoMem implements CompteDao {

	/** comptes : Compte[]*/
	private Compte[] comptes = new Compte[0];
	
	/**
	 * Constructeur
	 */
	public CompteDaoMem() {
		
	}

	@Override
	public Compte[] lister() {
		return comptes;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		// Création du nouveau tableau de taille+1 par rapport au précédent
		Compte[] tmp = new Compte[comptes.length+1];
		
		// Copie de l'intégralité de l'ancien tableau dans le nouveau
		for (int i=0; i<comptes.length; i++){
			tmp[i]=comptes[i];
		}
		
		// Dans la "dernière case" du nouveau tableau j'ajoute le compte passé en argument de la méthode
		tmp[tmp.length-1]=nvCompte;
		
		// Enfin je valorise mon attribut d'instance comptes avec le nouveau tableau
		comptes=tmp;

	}

	@Override
	public boolean supprimer(String numero) {
		
		int index = -1;
		for (int i=0; i<comptes.length; i++){
			if (comptes[i].getNumero().equals(numero)){
				index=i;
			}
		}

		if (index!=-1){
			Compte[] tmp = new Compte[comptes.length-1];
			for (int i=0; i<index; i++){
				tmp[i]=comptes[i];
			}
			for (int i=index+1; i<comptes.length; i++){
				tmp[i-1]=comptes[i];
			}
			comptes=tmp;
			return true;
		}
		return false;
	}

	@Override
	public boolean existe(String numero) {
		for (int i=0; i<comptes.length; i++){
			if (comptes[i].getNumero().equals(numero)){
				return true;
			}
		}
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		for (int i=0; i<comptes.length; i++){
			if (comptes[i].getNumero().equals(numero)){
				return comptes[i];
			}
		}
		return null;
	}

}
