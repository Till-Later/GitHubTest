/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubtest;
import static Prog1Tools.IOTools.*;

/**
 *
 * @author pascalschulze
 */
public class main {

    
    public static void main(String[] args) {
       eingabe();
       //Test
    }
     public static void eingabe () {
        System.out.println("Welche 2 Werte sollen miteinander addiert werden?");
        int x = readInteger("Geben sie den 1. Wert ein: ");
        int y = readInteger("Geben sie den 2. Wert ein: ");
        summe(x, y);
    }
     
     public static void summe (int a, int b) {
        String ausgabeSumme = "Die Summe von " + a + " und " + b + " ist: "+ (a+b);
        ausgabe(ausgabeSumme);
    }
     
    public static void ausgabe (String neueAusgabe) {
        System.out.println(neueAusgabe);
    }
    
}

