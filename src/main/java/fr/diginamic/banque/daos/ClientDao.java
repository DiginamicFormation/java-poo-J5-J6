package fr.diginamic.banque.daos;

import fr.diginamic.banque.entites.Client;

/** Liste les méthodes obligatoires pour la persistence des clients
 * @author DIGINAMIC
 */
public interface ClientDao {
	
	/** Retourne la liste de tous les clients
	 * @return
	 */
	Client[] lister();
	
	/** Permet de sauvegarder un nouveau client
	 * @param nvClient nouveau client à sauvegarder
	 */
	void sauvegarder(Client nvClient);
	
	/** Permet de modifier le client dont le nom est passé en paramètre
	 * avec les informations contenues dans le paramètre modifClient
	 * @param nom nom du client
	 * @param modifClient nouvelles informations concernant le client
	 */
	boolean modifier(String nom, Client modifClient);
	
	/** Supprime un client
	 * @param nom nom du client à supprimer
	 */
	void supprimer(String nom);

	/** Retourne true si le nom du client passé en paramètre existe, 
	 * false dans le cas contraire
	 * @param nom du client
	 * @return boolean
	 */
	boolean clientExiste(Client client);
}
