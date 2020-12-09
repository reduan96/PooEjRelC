/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author reduan
 */
public class Nif {
    
    //import java.util.Scanner;

    private String numDni;
    private char letraDni;

    public Nif() {

        this.numDni = "0";
        this.letraDni = 'o';
    }

    public Nif(String numDni) {

        this.numDni = numDni;
    }

    private void letraAsignada() {

        int i = 0;
        int resultado = 0;
        for (i = 0; i < numDni.length() - 1; i++) {

            i += (i + 1);
        }

        resultado = i % 23;

        switch(resultado){
            
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
    
//    public static String leer(){
//        
//        //Scanner teclado = new Scanner();
//    }
}
