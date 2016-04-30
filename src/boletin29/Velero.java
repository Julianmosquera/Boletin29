
package boletin29;

/**
 *
 * @author julian
 */
public class Velero extends Barco{
    private int mastiles;

    public Velero(int mastiles, String matricula, int eslora, int precio) {
        super(matricula, eslora, precio);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    @Override
    public String toString() {
        return "Alquilar este velero con numero de matricula "+matricula+" y con "+mastiles+" mastiles";
    }
    
    
    
    @Override
    public void precio(int dias) {
        int precio=dias*((eslora*10)+mastiles);
        System.out.println(precio+"$");
    }
    
    }
    
    
   
    
