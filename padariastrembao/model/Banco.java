/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria.model;

import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public class Banco {
    private final static ArrayList<Padeiro>padeiros = new ArrayList<>();
    private final static ArrayList<Cliente>clientes = new ArrayList<>();
    private final static ArrayList<Vendedor>vendedores = new ArrayList<>();
    private final static ArrayList<Gerente>gerentes = new ArrayList<>();
    
    
    
    
    static{
        Padeiro p1= new Padeiro("Paulo", "(11)11111-1111", "111.111.111-11", "Tal", "111", "Tal", "Tal", "Tal", "123");
        Padeiro p2= new Padeiro("João", "(22)22222-2222", "222.222.222-22", "Tel", "222", "Tel", "Tel", "Tel", "123");
        padeiros.add(p1);
        padeiros.add(p2);
        Vendedor v1 = new Vendedor("Pedro", "(33)33333-3333", "333.333.333-33", "Til", "333", "Til", "Til", "Til", "123", 0);
        Vendedor v2 = new Vendedor("Carlos", "(44)44444-4444", "444.444.444-44", "Tol", "444", "Tol", "Tol", "Tol", "123", 0);
        vendedores.add(v1);
        vendedores.add(v2);
        Gerente g1 = new Gerente("Luciano", "(55)55555-5555", "555.555.555-55", "Tul", "555", "Tul", "Tul", "Tul", "123", false);
        gerentes.add(g1);
        
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
}
