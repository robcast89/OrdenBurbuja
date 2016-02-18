/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenburbuja;
import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class OrdenBurbuja {

    /**
     * @param args the command line arguments
     */
    int[] vector = {5,7,3,1,2,9,10};
    
    public static void main(String[] args) {
        // TODO code application logic here
        OrdenBurbuja ord = new OrdenBurbuja();
        ord.ordenaAscendete();
        ord.mostarVector();
    }
    
    public void ordenaAscendete(){
        for(int x=0;x<vector.length;x++){
            for(int x2=x+1;x2<vector.length;x2++){
                int variable = vector[x];
                if(vector[x] > vector[x2]){
                    vector[x] = vector[x2];
                    vector[x2] = variable;
                }
            }
        }
    }
    
    public void mostarVector(){
        System.out.println ("El orden de los numero ingresador de forma ascendente es:");
        for(int x=0;x<10;x++){
            System.out.println (vector[x]);
        }
    }
    
}
