package org.java.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.java.gift.Regalo;

public class ES_1 {
	//ES 1.
    public static void main(String[] args) {

        boolean notFinish = true;
        Scanner sc = new Scanner(System.in);

        List<Regalo> regali = new ArrayList<>();

        while (notFinish) {
            System.out.println("aggiungiamo un regalo alla lista: ");

            System.out.println("regalo: ");
            	String nome= sc.nextLine();

            System.out.print("A chi è destinato: ");
            String destinatario = sc.nextLine();
            
            Regalo gift= new Regalo(destinatario, nome);
            
            regali.add(gift);
            

            System.out.println("vuoi continuare ad aggiungere regali? S/N");

            notFinish = sc.nextLine().equalsIgnoreCase("S");
        }
        sc.close();

        System.out.println("\n------------------------\n");
        System.out.println("Lista completata! \n");

          for (int x = 0 ; x< regali.size(); x++) {
        	  Regalo gift = regali.get(x);
              System.out.println("regalo per " + gift.getDestinatario() + ": " + gift.getNome() );
          }
        
        }
    //----------------------------------------------------
    
    
    
    }


