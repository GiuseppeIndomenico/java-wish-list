package org.java.lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ES_2 {
	 public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 
		 
		 System.out.println("inserisci una frase: ");
		 
		 String frase= sc.nextLine();
		 
		 sc.close();
		 
		 Map<Character, Integer> c = new HashMap<>();
		 
		 for(char carattere : frase.toCharArray()) {
			 if(c.containsKey(carattere)) {
				 c.put(carattere, c.get(carattere)+1);
				 
			 }else {
				 c.put(carattere, 1);
			 }
			 
		 }
			 for (Map.Entry<Character, Integer> entry : c.entrySet()) {
		            char carattere = entry.getKey();
		            int numC = entry.getValue();
		            System.out.println((carattere == ' ' )? "spazio vuoto" + ": " + numC :  carattere + ": " + numC);
		        }
			 
			 
		 
	}
}
