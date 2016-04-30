
package boletin29;

/**
 *
 * @author julian
 */
public class Yate extends Barco{
    int camarotes, potencia_cv;

    public Yate() {
    }

    public Yate(int camarotes, int potencia_cv, String matricula, int eslora, int precio) {
        super(matricula, eslora, precio);
        this.camarotes = camarotes;
        this.potencia_cv = potencia_cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public int getPotencia_cv() {
        return potencia_cv;
    }

    
    
    
    
    
    
    
    
    
}
