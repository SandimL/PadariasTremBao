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
public final class FornecedorOcasional extends Fornecedor{
    
    public FornecedorOcasional(String nome, String documento, String endereco) {
        super(nome, documento, endereco);
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getDocumento() {
        return documento;
    }
    
    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    @Override
    public String getEndereco() {
        return endereco;
    }
    
    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
