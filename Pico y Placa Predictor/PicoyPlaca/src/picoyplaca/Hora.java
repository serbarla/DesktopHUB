/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author serbarla
 */
public class Hora {
    
    private String tiempo = "";
    private int hora = 0;
    private int minuto = 0;
    private String[] divi = new String[2];
    private String[] comp = new String[2];
    
    public Hora(){
    
        this.tiempo = "00:00";
    }
    
    public Hora(String bus){
       
           divi = bus.split(":");
           hora = Integer.valueOf(divi[0]);
           minuto = Integer.valueOf(divi[1]);
           this.tiempo = bus;           
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public boolean restriccion(String valor) {
    boolean enmedio = false;
    try {
        Date inicio1 = new SimpleDateFormat("HH:mm").parse("06:59");
        Date acaba1 = new SimpleDateFormat("HH:mm").parse("09:31");
        Date inicio2 = new SimpleDateFormat("HH:mm").parse("15:59");
        Date acaba2 = new SimpleDateFormat("HH:mm").parse("19:31");

        Date dia = new SimpleDateFormat("HH:mm").parse(valor);

        if (acaba1.after(dia) && inicio1.before(dia)||acaba2.after(dia) && inicio2.before(dia)) {
            enmedio = true;
        }
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return enmedio;
}
    
}
