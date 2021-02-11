package interfaces;

public interface InterfaceA {

	public void doSth();
	
	public default void autreMethod() {
		System.out.println("Autre méthode de l'interface A");
	}

}
