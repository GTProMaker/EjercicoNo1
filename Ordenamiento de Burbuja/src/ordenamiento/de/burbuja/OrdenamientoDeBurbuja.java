
package ordenamiento.de.burbuja;

import javax.swing.JOptionPane;


public class OrdenamientoDeBurbuja {
 public static void main(String[] args) {
      
     
     
      int A[]=new int[5];
      int B[]=new int[5];
      String a[]=new String[5];
      
      for(int i=0;i<a.length;i++){
       a[i]=JOptionPane.showInputDialog("Ingrese el Dato "+(i+1)+" : ");
       A[i]=Integer.parseInt(a[i]);
       B[i]=A[i];
      }

     burbuja(A);
     
        System.out.println("Sin ordenar");
    for(int i=0;i<B.length;i++){   
        System.out.println(B[i]);
      }
        System.out.println("\nOrdenado");
    for(int i = 0;i < A.length; i++){
        System.out.println(A[i]);
        }
    }

     static void burbuja(int arreglo[])
    {
     int aux;   
     for(int i=0;i<arreglo.length-1;i++){/*Este For sirve para saber cuantas veces se ejecutara el programa*/
      for(int j=0;j<arreglo.length-1;j++){/*Este for es el que Ordenara los datos*/
       if(arreglo[j]>arreglo[j+1]){/*Este if es el que indicara si el numero anterior es mayor a numero siguiente*/
        aux=arreglo[j];/*Aux toma el valor del dato anterior*/
        arreglo[j]=arreglo[j+1];/*la posicion del dato anterior tomara el valor del dato siguiente*/
        arreglo[j+1]=aux;/*la posicion del dato siguiente tomara el valor de aux*/
       }
      }
     }
        
    }
    
}
