/*
 * 
 * 
 * 
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 
 */
public class Validacao {
    
    public static String validarData(String data){
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        dataFormat.setLenient(false);
        try{
            Date date = dataFormat.parse(data);
            return "Data válida";
        }catch(ParseException ex){
            return "Data inválida";
        }
    }
    
    public static String validarHora(String hora){
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        horaFormat.setLenient(false);
        
        try{
            Date hour = horaFormat.parse(hora);
            return "Hora válida";
        }catch(ParseException ex){
            return "Hora inválida";
        }
    }
}
