package poudlard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashMap <String, Integer> hellos = new HashMap<String, Integer>();

	        String action, id, key;
	        Integer text;
	        action = "";
	        hellos.put("Gryffindor", 10000);
	        hellos.put("Hufflepuff", 999999);
	        hellos.put("Ravenclaw", 5000);
	        hellos.put("Slytherin", 10);

	        Iterator<String> iterator;

	        while (!action.equals("QUIT")) {

	            System.out.println("\nBienvenue � Poudlard ! \n - Tapez '+' pour ajouter un �l�ment au tableau. \n - Tapez '-' pour en retirer. \n - Tapez 'GET' pour afficher le tableau. \n - Tapez 'DEL' pour Supprimer un elem du tableau. \n - Tapez 'SIZE' pour conna�tre la taille du tableau. \n - Tapez 'QUIT' pour quitter le programme.");
	            action = sc.next();

	            if (action.equals("+") || action.equals("-")) {
	                System.out.println("Saisir la maison :");

	                id = sc.next();

	                if (action.equals("+")) {

						System.out.println("Saisir les points :");
	                    Integer points = hellos.get(id);
	   
	                    text = sc.nextInt();
	                    
	                    points = points + text;
	                    hellos.put(id, points);

	                } else if (action.equals("-")) {
	                    System.out.println("Saisir le texte :");
	                    Integer points = hellos.get(id);
	                    
	                    text = sc.nextInt();
	                    
	                    points = points - text;
	                    hellos.put(id, points);
	                	
	                }
	                	
	            } else if (action.equals("DEL")) {
	            	id = sc.next();
                    if (hellos.get(id) != null) {
                        hellos.remove(id);
                    } else {
                        System.out.println("La cl� " + id + " n'existe pas.");
                    }

                } 
	            
	            
	            else if (action.equals("GET")) {

	                iterator = hellos.keySet().iterator();
	                while (iterator.hasNext()) {
	                    key = iterator.next();
	                    System.out.println(key + " | " + hellos.get(key));
	                };
	                
	            } else if (action.equals("SIZE")) {
	                System.out.println("Taille : " + hellos.size());
	            }
	        }

	    }
}