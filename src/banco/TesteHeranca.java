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
public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario objfuncionario = new Funcionario();
        objfuncionario.setNome("Tulio");
        objfuncionario.setSalario(10000);
        
        Gerente objGerente = new Gerente();
        objGerente.setNome("Mario");
        objGerente.setSalario(15000);
        objGerente.setSenha(123);
        objGerente.autentica(123);
        
        Funcionario objSupervisor = new Supervisor();
        objSupervisor.setNome("Pedro");
        objSupervisor.setSalario(12000);
        
        objfuncionario.mostrarDadosFuncionario();
        objGerente.mostrarDadosFuncionario();
        objSupervisor.mostrarDadosFuncionario();
        
        objfuncionario.getBonificacao();
        objGerente.getBonificacao();
        objSupervisor.getBonificacao();
        
        System.out.println("Bonificação Funcionário: "+objfuncionario.getBonificacao());
        System.out.println("Bonificação Gerente: "+objGerente.getBonificacao());
        System.out.println("Bonificação Supervisor: "+objSupervisor.getBonificacao());
    }
}
