/*
 * 
 * 
 * 
 */
package padaria.model;

import padaria.json.JSONArray;
import padaria.json.JSONObject;
import padaria.util.Arquivo;

/**
 * Classe Padeiro que extende a classe Funcionario por meio de Herança
 * É uma classe final, ou seja, não será extendida por nenhum outra classe
 * Possui o atributo adicional Horas Trabalhadas, o qual é privado a classe
 */
public final class Padeiro extends Funcionario{
     private int horasTrabalhadas;//Atributos de Horas trabalhadas na madrugada

     //Construtor da classe Padeiro atribuindo todos os valores aos atributos
    public Padeiro(String nome, String telefone, String documento, 
            String rua, String numero, String bairro, 
            String cidade, String estado, String senha) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 
                1100f, senha);
        this.horasTrabalhadas = 0;
    }

    //Construtor da classe Padeiro que atribui valores de um objeto Json aos atributos
    public Padeiro(JSONObject json){
        super (json.getString("nome"),
                json.getString("telefone"), json.getString("documento"), 
                json.getString("rua"), json.getString("numero"), 
                json.getString("bairro"), json.getString("cidade"),
                json.getString("estado"), Float.parseFloat(json.getString("salario")), 
                json.getString("senha"));
        this.horasTrabalhadas = Integer.parseInt(json.getString("horasTrabalhadas"));
    }
    
    //Construtor da classe Padeiro que atribui somente valores aos atributos Documento e Senha
    public Padeiro(String documento, String senha) {
        super(documento, senha);
    }

    //Construtor da classe Padeiro vazio
    public Padeiro() {
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
        
        return json;
    }

    //Métodos GETTERS e SETTERS dos atibutos
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }
 }
