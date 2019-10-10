/*
 * 
 * 
 * 
 */
package PadariaTremBao.model;
/**
 *Classe Gerente que extende a classe Funcionario por meio de Herança
 * É uma classe final, ou seja, não será extendida por nenhum outra classe
 * Possui o atributo adicional Vendas Realizadas, o qual é privado a classe
 */
public final class Gerente extends Funcionario{
    //Atributos
    private boolean confianca;

    //Construtor da classe atribuindo todos os valores aos atributos
    public Gerente(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, boolean confianca){
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 2500f, senha);
        this.confianca = confianca;
    }

    //GETTERS e SETTERS dos atributos
    public boolean isConfianca() {
        return confianca;
    }

    public void setConfianca(boolean confianca) {
        this.confianca = confianca;
    }
    
    //Método retorna informações do Gerente
    @Override
    public String getInfo(){
        String txt = super.getInfo();
        if(this.isConfianca()){
            txt+= "Gerente é de confiança\n";
        }
        return txt;
    }
}
