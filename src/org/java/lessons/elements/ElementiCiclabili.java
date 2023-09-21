package org.java.lessons.elements;

public class ElementiCiclabili {
    private int[] elenco;
    private int indice;
    private int elementiRestituiti;

    public ElementiCiclabili(int[] array) {
        this.elenco = array;
        this.indice = 0;
        this.elementiRestituiti = 0;
    }

    public int getElementoSuccessivo() {
 
        int elemento = elenco[indice];
        indice = (indice + 1) % elenco.length;
        elementiRestituiti++;
        return elemento;
    }

    public boolean hasAncoraElementi() {
        return elementiRestituiti < elenco.length;
    }
}
