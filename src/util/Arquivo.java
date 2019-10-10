/*
 * 
 * 
 * 
 */
package PadariaTremBao.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 *
 */
public class Arquivo {
    private final static String caminho = "base.json";
    public static String read(){
        String conteudo = "";
        try{
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            }catch (IOException ex){
                conteudo = "Erro";
            }
        }catch (FileNotFoundException ex){
            conteudo = "Erro";
        }
        if(conteudo.contains("Erro"))
            return "";
        else{
            return conteudo;
        }
    }
    
    public static boolean write (String texto){
        try{
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.print(texto);
            gravarArq.close();
            return true;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
