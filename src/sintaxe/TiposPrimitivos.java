/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author 02338079698
 */
public class TiposPrimitivos {

    public static void main(String[] args) {

        byte idade = 127;
        short nPais = 32767;
        int nAluno = -2147483648;
        long nHabitante = 1000000000000000000L; //colocar L maiusculo
        float salario = 1000.35f; //colocar f
        double totalSalario = 1009000.35;
        boolean opcao = true; //verdadeiro ou falso
        char sexo = 'F';
        
        String nome = "Vinicius";
        Integer nAluno2; //Integer e uma classe por isso maiuscul0
        Double totalSalario2;
        
        System.out.println("Byte: " + idade);
        System.out.println("Short: " + nPais);
        System.out.println("Int: " + nAluno);
        System.out.println("Long: " + nHabitante);
        System.out.println("Float: " + salario);
        System.out.println("Double: " + totalSalario);
        System.out.println("Boolean: " + opcao);
        System.out.println("Char: " + sexo);
    }
}
