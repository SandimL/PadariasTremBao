/*
 * 
 * 
 * 
 */
package padaria.model;

/**
 *
 * 
 */
public final class Produto {
    private String nome;
    private int idproduto;
    private Fornecedor fornecedor;
    private float precoCusto;
    private boolean perecivel;
    private String apelido;
    private int qntProduto;

    public Produto(String nome, int idproduto, Fornecedor fornecedor, float precoCusto, boolean perecivel, String apelido, int qntProduto) {
        this.nome = nome;
        this.idproduto = idproduto;
        this.fornecedor = fornecedor;
        this.precoCusto = precoCusto;
        this.perecivel = perecivel;
        this.apelido = apelido;
        String retorno = this.adicionarProduto(qntProduto);
    }
    
    public Produto(String nome, Fornecedor fornecedor, float precoCusto, String apelido, boolean perecivel) {
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.precoCusto = precoCusto;
        this.apelido = apelido;
        this.perecivel = perecivel;
    }

    public int getQntProduto() {
        return qntProduto;
    }

    public String adicionarProduto(int qnt) {
        String retorno = null;
        if(this.qntProduto+qnt>30){
            retorno = "Limite máximo atingido";
        }else{
            this.qntProduto+=qnt;
            retorno = "Adicionado";
        }
        return retorno;
    }
    
    public String removerProduto(int qnt){
        String retorno = null;
        if(this.qntProduto-qnt==1){
            this.qntProduto-=qnt;
            retorno = "Limite minímo atingido";
        }else if(this.qntProduto-qnt>1){
            this.qntProduto-=qnt;
            retorno = "Removido";
        }else{
            retorno = "Estoque não possui essa quantidade";
        }
        return retorno;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public boolean equals(Produto compara){
        return nome.equals(compara.nome)&& idproduto==compara.idproduto;
    }
}
