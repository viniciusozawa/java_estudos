/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_26_03;
import java.util.Scanner;
/**
 *
 * @author 02338079698
 */
public class TesteProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto objProduto = new Produto();
        System.out.println("Digite o nome do produto: ");
        objProduto.nome = entrada.nextLine();
        System.out.println("Digite o preço do produto: ");
        objProduto.preco = entrada.nextDouble();
        System.out.println("Digite a porcentagem de desconto: ");
        objProduto.porcentagemDesconto = entrada.nextDouble();
        objProduto.calcularPrecoPromocional();
        objProduto.exibirInformacoes();
    }
}
