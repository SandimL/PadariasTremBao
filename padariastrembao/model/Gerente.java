/*
 * 
 * 
 * 
 */
package padaria.model;

import padaria.json.JSONObject;

/**
 *
 *
 */
public class Gerente extends Funcionario{
    private boolean recorrente;

    public Gerente(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, boolean recorrente) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 2500f, senha);
        this.recorrente = recorrente;
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }
    
    public Gerente(JSONObject json){
        super (json.getString("nome"),
                json.getString("telefone"), json.getString("documento"), 
                json.getString("rua"), json.getString("numero"), 
                json.getString("bairro"), json.getString("cidade"),
                json.getString("estado"), Float.parseFloat(json.getString("salario")), 
                json.getString("senha"));
        this.recorrente = json.getBoolean("recorrente");
    }
    
    //Método que cria um objeto Json, associa os valores e retorna o objeto
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("nome", this.nome);
        json.put ("documento", this.documento);
        json.put ("telefone", this.telefone);
        json.put ("salario", this.salario);
        json.put ("rua", this.rua);
        json.put ("numero", this.numero);
        json.put ("bairro", this.bairro);
        json.put ("cidade", this.cidade);
        json.put ("estado", this.estado);
        json.put ("recorrente", this.recorrente);
        
        return json;
    }
}
