/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriebibonacci;

/**
 *
 * @author Motores
 */
public class SerieBibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /* los primeros dos terminos de la serie son: 1 (a --> anterior) y 2 (b -->                        actual). La variable c almacenara el Termino Generado que es el resultado de la           suma de a + b*/

        int suma = 2, a = 1, b = 2, c = 0;
        while (c <= 4000000) {
            c = a + b;
            if (c % 2 == 0) {
                suma += c;
            }
            a = b;
            b = c;
        }
  
        System.out.println("La suma los terminos pares es: " + suma);
       ;
    }
}


