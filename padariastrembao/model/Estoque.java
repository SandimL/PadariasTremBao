/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padariastrembao.model;

/**
 *
 * @author Lucas
 */
public class Estoque extends Produto{
    

    protected int qtdProduto;
    protected String dataValidade;
    protected Produto produto;
    final int maxProdutos = 50;
    final int maxPorProduto = 30;
    final int minPorProduto = 1;

    public Estoque(int qtdProduto, String dataValidade, Produto produto) {
        this.qtdProduto = qtdProduto;
        this.dataValidade = dataValidade;
        this.produto = produto;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    @Override
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public float getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public float getPrecoFinal() {
        return precoFinal;
    }

    @Override
    public void setPrecoFinal(float precoFinal) {
        this.precoFinal = precoFinal;
    }

    @Override
    public boolean isPerecivel() {
        return perecivel;
    }

    @Override
    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
    

    
}
