
package boletin29;

/**
 *
 * @author julian
 */
public class Deportiva extends Barco{
    private int potencia_cv;

    public Deportiva(int potencia_cv, String matricula, int eslora, int precio) {
        super(matricula, eslora, precio);
        this.potencia_cv = potencia_cv;
    }

    public int getPotencia_cv() {
        return potencia_cv;
    }

    @Override
    public String toString() {
        return "El alquiler de este barco deportivo con matricula "+matricula+" y con una potencia de "+potencia_cv;
    }

    
    
    
    @Override
    public void precio(int dias) {
        int precio=dias*((eslora*10)+potencia_cv);
        System.out.println(precio+"$");
    }
    
    
    
    
    
    
}
