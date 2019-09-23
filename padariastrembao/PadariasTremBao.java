


package padariastrembao;

import padariastrembao.model.*;

import java.io.FileWriter;
import java.io.IOException;

import org.json.*;

public class PadariasTremBao {

    public static void main(String[] args) throws JSONException {
        Gerente fun = new Gerente("sdasda", "asdasdasd", "4423423", "1231231242", (float)123123.94);
        Padeiro pad = new Padeiro("fulanu", "09123091230192839", "rua tal da tal", "128318723123", 123123, 234);

        
        JSONObject jsonObject = new JSONObject();
                 
        FileWriter writeFile = null;
         
        //Armazena dados em um Objeto JSON
        jsonObject.put("nome", "Allan");
        jsonObject.put("sobrenome", "Romanato");
        jsonObject.put("pais", "Brasil");
        jsonObject.put("estado", "SP");
         
        try{
            writeFile = new FileWriter("./dataBase/estrangero.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toString());
            writeFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
         
        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }
    
}
