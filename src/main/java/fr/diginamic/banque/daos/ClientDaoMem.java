package fr.diginamic.banque.daos;

import fr.diginamic.banque.entites.Client;

public class ClientDaoMem implements ClientDao {

	private Client[] clients = new Client[0];
	
	public ClientDaoMem() {
		
	}

	@Override
	public Client[] lister() {
		return clients;
	}

	@Override
	public void sauvegarder(Client nvClient) {
		// Création du nouveau tableau de taille+1 par rapport au précédent
		Client[] newClients = new Client[clients.length+1];
		
		// Copie de l'intégralité de l'ancien tableau dans le nouveau
		for (int i=0; i<clients.length; i++){
			newClients[i]=clients[i];
		}
		
		// Dans la "dernière case" du nouveau tableau j'ajoute le client passé en argument de la méthode
		newClients[newClients.length-1]=nvClient;
		
		// Enfin je valorise mon attribut d'instance clients avec le nouveau tableau
		clients=newClients;

	}

	@Override
	public boolean modifier(String nom, Client modifClient) {
		return false;
	}

	@Override
	public void supprimer(String nom) {
		
		int index = -1;
		for (int i=0; i<clients.length; i++){
			if (clients[i].getNom().equals(nom)){
				index=i;
			}
		}

		if (index!=-1){
			Client[] newClients = new Client[clients.length-1];
			for (int i=0; i<index; i++){
				newClients[i]=clients[i];
			}
			for (int i=index+1; i<clients.length; i++){
				newClients[i-1]=clients[i];
			}
		}

	}

	@Override
	public boolean clientExiste(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

}
