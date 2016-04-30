/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    
    
    
    
    
}
