/*
 * 
 * 
 * 
 */
package model;

/**
 * Classe Padeiro que extende a classe Funcionario por meio de Herança
 * É uma classe final, ou seja, não será extendida por nenhum outra classe
 * Possui o atributo adicional Horas Trabalhadas, o qual é privado a classe
 */
public final class Padeiro extends Funcionario implements Relatorio{
     private int horasTrabalhadasMadrugada;
     
     //Construtor da classe Padeiro atribuindo todos os valores aos atributos
    public Padeiro(String nome, String telefone, String documento, 
            String rua, String numero, String bairro, 
            String cidade, String estado, String senha) {
        super(nome, telefone, documento, rua, numero, bairro, cidade, estado, 
                1100f, senha);
        this.horasTrabalhadas = 0;
        this.horasTrabalhadasMadrugada = 0;
    }

    //Construtor da classe Padeiro que atribui valores de um objeto Json aos atributos
    
    
    //Construtor da classe Padeiro que atribui somente valores aos atributos Documento e Senha
    public Padeiro(String documento, String senha) {
        super(documento, senha);
    }

    //Construtor da classe Padeiro vazio
    public Padeiro() {
    }
    
    //Método que cria um objeto Json, associa os valores e retorna o objeto
   

    //Métodos GETTERS e SETTERS dos atibutos

    public int getHorasTrabalhadasMadrugada() {
        return horasTrabalhadasMadrugada;
    }

    public void setHorasTrabalhadasMadrugada(int horasTrabalhadasMadrugada) {
        this.horasTrabalhadasMadrugada += horasTrabalhadasMadrugada;
    }

    @Override
    public String getInfo() {
        String txt = "";       
        txt += "=====================================================================\n" +
                "Informações Fornecedor: \n" +
                "Nome: " + super.getNome() +"\n"+
                "Telefone: " + super.getTelefone() +"\n"+
                "Endereço: " + super.getEnderecoCompleto()+"\n"+
                "Horas trabalhadas: " + getHorasTrabalhadas()+"\n"+
                "Horas trabalhadas Fora do expediente: " + getHorasTrabalhadasMadrugada()+"\n"+
                "=====================================================================\n";
        return txt;  
    }
    
    
 }
