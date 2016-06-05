/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_2;

/**
 *
 * @author mangelt
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenar ordenar = new  Ordenar(-98,7,8,1,9,6,45,-1,-89);
        System.err.println("numeros ordenados de menor a mayor");
        int numeros[] = ordenar.menor();
        System.err.println("de menor a mayor");
        for (int i = 0; i < numeros.length; i++) {
            System.err.println(numeros[i]);
        }
        System.err.println("de mayor a menor");
        numeros = ordenar.mayor();
        for (int numero : numeros) {
            System.err.println(numero);
        }
    }
    
}
