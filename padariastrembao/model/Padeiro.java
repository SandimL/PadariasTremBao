/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padariastrembao.model;

/**
 *
 * @author Lucas
 */
public final class Padeiro extends Funcionario{
    
    protected int hrsTrabalhadas;
    
    public Padeiro(String nome, String documento, String endereco, String telefone, float salario, int hrsTrabalhadas) {
        super(nome, documento, endereco, telefone, salario);
        this.hrsTrabalhadas = hrsTrabalhadas;
    }
    
}
