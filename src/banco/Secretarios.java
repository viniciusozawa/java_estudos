/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author 02338079698
 */
public class Secretarios extends Funcionario{

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.10;
    }
    
}
