/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.model;
/**
 *
 * @author Paulo
 */
public class Banco {
    private final static Padeiro[] padeiro;
    private final static Cliente[] cliente;
    private final static Vendedor[] vendedor;
    
    static {
        padeiro = new Padeiro[5];
        cliente = new Cliente[5];
        vendedor = new Vendedor[5];
        
        //Padeiros
        padeiro[0] = new Padeiro("Paulo", "111", "111.111.111-11", "Tal", "111", "Tal", "Tal", "Tal", "123");
        padeiro[1] = new Padeiro("João", "222", "222.222.222-22", "Tel", "222", "Tel", "Tel", "Tel", "123");
        
        //Vendedores
        vendedor[0] = new Vendedor("Pedor", "333", "333.333.333-33", "Til", "333", "Til", "Til", "Til", "123", 0);
        vendedor[1] = new Vendedor("Carlos", "444", "444.444.444-44", "Tol", "444", "Tol", "Tol", "Tol", "123", 0);
    }
    
    public static Padeiro[] getPadeiro(){
        return padeiro;
    }
}
