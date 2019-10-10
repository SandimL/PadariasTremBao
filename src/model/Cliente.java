/*
 * Alunos do Grupo
 * Paulo Rogério Pereira Franco
 * Gustavo Coutinho
 *
 */
package PadariaTremBao.model;
/**
 * Classe Cliente que irá modelar todos os clientes da padaria extende Pessoa
 */
public class Cliente extends Pessoa{
    //Atributos da classe
    private boolean gold;
    private boolean platina;
    private float valorCompras;

    //Contrutor da Classe atribuindo todos os valores aos atributos
    public Cliente(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado);
        this.gold = false;
        this.platina = false;
        this.valorCompras = 0;
    }

    public Cliente(String nome, String telefone, String documento, String rua, String numero, String bairro, String cidade, String estado, boolean gold, boolean platina) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado);
        this.gold = gold;
        this.platina = platina;
    }
    
    //Construtor da Classe atribuindo somente documento aos atributos
    public Cliente(String documento) {
        super(documento);
    }

    //Contrustor da Classe vazio
    public Cliente() {
    }

    //GETTERS e SETTERS dos atributos
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
    
    //Método que retorna as informações do Cliente
    @Override
    public String getInfo(){
        String txt = super.getInfo();
        txt+= "Valor de compras realizadas: R$" + this.getValorCompras() + "\n";
        if(this.gold){
            txt+= "Cliente é Gold\n";
        }else if(this.platina){
            txt+= "Cliente é Platinum\n";
        }
        return txt;
    }
}
