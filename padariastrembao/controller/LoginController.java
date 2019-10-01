/*
 * 
 * 
 */
package padaria.controller;

import java.util.ArrayList;
import padaria.model.Banco;
import padaria.model.Funcionario;
import padaria.model.Padeiro;
import padaria.model.Vendedor;
import padaria.view.LoginView;
import padaria.view.PadeiroView;
import padaria.view.VendedorView;

/**
 *
 * 
 */
public class LoginController {
    private final LoginView view;
    
    public LoginController(LoginView view){
        this.view = view;
    }
    
    public void checkLogin(){
        boolean encontrou = false;
        String login = view.getTxt_login().getText();
        String senha = new String(view.getTxt_senha().getPassword());
        if(Banco.procuraPadeiro(login)!=null){
            if(Banco.procuraPadeiro(login).getSenha().equals(senha)){
                view.exibirMessagem("Seja bem vindo!");
                PadeiroView padeiroView = new PadeiroView(Banco.procuraPadeiro(login));
                padeiroView.setVisible(true);
                view.dispose();
            }else{
                view.exibirMessagem("Senha incorreta");
            }
        }else if(Banco.procuraVendedor(login)!=null){
            if(Banco.procuraVendedor(login).getSenha().equals(senha)){
                view.exibirMessagem("Seja bem vindo!");
                VendedorView vendedorView = new VendedorView(Banco.procuraVendedor(login));
                vendedorView.setVisible(true);
                view.dispose();
            }else{
                view.exibirMessagem("Senha incorreta");
            }
        }       
        
    }
   
}
