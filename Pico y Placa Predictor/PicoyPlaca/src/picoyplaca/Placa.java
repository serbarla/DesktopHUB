/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

/**
 *
 * @author serbarla
 */
public class Placa {
    
    private String numero = "";
    private char ult;
    
    public Placa(){
        numero = "000000";
    }
    public Placa(String str){
        
            this.numero = str;
            ult = numero.charAt(numero.length() - 1);
                    
    }
    public String getPlaca(){
        return numero;
    }
     public char pico(){
        return ult;
                
    }
}
