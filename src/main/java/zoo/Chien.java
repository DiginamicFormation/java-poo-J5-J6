package zoo;

public class Chien extends Mammifere {

	public void aboyer(){
		System.out.println("Je sais aboyer");
	}

	@Override
	public void seNourrir() {
		System.out.println("J'attends ma pâté.");
		
	}
}
