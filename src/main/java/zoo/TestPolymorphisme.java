package zoo;

public class TestPolymorphisme {

	public static void main(String[] args) {
		
		// Référence sur l'objet new Chat() qui est en mémoire
		Chat chat = new Chat();
		chat.setNom("Pablo");
		afficher(chat);
		
		System.out.println(chat);
		
		
		Chien chien = new Chien();
		afficher(chien);
		
		// Référence d'un type plus abstrait pour manipuler ce même objet
		Mammifere m = new Chat();  // affectation de droite à gauche

		Animal a = new Chat();
		
		Object o = new Chat();
		
		// Ecriture interdite
		// Chat c = new Mammifere();
	}
	
	public static void afficher(Mammifere m){
		m.allaiter();
	}
	
	public static void afficher(Chat c){
		c.allaiter();
		c.miauler();
	}
	
	public static void afficher(Chien c){
		c.allaiter();
		c.aboyer();
	}

}
