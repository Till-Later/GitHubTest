/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubtest;

/**
 *
 * @author pascalschulze
 */
public class main {

    
    public static void main(String[] args) {
        ausgabe("Hallo Welt");
        int ergebnis = summe(5,8);
        ausgabe("" + ergebnis);
    }
    
    public static void ausgabe (String neueAusgabe) {
        System.out.println(neueAusgabe);
    }
    
    public static int summe (int a, int b) {
        return a+b;
    }
    
}
