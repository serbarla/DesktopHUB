/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;
import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author serbarla
 */
public class PicoyPlaca {
    
    public static Fecha fecha;
    public static Placa placa;
    public static Hora hora;
    public static String [] auto = new String[3];

    
    public static void circular(String carro) throws ParseException{
        auto = carro.split("\\s+");
        placa = new Placa(""+auto[0]);
        fecha = new Fecha(""+auto[1]);
        hora = new Hora(""+auto[2]);
        String circula="";
        Map<Integer, String> placaDia = new HashMap<Integer, String>();
        placaDia.put(0, "viernes");
        placaDia.put(1, "lunes");
        placaDia.put(2, "lunes");
        placaDia.put(3, "martes");
        placaDia.put(4, "martes");
        placaDia.put(5, "miércoles");
        placaDia.put(6, "miércoles");
        placaDia.put(7, "jueves");
        placaDia.put(8, "jueves");
        placaDia.put(9, "viernes");
        

        if(fecha.circula(placaDia.get(Character.getNumericValue(placa.pico())))&&hora.restriccion(auto[2])){
            System.out.println("No Puede Circular");
        }else{
            System.out.println("Si Puede Circular");
        }
          
    }
             
            
    public static void main(String[] args) throws IOException, ParseException {
        String carrito = "";
        BufferedReader escr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese su numero de placa seguido de la fecha en formato dd/mm/aaaa y la hora en formato 24 horas separada con dos puntos: ");
        
          try{
              carrito = escr.readLine();
              
              circular(carrito);
              System.out.println("Su vehiculo con placas: " + placa.getPlaca()+" , ultimo digito "+placa.pico()+" el dia "+fecha.getDia()+" "+fecha.getFecha()+" a las "+hora.getHora()+" horas y "+hora.getMinuto()+" minutos.");
                                                             
         }catch(NumberFormatException error){
            System.err.println("Intentelo denuevo");
        }
       
        
    }
}
