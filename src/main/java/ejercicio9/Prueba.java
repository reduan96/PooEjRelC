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
public class Prueba {

    public static void main(String[] args) {

        Nif Reduan = new Nif("09076396");
        
        Reduan.letraAsignada();
        System.out.println(Reduan.mostrar());
        
        Reduan.leer();
        Reduan.letraAsignada();
        System.out.println(Reduan.toString());
    }
}
