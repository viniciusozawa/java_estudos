/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author Usuario
 */
public class Conta {
    private String idConta;
    private String dataVencimento;
    private String dataPagamento;

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    
    public void visualizarConta(Produto pro, Cliente cli){
        System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR: "+this.idConta);
        System.out.println("PRODUTO: "+pro.getDescrisaoProduto());
        System.out.println("CLIENTE: "+cli.getNomeCliente()+" CPF: "+cli.getCpf());
        System.out.println("VALOR: "+pro.getValorProduto());
        System.out.println("DATA VENCIMENTO: "+this.dataVencimento);
        System.out.println("DATA PAGAMENTO: "+this.dataPagamento);
        System.out.println("_______________________________");
    }
    
    
}
