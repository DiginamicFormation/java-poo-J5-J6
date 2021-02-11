package interfaces;

public interface InterfaceB {

	public default void autreMethod(String a, Double b) {
		System.out.println("Autre méthode de l'interface B");
	}
}
