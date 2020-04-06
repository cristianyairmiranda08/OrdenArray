/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarmayoramenor;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class OrdenarMayorAmenor {
 
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
     
        int ordenarray[]= new int[30];
     
        int limite,i,j,aux;
     
        System.out.println("Ingrese le limite de la lista ");
        limite=lector.nextInt();
     
        for(i=0;i<limite;i++){
            System.out.print("X["+(i+1)+"]= ");
            ordenarray[i]=lector.nextInt();
        }
     
        for(i=0;i<limite;i++){
            for(j=i+1;j<limite;j++){
                if(ordenarray[i]<ordenarray[j]){
                    aux=ordenarray[i];
                    ordenarray[i]=ordenarray[j];
                    ordenarray[j]=aux;
                }
            }
        }

        System.out.print("Arreglo= {");
        for(i=0;i<limite;i++){
            System.out.print(ordenarray[i]+", ");
        }
        System.out.print("}");
     
    }
}