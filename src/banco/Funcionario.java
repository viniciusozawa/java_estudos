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
    private String nome, departamentoTrabalho, dataEntradaBanco, rg;
    private double salario;
    private boolean registroNaCarteira;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamentoTrabalho() {
        return departamentoTrabalho;
    }

    public void setDepartamentoTrabalho(String departamentoTrabalho) {
        this.departamentoTrabalho = departamentoTrabalho;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isRegistroNaCarteira() {
        return registroNaCarteira;
    }

    public void setRegistroNaCarteira(boolean registroNaCarteira) {
        this.registroNaCarteira = registroNaCarteira;
    }
    
    public void mostrarDadosFuncionario(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento onde atua: "+this.departamentoTrabalho);
        System.out.println("Data de entrada(registrador eletrônico): "+this.dataEntradaBanco);
        System.out.println("Registro Geral(rg): "+this.rg);
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
