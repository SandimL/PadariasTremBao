/*
 * 
 * 
 */
package padaria.controller;

import padaria.model.Banco;
import padaria.model.Padeiro;
import padaria.view.Login;
import padaria.view.PadeiroView;

/**
 *
 * 
 */
public class LoginController {
    private final Login view;
    
    public LoginController(Login view){
        this.view = view;
    }
    
    public void checkLogin(){
        boolean encontrou = false;
        Padeiro usuario = new Padeiro(view.getTxt_login().getText(), new String(view.getTxt_senha().getPassword()));
        Padeiro[] padeiro = new Padeiro[5];
        padeiro = Banco.getPadeiro();
        for(int i=0; i<padeiro.length&&!encontrou; i++){
            if(padeiro[i]!=null){
                if(padeiro[i].equals(usuario)){
                    encontrou = true;
                    if(padeiro[i].getSenha().equals(usuario.getSenha())){
                        view.exibirMessagem("Seja bem vindo");
                        //Chama Tela Padeiro passando o usuário;
                        PadeiroView padeiroView = new PadeiroView(padeiro[i].getDocumento());
                        padeiroView.setVisible(true);
                        view.dispose();
                    }else{
                        view.exibirMessagem("Senha incorreta");
                    }
                }
            }
        }
        if(!encontrou){
            view.exibirMessagem("Usuário não encontrado");
        }
        
    }
   
}
