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
public class Vendedor extends Funcionario{
    private float vendasRealizadas;

    public Vendedor(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, float vendasRealizadas) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 1300f, senha);
        this.vendasRealizadas = vendasRealizadas;
    }

    public Vendedor() {
    }

    public float getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(float vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }

    //Construtor da classe Padeiro que atribui valores de um objeto Json aos atributos
    public Vendedor(JSONObject json){
        super (json.getString("nome"),
                json.getString("telefone"), json.getString("documento"), 
                json.getString("rua"), json.getString("numero"), 
                json.getString("bairro"), json.getString("cidade"),
                json.getString("estado"), Float.parseFloat(json.getString("salario")), 
                json.getString("senha"));
        this.vendasRealizadas = Float.parseFloat(json.getString("vendasRealizadas"));
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
        json.put ("vendasRealizadas", this.vendasRealizadas);
        
        return json;
    }
}
