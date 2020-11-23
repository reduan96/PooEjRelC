/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico12;

/**
 *
 * @author reduan
 */
public class Prueba {

    public static void main(String[] args) {

        Empleado Pedro = new Empleado();

        String datosEmpleado = Pedro.toString();
        System.out.println("Pedro: " + datosEmpleado);
        
        Pedro.setNif("09379967K");
        Pedro.setSueldoBase(1300);
        datosEmpleado = Pedro.toString();
        System.out.println(datosEmpleado);

        Empleado Marcos = new Empleado("09315687F", 1200, 7.5,
                15, 5.0, true, 3);

        String datosEmpleado2 = Marcos.toString();
        System.out.println("Marcos: " + datosEmpleado2);
    }

}
