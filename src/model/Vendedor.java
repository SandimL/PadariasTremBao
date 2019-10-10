/*
 * 
 * 
 * 
 */
package PadariaTremBao.model;
/*Classe Vendedor que extende a classe Funcionario por meio de Herança
 * É uma classe final, ou seja, não será extendida por nenhum outra classe
 * Possui o atributo adicional Vendas Realizadas, o qual é privado a classe
 */
public final class Vendedor extends Funcionario{
    //Atributos
    private float vendasRealizadas;

    //Construtor da classe atribuindo todos os valores aos atributos
    public Vendedor(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, String senha, float vendasRealizadas) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 1300f, senha);
        this.vendasRealizadas = vendasRealizadas;
        this.horasTrabalhadas = 0;
    }

    //Contrutor da classe vazio
    public Vendedor() {
    }

    //GETTERS e SETTERS dos atributos
    public float getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(float vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }
    
    //Método retorna informações do Vendedor
    @Override
    public String getInfo(){
        String txt = super.getInfo();
        txt+= "Valor de vendas realizadas: R$" + this.getVendasRealizadas() + "\n";
        return txt;
    }
}
