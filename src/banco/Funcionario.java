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
public class Funcionario {
    String nome, departamentoTrabalho, dataEntradaBanco, rg;
    double salario;
    boolean registroNaCarteira;
    
    public void mostrarDadosFuncionario(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento onde atua: "+this.departamentoTrabalho);
        System.out.println("Data de entrada(registrador eletrônico): "+this.dataEntradaBanco);
        System.out.println("Registro Geral(rg): "+this.rg);
    }
    
    public void consultarCliente(int codCliente){
        
                
    }
    
    public void registrandoHorarioEnt(String horario, double verhorario){
        
        this.dataEntradaBanco = horario;
    }
    
    public void aumentoSalario(double quantidadeAtendimento){
        double valorAtendimento = quantidadeAtendimento * 0.10;
        this.salario = this.salario + valorAtendimento;
        
    }
    
    public boolean demitirFuncionario(){
        return registroNaCarteira = false;
    }
    
}
