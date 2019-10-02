/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public class Estoque extends Produto{
    
    protected int qtdProduto;
    protected String dataValidade;
    static Produto[] produto;
    final int maxProdutos = 50;
    final int maxPorProduto = 30;

    public Estoque(int qtdProduto, String dataValidade, Produto produto, String nome, int idproduto, Fornecedor fornecedor, float precoCusto, boolean perecivel, String apelido, int qntProduto) {
        super(nome, idproduto, fornecedor, precoCusto, perecivel, apelido, qntProduto);
        this.qtdProduto = qtdProduto;
        this.dataValidade = dataValidade;
        this.produto = new Produto[maxProdutos];
    }

    public Estoque(int qtdProduto, String dataValidade, Produto produto, String nome, Fornecedor fornecedor, float precoCusto, String apelido, boolean perecivel) {
        super(nome, fornecedor, precoCusto, apelido, perecivel);
        this.qtdProduto = qtdProduto;
        this.dataValidade = dataValidade;
        this.produto = new Produto[maxProdutos];
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto[] getProduto() {
        return produto;
    }
    
    public void setProduto(Produto p) {
        if(verificaProdutoExistente(p)){
            
        }
    }
    
    public boolean verificaProdutoExistente(Produto p){
        for (int i = 0; i < produto.length; i++) {
            if(produto[i] != null){
                if(produto[i].getIdProduto() == p.getIdProduto()){
                    i = produto.length;
                    System.out.println("teste");
                    return true;
                }
            }
        }
        System.out.println("teste22");
        return false;
    }
   
}
