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
public class Diretor extends Funcionario implements Autenticavel, Estacionamento{
    private int senha;
    
    @Override
    public double getBonificacao() {
       return this.getSalario() * 0.10;
    }

    @Override
    public boolean autentica(int senha) {
       if(this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }

    @Override
    public void relatorioAutenticacao() {
        System.out.println("Relatório da Autenticação do Diretor");
        System.out.println("Nome: "+this.getNome());
        System.out.println("outros dados");
    }

    @Override
    public boolean autorizarEstaciomento(){
        System.out.println("Estacionamento autorizado para o diretos, vaga 12");
        return true;
    }
    
}
