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
        Funcionario objf1 = new Funcionario();
        //Date horario = new Date();
        
        objf1.nome = "Jofrinho";
        objf1.rg = "MG-2438103";
        objf1.departamentoTrabalho = "Atendimento ao Público";
        //objf1.registrandoHorarioEnt(horario.toString(horario.getHours(),horario.getMinutes()), 0);
        objf1.salario = 1000;
        objf1.aumentoSalario(10);
        
        System.out.println("Salário ao final do mês: "+objf1.salario);
    }
}
