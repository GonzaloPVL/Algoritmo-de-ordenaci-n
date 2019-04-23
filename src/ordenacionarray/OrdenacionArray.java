/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacionarray;

/**
 *
 * @author Gonzalo-Chus
 */
public class OrdenacionArray {
    
    
    public void ordenacionBurbuja (int[] listaNumeros){
        
        int auxiliar = 0;
        
        for(int j = 1; j<listaNumeros.length ; j++){
            for(int i = 0; i<listaNumeros.length-j; i++){
                
                if(listaNumeros[i]>listaNumeros[i+1]){
                    auxiliar = listaNumeros[i];
                    listaNumeros[i]= listaNumeros[i+1];
                    listaNumeros[i+1]=auxiliar;
                }
                
            }
        }
        for(int x=0; x<listaNumeros.length; x++){
            System.out.print(listaNumeros[x] + " ");
        }
        System.out.println();
        
        
        
        
    }

    
    public static void main(String[] args) {
        
         OrdenacionArray ejercicios = new OrdenacionArray();
         
        int[] lista1 = {57, 22 , 11, 13, 21, 7};
        int[] lista2 = {54, -2, 34, 45, -76};
        
        ejercicios.ordenacionBurbuja(lista1);
        ejercicios.ordenacionBurbuja(lista2);
    }
    
}
