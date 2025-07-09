/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author 02338079698
 */
public class Circulo implements AreaCalculavel{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);
    }
    
    
}
