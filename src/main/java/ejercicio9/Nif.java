/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author reduan
 */
public class Nif {
    
    public Scanner teclado = new Scanner(System.in);
    
    private String numDni;
    private char letraDni;
    
    public Nif() {
        
        this.numDni = "0";
        this.letraDni = 'o';
    }
    
    public Nif(String numDni) {
        
        this.numDni = numDni;
        this.letraDni = Nif.letraAsignada(numDni);
    }
    
    private static char letraAsignada(String num) {
        
        String letras = "TRWAGMYFPDXBNJZSOVHLCKE";
        int resto = Integer.parseInt(num) % 23;
        
        return letras.charAt(resto);
    }
    
    public String getNumDni() {
        return numDni;
    }
    
    public char getLetraDni() {
        return letraDni;
    }
    
    public String leer() {
        
        System.out.println("Introudce el número del DNI");
        numDni = teclado.nextLine();
        
        return numDni;
    }
    
    @Override
    public String toString() {
        
        return "Nif{" + "numDni=" + numDni + "-" + letraDni + '}';
    }
    
    public String mostrar() {
        
        return "Nif{" + "numDni=" + numDni + ", letraDni=" + letraDni + '}';
    }
    
    
}
