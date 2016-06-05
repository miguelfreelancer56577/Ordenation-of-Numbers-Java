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
public class Ordenar {
    private int [] numeros;

    public Ordenar(int ... numeros){
        this.numeros = numeros;
    }
    public int[] getNumeros() {
        return numeros;
    }
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    public int[] mayor(){
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[j] > numeros[i]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }
    public int[] menor(){
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[j] < numeros[i]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }
}
