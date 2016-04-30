
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
    
    
    }
    
    
   
    
