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
    
    //Método que tenta salvar um Padeiro na base de dados através da Classe Arquivo
    //Retorna a descrição da tentativa
    //
    /**
    public String setPadeiro(){
        String situacao = "";
        JSONObject json = this.toJson();//Cria um objeto Json
        boolean contratado = false;//Cria uma variavel que retorno falso ou verdadeiro
        String base = Arquivo.read();//Le toda a base de dados salva
        JSONArray jA = new JSONArray();//Cria um Array de objetos Json
        if(!base.isEmpty())/*Testa se a base não está vazia{
            jA = new JSONArray(base);//Atribui os dados da base ao Array de objetos Json
            situacao = "A base de dados está vazia";
        }
        for(int i=0; i<jA.length()&&!contratado;i++)/*Percorre todo o Array de Json{
            //Verifica se o objeto Json na posição i do Array tem o documento igual ao do Padeiro a ser contratado
            //Se for retorna messagem de que já é um funcionário
            if(jA.getJSONObject(i).get("documento").equals(documento)){
               situacao = jA.getJSONObject(i).getString("nome") + " já é um funcionário";
            }else/*Caso contrário salva no Array de Json{
               jA.put(json);
               contratado = true;
               situacao = "Padeiro contratado com sucesso";
            }
        }
        Arquivo.write(jA.toString());//Salva na base de dados
        return situacao;
    }
    
    //Método que pega todos os Padeiros salvos na base de 
    public static Padeiro[] getPadeiros(){
        Padeiro[] padeiro = new Padeiro[5];
        String base = Arquivo.read();
        if(!base.isEmpty()){
            JSONArray jA = new JSONArray(base);
            for(int i=0; i<jA.length();i++){
                Padeiro p = new Padeiro(jA.getJSONObject(i));
                padeiro[i] = p; 
            }
        }
        return padeiro;
    }
    **/
}
