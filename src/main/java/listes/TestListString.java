package listes;

import java.util.*;

public class TestListString {

    public static void main(String[] args) {

        List<String> ville = new ArrayList();
        ville.add("Nice");
        ville.add("Carcassone");
        ville.add("Narbone");
        ville.add("Lyon");
        ville.add("Foix");
        ville.add("Pau");
        ville.add("Marseille");
        ville.add("Tarbes");

        String nomlong = null;
        int motlong = 0;
        for (int i = 0; i < ville.size(); i++) {

            if (ville.get(i).length() > motlong){
            	motlong = ville.get(i).length();
            	nomlong = ville.get(i);
            }
        }
        System.out.println(nomlong);
    }
}