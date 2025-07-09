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
public class Teste {

    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        AreaCalculavel b = new Quadrado(4);
        AreaCalculavel c = new Triangulo(4, 9);
        System.out.println(a.calculaArea());
        System.out.println(b.calculaArea());
        System.out.println(c.calculaArea());
    }
}
