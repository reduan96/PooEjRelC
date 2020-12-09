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
    }
    
    public void letraAsignada() {
        
        int suma = 0;
        int resultado = 0;
        
        char[] caracter = new char[numDni.length()];
        
        for (int i = 0; i < numDni.length(); i++) {
            
            caracter[i] = numDni.charAt(i);
        }
        for (int i = 0; i < caracter.length; i++) {
            
            suma = suma + (int) caracter[i];
        }
        
        //System.out.println("suma " + suma);
        resultado = suma % 23;
        
        switch (resultado) {
            
            case 0:
                this.letraDni = 'T';
                break;
            case 1:
                this.letraDni = 'R';
                break;
            case 2:
                this.letraDni = 'W';
                break;
            case 3:
                this.letraDni = 'A';
                break;
            case 4:
                this.letraDni = 'G';
                break;
            case 5:
                this.letraDni = 'M';
                break;
            case 6:
                this.letraDni = 'Y';
                break;
            case 7:
                this.letraDni = 'F';
                break;
            case 8:
                this.letraDni = 'P';
                break;
            case 9:
                this.letraDni = 'D';
                break;
            case 10:
                this.letraDni = 'X';
                break;
            case 11:
                this.letraDni = 'B';
                break;
            case 12:
                this.letraDni = 'N';
                break;
            case 13:
                this.letraDni = 'J';
                break;
            case 14:
                this.letraDni = 'Z';
                break;
            case 15:
                this.letraDni = 'S';
                break;
            case 16:
                this.letraDni = 'Q';
                break;
            case 17:
                this.letraDni = 'V';
                break;
            case 18:
                this.letraDni = 'H';
                break;
            case 19:
                this.letraDni = 'L';
                break;
            case 20:
                this.letraDni = 'C';
                break;
            case 21:
                this.letraDni = 'K';
                break;
            case 22:
                this.letraDni = 'E';                
                break;
        }
    }
    
    public String getNumDni() {
        return numDni;
    }
    
    public char getLetraDni() {
        return letraDni;
    }
    
    public String leer() {
        
        System.out.println("Introudce el número del DNI");
        this.numDni = teclado.nextLine();
        
        return this.numDni;
    }
    
    @Override
    public String toString() {
        
        return "Nif{" + "numDni=" + numDni + "-" + letraDni + '}';
    }
    
    public String mostrar() {
        
        return "Nif{" + "numDni=" + numDni + ", letraDni=" + letraDni + '}';
    }
    
    
}
