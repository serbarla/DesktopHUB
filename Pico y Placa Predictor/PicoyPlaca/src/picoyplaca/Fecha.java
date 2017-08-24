/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;
import java.text.ParseException;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author serbarla
 */
public class Fecha {
    
    private Locale loc = Locale.getDefault();
    Date dia;
    String hoy;
    String fecha;
    
    public Fecha(){
        dia = new Date();
         
    }
    
    public Fecha(String fe) throws ParseException{
        SimpleDateFormat entrada = new SimpleDateFormat("dd/MM/yyyy",loc);
        dia = entrada.parse(fe);
        SimpleDateFormat salida = new SimpleDateFormat("dd/MMM/yyyy", loc);
        this.fecha = salida.format(dia);
    }
    
    public String getDia(){
        SimpleDateFormat salida = new SimpleDateFormat("EEEE", loc);
        hoy = salida.format(dia);
        return hoy;
    }
    
    public String getFecha(){
        return ""+fecha;
    }
    
    public boolean circula(String com){
        SimpleDateFormat salida = new SimpleDateFormat("EEEE", loc);
        hoy = salida.format(dia);
        if(com.equals(hoy)){
            return true;
        }else{
            return false;
        }
        
    }
}
