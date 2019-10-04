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
public class Estoque {
    private Produto[] produto;
    private int maxProdutos;
    private int qntProdutos;

    public Estoque(int maxProdutos) {
        this.maxProdutos = maxProdutos;
        produto = new Produto[maxProdutos];
        this.qntProdutos = 0;
    }

    public Estoque() {
    }
    
    
    public String addProduto(Produto add, int quantidade){
        String retorno = null;
        boolean adicionado = false;
        int vazio=0;
        
        for(int i=0; i<produto.length&&!adicionado; i++){
            if(produto[i]!=null){
                if(produto[i].equals(add)){
                    retorno = produto[i].adicionarProduto(quantidade);
                    adicionado = true;
                    qntProdutos++;
                }
            }else{
                vazio = i;
            }
        }
        if(!adicionado&&qntProdutos<=maxProdutos){
            produto[vazio] = add;
            retorno = "Produto adicionado";
        }
        return retorno;
    }
    public String addProduto(Produto add){
        String retorno = "";
        boolean adicionado = false;
        
        for(int i=0; i<produto.length&&!adicionado; i++){
            if(produto[i]==null&&qntProdutos<=maxProdutos){
                    produto[i] = add;
                    retorno = "Adicionado";
                    adicionado = true;
                    qntProdutos++;
                }
         }
        return retorno;
    }
    
    public String removeProduto(Produto remove, int quantidade){
        String retorno=null;
        boolean removido = false;
        
        for(int i=0; i<produto.length&&!removido; i++){
            if(produto[i]!=null){
                if(produto[i].equals(remove)){
                    retorno = produto[i].removerProduto(quantidade);
                    removido = true;
                }
            }
        }
        if(!removido){
            retorno = "Produto não encontrado";
        }
        return retorno;
    }
    
    public Produto[] getProdutos(){
        return produto;
    }
    
    public Produto getProduto(Produto consulta){
        boolean encontrado = false;
        Produto retorno=null;
        for(int i=0; i<produto.length&&!encontrado; i++){
            if(produto[i].equals(consulta)){
                retorno = produto[i];
                encontrado = true;
            }
        }
        
        return retorno;
    }
}
