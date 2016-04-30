
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
       Barco Deportiva= new Deportiva(int potencia_cv, String matricula, int eslora, int precio);
       
       
       
       
       
       //Añadiendo al ArrayList
       Barcos.add(Velero);
    
    }
    
}
