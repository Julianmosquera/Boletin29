
package boletin29;

/**
 *
 * @author julian
 */
public abstract class Barco {
    private String matricula;
    private int eslora,precio;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int precio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getPrecio() {
        return precio;
    }

    
    
    
    
    
    
    
}
