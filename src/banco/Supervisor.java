/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 02338079698
 */
public class Supervisor extends Funcionario{
    
    public Supervisor(String nome) {
        super(nome);
    }
    
    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.12; 
    }

    
    
}
