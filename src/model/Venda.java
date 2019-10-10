/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadariaTremBao.model;

/**
 *
 * @author Paulo
 */
public class Venda {
    private String data;
    private Cliente cliente;
    private Vendedor vendendor;
    private Produto[] produto;
    private float valorVenda;
    private String pagamento;
    private int parcelas;

    public Venda(String data, Cliente cliente, Vendedor vendendor) {
        this.data = data;
        this.cliente = cliente;
        this.vendendor = vendendor;
        produto = new Produto[20];
        this.valorVenda = 0;
    }

    public Venda(String data, Vendedor vendendor) {
        this.data = data;
        this.vendendor = vendendor;
        produto = new Produto[20];
    }

    public Venda() {
        this.produto = new Produto[20];
        this.valorVenda = 0;
    }
    public String addProdutoVenda(Produto adiciona){
        String retorno = null;
        int vazio=0;
        boolean adicionado = false;
        boolean ehVazio = false;
        for(int i=0; i<this.produto.length&&!adicionado; i++){
            if(this.produto[i]!=null){
                    if(this.produto[i].equals(adiciona)){
                        retorno = this.produto[i].adicionarProduto(adiciona.getQntProduto());
                        adicionado = true;
                    }
            }
        }
        for(int i=0; i<produto.length&&!ehVazio; i++)
        {
            if(produto[i]==null){
                ehVazio = true;
                vazio = i;
            }
        }
        if(!adicionado){
            this.produto[vazio] = adiciona;
            retorno = "Adcionado";
        }
        return retorno;
    }
    
    public String removeProdutoVenda(Produto remove){
        String retorno = null;
        boolean removido = false;
        for(int i=0; i<this.produto.length&&!removido; i++){
            if(this.produto[i]!=null){
                    if(this.produto[i].equals(remove)){
                        retorno = this.produto[i].removerProduto(remove.getQntProduto());
                        removido = true;
                    }
            }
        }
        return retorno;
    }
    
    public Produto[] getProdutos(){
        return this.produto;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendendor() {
        return vendendor;
    }

    public void setVendendor(Vendedor vendendor) {
        this.vendendor = vendendor;
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda() {
        this.valorVenda = 0;
        for (Produto i : produto) {
            if (i != null) {
                this.valorVenda += i.getPrecoCusto() * i.getQntProduto();
            }
        }
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    
    
}
