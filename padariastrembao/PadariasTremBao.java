


package padariastrembao;

import padariastrembao.model.*;
 

public class PadariasTremBao {

    public static void main(String[] args) {
        Gerente fun = new Gerente("sdasda", "asdasdasd", "4423423", "1231231242", (float)123123.94);
        System.out.println(fun.getTelefone());
        Padeiro pad = new Padeiro("fulanu", "09123091230192839", "rua tal da tal", "128318723123", 123123, 234);
        System.out.println("padeiro: "+ pad.getDocumento());
        System.out.println("padeiro: "+ pad.getEndereco());
        System.out.println("padeiro: "+ pad.getNome());
        System.out.println("padeiro: "+ pad.getTelefone());
    }
    
}
