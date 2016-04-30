
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author julian
 */
public class Boletin29 {

  
    public static void main(String[] args) {
       ArrayList<Barco> Barcos = new ArrayList();
       Barco Velero= new Velero(4,"AAA",25,600);
       Barco Yate =new Yate(3,800,"BBB",250,1000);
       Barco Deportiva= new Deportiva(900,"CCC",45,1200);
       
       
       
       
       
       //Añadiendo al ArrayList
       Barcos.add(Velero);
       Barcos.add(Yate);
       Barcos.add(Deportiva);
       
       //Factura
        System.out.println(Velero.toString());
        Velero.precio(5);
        
        
        System.out.println(Deportiva.toString());
        Deportiva.precio(5);
        
        
        System.out.println(Yate.toString());
        Yate.precio(5);
        
        
        //Le puse 5 como ejemplo de un alquiler de 5 días
        
    
    }
    
}
