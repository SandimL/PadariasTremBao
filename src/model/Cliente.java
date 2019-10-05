/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 * @author Paulo
 */
public class Cliente extends Pessoa implements Relatorio{
    
    private boolean gold;
    private boolean platina;
    private float valorCompras;

    public Cliente(String nome, String telefone, String documento, String enderecoRua, String enderecoNumero, String enderecoBairro, String enderecoCidade, String enderecoEstado) {
        super(nome, telefone, documento, enderecoRua, enderecoNumero, enderecoBairro, enderecoCidade, enderecoEstado);
        this.gold = false;
        this.platina = false;
        this.valorCompras = 0;
    }

    public Cliente(String documento) {
        super(documento);
    }

    public Cliente() {
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public boolean isPlatina() {
        return platina;
    }

    public void setPlatina(boolean platina) {
        this.platina = platina;
        if(platina){
            setGold(false);
        }
    }

    public float getValorCompras() {
        return valorCompras;
    }

    public void setValorCompras(float valorDaCompra) {
        this.valorCompras += valorDaCompra;
    }

    @Override
    public String getInfo() {
        String txt = "";       
        txt += "=====================================================================\n" +
                "Informações Cliente: \n" +
                "Nome: " + super.getNome() +"\n"+
                "Telefone: " + super.getTelefone() +"\n"+
                "Endereço: " + super.getEnderecoCompleto()+"\n"+
                "Gold: " + isGold()+"\n"+
                "Platina: " + isPlatina()+"\n"+
                "=====================================================================\n";
        return txt;    
    
    }
    
    
}
