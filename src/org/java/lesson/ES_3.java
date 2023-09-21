package org.java.lesson;

import org.java.lessons.elements.ElementiCiclabili;

public class ES_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ElementiCiclabili ciclabili = new ElementiCiclabili(array);

        while (ciclabili.hasAncoraElementi()) {
            int elemento = ciclabili.getElementoSuccessivo();
            System.out.println("Elemento successivo: " + elemento);
        }
             
        
        System.out.println("non ci sono più elementi da restituire");
    }
}
