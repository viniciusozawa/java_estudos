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
public class Gerente extends Funcionario{ //torno a classe Gerente filha de funcionario
   
    private int senha;
    private int numeroDeFuncionarioGerenciadas;

    public Gerente() {
    }

    public Gerente(String nome, String departamentoTrabalho, String dataEntradaBanco, String rg) {
        super(nome, departamentoTrabalho, dataEntradaBanco, rg);
    }

    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionarioGerenciadas() {
        return numeroDeFuncionarioGerenciadas;
    }

    public void setNumeroDeFuncionarioGerenciadas(int numeroDeFuncionarioGerenciadas) {
        this.numeroDeFuncionarioGerenciadas = numeroDeFuncionarioGerenciadas;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        
        
        return super.getBonificacao() + 1000; 
    }
    
    
}
