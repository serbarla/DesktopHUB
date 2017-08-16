import groovy.swing.SwingBuilder
import java.awt.Color 
import java.awt.BorderLayout       as BL   
import javax.swing.WindowConstants as WC   
import javax.swing.BorderFactory   as BF   
import javax.swing.JOptionPane
import java.net.ServerSocket

swing = new SwingBuilder()


enviar= swing.action(
                       name: 'Iniciar Servidor',
                       closure: this.&envia,
                       mnemonic: 'E',
                       accelerator: 'ctrl E'
)

cambiar= swing.action(
                       name: 'Enviar Mensaje',
                       closure: this.&cambio,
                       mnemonic: 'M',
                       accelerator: 'ctrl M'
)

salir= swing.action(
                       name: 'Salir',
                       closure: this.&sal,
                       mnemonic: 'S',
                       accelerator: 'ctrl S'
)

acerca= swing.action(
                       name: 'Acerca de',
                       closure: this.&acercaDe,
                       mnemonic: 'H',
                       accelerator: 'ctrl A'
)

borrar= swing.action(
                      name: 'Borrar',
                      closure:this.&borralo,
                      mnemonic: 'B',
                      accelerator: 'ctrl B'
)

frame= swing.frame(title: 'Servidor de RED', location:[50,100], size:[750,500], defaultCloseOperation:WC.EXIT_ON_CLOSE){

   menuBar(){
         menu(mnemonic: 'A', 'Archivo'){
                        menuItem(action:enviar)
                        menuItem(action:cambiar)
                        menuItem(action:borrar)
                        menuItem(action:salir)
         }
   glue()
         menu(mnemonic:'Y','Ayuda'){
                        menuItem(action:acerca)
         }
   }

   panel (border:BF.createEmptyBorder(10,10,10,10), background: Color.black) {
            borderLayout()
            
            textArea(id:"miArea", constraints: BL.CENTER, editable: false, background: Color.black, foreground: Color.green)
            
         
           hbox (constraints: BL.SOUTH){        
                button (id:'conversacion', action:enviar, background:Color.black)
                button (id:'conexion', action:cambiar, background:Color.black)
                textField (id: 'mensaje', text='Usuario1 Conectado', background: Color.green)
                hglue()
                button (action:borrar, background:Color.black)
                
           }
         
   }
}
frame.show()

   void borralo(event){
        swing.miArea.text=''
   }

   void sal(event){
        System.exit(0)
   }

   void acercaDe(event){
     JOptionPane.showMessageDialog(frame,
     '''Proyecto Conexion por Sockets 
        Por: Gabriel Moreta, Sergio Barba
        Producciones ¡HAY CARAMBA! 2012''')

   }
   
   void cambio(event){
     def mensajes= swing.mensaje.getText()
     s = new Socket("localhost", 4445);
     s.withStreams { input, output ->
               output << "${mensajes}\n"
               buffer = input.newReader().readLine()
               swing.miArea.text+="Tu: $mensajes \n"
               }
   
   }

   void envia(event){
   
                
                Thread.startDaemon{
                def now= new Date()
                def server = new ServerSocket(4444)
                def arreglo= swing.mensaje.getText()
                swing.miArea.text+= "Sesion iniciada: $now\nYa puedes empezar a chatear\n\n"
                  while(true) {
                         server.accept { socket ->
                         //swing.miArea.text+= "$now\n"
                         socket.withStreams { input, output ->
                                  def reader = input.newReader()
                                  def buffer = reader.readLine()
                                  swing.miArea.text+= "Usuario2 dice: $buffer \n"
                                  output << "$arreglo\n"
                                  }// with streams
                         //swing.miArea.text+="Proceso terminado.\n\n"
                    }//accept
           } //while
     } //demonio
} // envia