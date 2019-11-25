package sets;
import java.util.*;
public class TestSetDouble {
	public static void main(String[] args) {
		// Liste doubles: 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		System.out.println("Avant suppression :" + set);
		
		Iterator<Double> iterator = set.iterator();
		
		Double min = Double.MAX_VALUE;
		while (iterator.hasNext()) {
			Double n = iterator.next();
			if (n < min){
				min = n;
			}
		}
		set.remove(min);
		
		System.out.println("Après suppression :" + set);
		
	}
}