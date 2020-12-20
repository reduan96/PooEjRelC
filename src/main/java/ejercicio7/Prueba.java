/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author reduan
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        //Constructor por defecto
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println(c1.toString());
        
        //Constructor parametrizado
        CuentaBancaria c2 = new CuentaBancaria(8967455533211097l,
                "09088433G","Juan", 600, 0.7,);
        
    }
}
