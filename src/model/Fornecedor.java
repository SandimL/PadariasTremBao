/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 * @author Paulo
 */
public class Fornecedor extends Pessoa implements Relatorio{
    private boolean recorrente;

    public Fornecedor(String nome, String telefone, String documento, String enderecoRua, String enderecoNumero, String enderecoBairro, String enderecoCidade, String enderecoEstado) {
        super(nome, telefone, documento, enderecoRua, enderecoNumero, enderecoBairro, enderecoCidade, enderecoEstado);
        this.recorrente = false;
    }    

    public Fornecedor(String documento) {
        super(documento);
    }

    public Fornecedor() {
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }

    @Override
    public String getInfo() {
        String txt = "";       
        txt += "=====================================================================\n" +
                "Informações Fornecedor: \n" +
                "Nome: " + super.getNome() +"\n"+
                "Telefone: " + super.getTelefone() +"\n"+
                "Endereço: " + super.getEnderecoCompleto()+"\n"+
                "Gold: " + isRecorrente()+"\n"+
                "=====================================================================\n";
        return txt;  
        
    }
}
