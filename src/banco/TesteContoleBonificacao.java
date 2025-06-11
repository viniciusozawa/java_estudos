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
public class TesteContoleBonificacao {
    public static void main(String[] args) {
        Gerente objgerente = new Gerente();
        objgerente.setSalario(1000);
        Supervisor objsupervisor = new Supervisor("Tulio");
        objsupervisor.setSalario(1000);
        
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.resgistra(objgerente);
        controle.resgistra(objsupervisor);
        
        System.out.println("Total de Bonificações: "+controle.getTotalDeBonificacoes());
    }
}
