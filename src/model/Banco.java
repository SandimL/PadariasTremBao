/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public class Banco {
    private final static ArrayList<Padeiro> padeiros = new ArrayList<>();
    private final static ArrayList<Cliente> clientes = new ArrayList<>();
    private final static ArrayList<Vendedor> vendedores = new ArrayList<>();
    private final static ArrayList<Gerente> gerentes = new ArrayList<>();
    private final static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    private static final Estoque estoque;
    
    
    
    
    static{
        //Adicionando Padeiros ao banco;
        Padeiro p1= new Padeiro("Paulo", "(11)11111-1111", "111.111.111-11", "Tal", "111", "Tal", "Tal", "Tal", "123");
        Padeiro p2= new Padeiro("João", "(22)22222-2222", "222.222.222-22", "Tel", "222", "Tel", "Tel", "Tel", "123");
        padeiros.add(p1);
        padeiros.add(p2);
        
        //Adicionando Vendedores ao banco;
        Vendedor v1 = new Vendedor("Pedro", "(33)33333-3333", "333.333.333-33", "Til", "333", "Til", "Til", "Til", "123", 0);
        Vendedor v2 = new Vendedor("Carlos", "(44)44444-4444", "444.444.444-44", "Tol", "444", "Tol", "Tol", "Tol", "123", 0);
        vendedores.add(v1);
        vendedores.add(v2);
        
        //Adiconando Gerentes ao banco;
        Gerente g1 = new Gerente("Luciano", "(55)55555-5555", "555.555.555-55", "Tul", "555", "Tul", "Tul", "Tul", "123", 10000);
        gerentes.add(g1);
        
        //Adicionando Fornecedores ao banco
        Fornecedor f1 = new Fornecedor("Primeiro fornecedor", "(66)66666-6666", "66.666.666/6666-66", "Tão", "666", "Tão", "Tão", "Tão");
        Fornecedor f2 = new Fornecedor("Segundo fornecedor", "(77)77777-7777", "77.777.777/7777-77", "Sei não", "777", "Sei não", "Sei não", "Sei não");
        Fornecedor f3 = new Fornecedor("Terceiro fornecedor", "(88)88888-8888", "88.888.888/8888-88", "Sei la", "888", "Sei la", "Sei la", "Sei la");
        Fornecedor f4 = new Fornecedor("Quarto fornecedor", "(99)66666-6666", "99.999.999/9999-99", "Tão", "999", "Tanto faz", "Tanto faz", "Tanto faz");
        Fornecedor f5 = new Fornecedor("Quinto fornecedor", "(00)00000-0000", "00.000.000/0000-00", "Tão", "666", "Desconhecido", "Desconhecido", "Desconhecido");
        fornecedores.add(f1);
        fornecedores.add(f2);
        fornecedores.add(f3);
        fornecedores.add(f4);
        fornecedores.add(f5);
        
        estoque = new Estoque(50);
        Produto pro = new Produto("Pão", 2, fornecedores.get(0), 1.5f, true, "Cacetinho", 15);
        System.out.println(estoque.addProduto(pro));
        String r = estoque.addProduto(new Produto("", 2, fornecedores.get(1), 7.80f, false, "", 14));
        r = estoque.addProduto(new Produto("Requeijão", 3, fornecedores.get(2), 4.99f, true, "", 20));
        r = estoque.addProduto(new Produto("", 4, fornecedores.get(3), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("", 5, fornecedores.get(4), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 6, fornecedores.get(0), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 7, fornecedores.get(1), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 8, fornecedores.get(2), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 9, fornecedores.get(3), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 10, fornecedores.get(4), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 11, fornecedores.get(0), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 12, fornecedores.get(1), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 13, fornecedores.get(2), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 14, fornecedores.get(3), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 15, fornecedores.get(4), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 16, fornecedores.get(0), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 17, fornecedores.get(1), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 18, fornecedores.get(2), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 19, fornecedores.get(3), 1.5f, true, "Cacetinho", 15));
        r = estoque.addProduto(new Produto("Pão", 20, fornecedores.get(4), 1.5f, true, "Cacetinho", 15));
        
        //Adicionando Clientes ao banco
        clientes.add(new Cliente("Marcelo Vaz", "(45)44478-8788", "004.004.004-04", "Dina", "Numero", "Bairro", "Cidade", "Estaod"));
        clientes.add(new Cliente("Simone Sabao", "(45)44478-8788", "004.004.004-04", "Dina", "Numero", "Bairro", "Cidade", "Estaod"));
    }

    //Métodos CRUD para Padeiros
    public static Padeiro procuraPadeiro(String documento){
        boolean encontrou = false;
        Padeiro usuario = null;
        for(int i=0; i<padeiros.size()&&!encontrou; i++){
            if(padeiros.get(i)!=null){
                if(padeiros.get(i).getDocumento().equals(documento)){
                    usuario = padeiros.get(i);
                    encontrou = true;
                }
            }
        }
        if(!encontrou){usuario = null;}
       return usuario;
    }
    
    public static Padeiro procuraPadeiro(Padeiro usuario){
        boolean encontrou = false;
        for(int i=0; i<padeiros.size()&&!encontrou; i++){
            if(padeiros.get(i)!=null){
                if(padeiros.get(i).equals(usuario)){
                    usuario = padeiros.get(i);
                    encontrou = true;
                }
            }
        }
        if(!encontrou){usuario = null;}
       return usuario;
    }
    public static boolean excluirPadeiro(String documento){
        return true;
    }
    
    public static void editaPadeiro(String documento){
        
    }
    public static void editaPadeiro(Padeiro padeiro){
        boolean encontrou = false;
        for(int i=0; i<padeiros.size()&&!encontrou; i++){
            if(padeiros.get(i)!=null){
                if(padeiros.get(i).equals(padeiro)){
                    padeiros.set(i, padeiro);
                    encontrou = true;
                }
            }
        }
    }
    
    //Métodos CRUD para Vendedores
    public static Vendedor procuraVendedor(String documento){
        boolean encontrou = false;
        Vendedor usuario = null;
        for(int i=0; i<vendedores.size()&&!encontrou; i++){
            if(vendedores.get(i)!=null){
                if(vendedores.get(i).getDocumento().equals(documento)){
                    usuario = vendedores.get(i);
                    encontrou = true;
                }
            }
        }
        if(!encontrou){usuario = null;}
       return usuario;
    }
    
    public static Vendedor procuraVendedor(Vendedor usuario){
        boolean encontrou = false;
        for(int i=0; i<vendedores.size()&&!encontrou; i++){
            if(vendedores.get(i)!=null){
                if(vendedores.get(i).equals(usuario)){
                    usuario = vendedores.get(i);
                    encontrou = true;
                }
            }
        }
        if(!encontrou){usuario = null;}
       return usuario;
    }
    
    public static void editaVendedor(Vendedor vendedor){
        boolean encontrou = false;
        for(int i=0; i<vendedores.size()&&!encontrou; i++){
            if(vendedores.get(i)!=null){
                if(vendedores.get(i).equals(vendedor)){
                    vendedores.set(i, vendedor);
                    encontrou = true;
                }
            }
        }
    }
    
    
    //Métodos CRUD para Gerentes
    public static Gerente procuraGerente(String documento){
        boolean encontrou = false;
        Gerente usuario = null;
        for(int i=0; i<gerentes.size()&&!encontrou; i++){
            if(gerentes.get(i)!=null){
                if(gerentes.get(i).getDocumento().equals(documento)){
                    usuario = gerentes.get(i);
                    encontrou = true;
                }
            }
        }
        if(!encontrou){usuario = null;}
       return usuario;
    }
    
    //Métodos CRUD para Estoque
    public static Estoque getEstoque(){
        return estoque;
    }
    
    //Métodos CRUD para Cliente
    public static ArrayList<Cliente> getClientes(){
        return clientes;
    }
}
