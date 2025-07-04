/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Date;

/**
 *
 * @author 02338079698
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario objf1 = new Gerente();
        Funcionario objf2 = new Supervisor("Almiton");
        //Date horario = new Date();
        objf1.setNome("Jofrinho");
        objf1.setRg("MG-2438103");
        objf1.setDepartamentoTrabalho("Atendimento ao Público");
        
     
        objf1.setSalario(1000);
        
        objf1.aumentoSalario(10);
        
        System.out.println("Salário ao final do mês: "+objf1.getSalario());
        objf1.mostrarDadosFuncionario();
        objf2.mostrarDadosFuncionario();

    }
}
