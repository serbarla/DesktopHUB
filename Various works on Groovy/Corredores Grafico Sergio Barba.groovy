import groovy.swing.SwingBuilder
import java.awt.Color
import java.awt.BorderLayout as BL
import javax.swing.WindowConstants as WC
import javax.swing.BorderFactory as BF
import javax.swing.JOptionPane

swing = new SwingBuilder()

correr = swing.action(
                       name: 'Empezar carrera',
                       closure: this.&iniciarCorrer,
                       mnemonic: 'E',
                       accelerator: 'ctrl E'
)

salir = swing.action(
                       name: 'Salir',
                       closure: this.&sal,
                       mnemonic: 'S',
                       accelerator: 'ctrl S'
)

borrar = swing.action(
                       name: 'Borrar',
                       closure: this.&borra,
                       mnemonic: 'B',
                       accelerator: 'ctrl B'
)

acerca= swing.action(
                       name: 'Acerca de',
                       closure: this.&acercaDe,
                       mnemonic: 'H',
                       accelerator: 'ctrl A'
)

frame = swing.frame(title:'Simulacion de Carrera', location:[100,100], size:[300,300]) {

     menuBar(){ // menubar
         menu(mnemonic: 'A', 'Archivo'){// cerrado
                        menuItem(action:correr)
                        menuItem(action:borrar)
                        menuItem(action:salir)
         }// menu
         hglue()
         menu(mnemonic: 'Y', 'Ayuda'){
                         menuItem(action:acerca)
         }

   }// menu bar

  panel (border:BF.createEmptyBorder(6,6,6,6)) {
    borderLayout()
    vbox (constraints: BL.NORTH){
       
         hstrut(width:10)
         label 'Corredor 1:' + ' '* 45 + 'Meta'
         label ( id: 'cor1', text: '1:' )
         label 'Corredor 2:' + ' '* 45 + 'Meta'
         label ( id:'cor2', text: '2:' )
        }
    hbox ( constraints: BL.CENTER ){
      button (id:'iniciar', action: correr)  
      button (id:'borro', action: borrar)
        }
   
    vbox (constraints: BL.SOUTH){
      label (id:'res')
      vglue()
      label (id:'res2')
        }
  }
}
frame.show()


def obstaculo (probabilidad) {
    probabilidad.nextInt()
}// obstaculo

void borra(event){
    swing.cor1.text = '1:'
    swing.cor2.text = '2:'
    swing.res.text = ''
    swing.res2.text = ''
}

void iniciarCorrer(event){ 

def obs = new Random()
def obs2 = new Random()
def obspas1 = 0
def obspas2 = 0
def primero= false

def corredor1 = Thread.start{

 for (i in 0..10){
    if(obstaculo(obs)%3==0){
        obspas1++
        swing.cor1.text += " X$obspas1 "
        sleep 3000
    }// if
    else{
        swing.cor1.text += " -> "
        sleep 500
    } // else
    
      if ( i == 10 && primero == false ){
      primero = true
      swing.res.text = "El Corredor 1 es Primero tras $obspas1 obtaculos."
        }
      else
        if ( i == 10 && primero == true )
        swing.res2.text = "El Corredor 1 es Segundo tras $obspas1 obtaculos."
      
  sleep 1000
  } // for
} // corredor 1

def corredor2 = Thread.start{

 for(j in  0..10){
    if(obstaculo(obs2)%3==0){
        obspas2++
        swing.cor2.text += " X$obspas2 "
        sleep 3000
    }// if
    else{
        swing.cor2.text += " -> "
        sleep 500
    }// else
    
    if ( j == 10 && primero == false ){
    primero = true
    swing.res.text = "El Corredor 2 es Primero tras $obspas2 obtaculos."
      }
    else
      if ( j == 10 && primero == true )
      swing.res2.text = "El Corredor 2 es Segundo tras $obspas2 obtaculos."
    
 sleep 1000
 } // for
}// corredor2

}// closure 

   void sal(event){
        System.exit(0)
   }
   
      void acercaDe(event){
     JOptionPane.showMessageDialog(frame,
     '''Proyecto Simulador Caminadores Grafico 
        Por: Sergio Barba
        Producciones ¡HAY CARAMBA! 2012
        Cada "->" Significa que Avanza el corredor
        Cada "X" Significa obstaculo unido a su posicion
        ''')

   }