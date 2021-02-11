package reflections;

import sets.Pays;

public class TestReflectionUtils {
	
	public static void main(String[] args) {
		
		Pays pays = new Pays("France", 66, 43000);
		try {
			ReflectionUtils.afficherAttributs(pays);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.err.println(e.getMessage());
		}
	}
}

