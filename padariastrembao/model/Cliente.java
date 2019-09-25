/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.model;

import padaria.json.JSONObject;

/**
 * @author Paulo
 */
public class Cliente extends Pessoa{
    
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
    
    //Construtor da classe Padeiro que atribui valores de um objeto Json aos atributos
    public Cliente(JSONObject json){
        super (json.getString("nome"),
                json.getString("telefone"), json.getString("documento"), 
                json.getString("rua"), json.getString("numero"), 
                json.getString("bairro"), json.getString("cidade"),
                json.getString("estado"));
        this.gold = json.getBoolean("gold");
        this.platina = json.getBoolean("platina");
        this.valorCompras = Float.parseFloat(json.getString("valorCompras"));
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("nome", this.nome);
        json.put ("documento", this.documento);
        json.put ("telefone", this.telefone);
        json.put ("rua", this.rua);
        json.put ("numero", this.numero);
        json.put ("bairro", this.bairro);
        json.put ("cidade", this.cidade);
        json.put ("estado", this.estado);
        json.put ("gold", this.gold);
        json.put ("platina", this.platina);
        json.put ("valorCompras", this.valorCompras);
        return json;
    }
}
