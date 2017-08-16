//Sergio Barba


// Importamos el builder de swing para tener sus clases, el componente de color, el componente de java AWT para el layout de border, window constants para acabar el programa al cerrarlo, 
//border factory para determinar el espacio de trabajo en el frame y option pane para widgets
import groovy.swing.SwingBuilder
import java.awt.Color 
import java.awt.BorderLayout       as BL   
import javax.swing.WindowConstants as WC   
import javax.swing.BorderFactory   as BF   
import javax.swing.JOptionPane

// Se crea el contructor groovy para swing
swing = new SwingBuilder()

//Action performed de los botones paint y about dandoles los accesos a los botones y el closure apuntado para este action performed
paint = swing.action(
    name:        'Paint', 
    closure:     this.&paintGraph,   
    mnemonic:    'P',
    accelerator: 'ctrl P'
)
about = swing.action(
    name:        'About', 
    closure:     this.&showAbout,
    mnemonic:    'A',
    accelerator: 'F1'
)
// Declarando el frame principal, con titulo, ubicacion y tamaño junto a la finalizacion del proceso al cerrar el programa
frame = swing.frame(title:'Plotter', 
    location:[100,100], size:[300,300],   
    defaultCloseOperation:WC.EXIT_ON_CLOSE) {
    
//Se crea una barra de menu y se le agregan su mnemonico el menu item paint y en el widget glue el item about 
    menuBar (){
        menu(mnemonic:'A','Action'){
            menuItem(action:paint)
        }
        glue()   
        menu(mnemonic:'H','Help'){   
            menuItem(action:about)
        }
    }    
    
// Se crea un panel para contener un border layout y se crea un contenedor vbox que sea delimitado en el norte del layout, dentro del cual estan: 
// hbox un contenedor horizontal con un contenedor horizontal hstrut en el cual se colocan un label un textfield y un boton con sus nombres y action performed
    panel (border:BF.createEmptyBorder(6,6,6,6)) {
        borderLayout()
        vbox (constraints: BL.NORTH){
        
hbox {                     
                hstrut(width:10)
                label 'f(x) = '
                textField(id:'function',action:paint,'Math.sin(x)')
                button(action:paint)
            }
        }      
        
        // se crea contenedor vertical vbox en el occidente donde se coloca un seleccionador de tipo spinner con valor de 1 luego se pegan 20 espacios verticales y otro spinner con -1        
        vbox (constraints: BL.WEST){
            labeledSpinner('max',1d)   
            20.times { swing.vglue()}      // todo: check 'swing'
            labeledSpinner('min',-1d) 
        }      
        // se crea un contenedor vertical vbox limitado en el centro del layout donde en el borde del panel se coloca la etiqueta del titulo y en el centro el panel de tipo canvas para pintar
        vbox(constraints: BL.CENTER, 
            border:BF.createTitledBorder('Function Plot')) {
            panel(id:'canvas')
        }      
        // contenedor horizontal hbox en el sur del layout con otro contenedor horizontal hstrut con un spinner de dobles con label from que empieza en cero se pegan 10 espacios horizontales y otro 
        // spinner de label to que empieza en el doble 6.3
              
        hbox (constraints: BL.SOUTH){        
            hstrut(width:10)
            labeledSpinner('from',0d) 
            10.times { swing.hglue()}   
// todo: check 'swing' 
            labeledSpinner('to',6.3d)
        }       
    }
}
// Muestra el frame 
frame.show()
// implementation methods 
def labeledSpinner(label, value){   
    swing.label(label)
    swing.hstrut()
    swing.spinner(id:label, stateChanged:this.&paintGraph,
        model:swing.spinnerNumberModel(value:value)
    ) 
}
def paintGraph(event) {   
    def funcion= swing.function.text.tokenize()
    println funcion
    def retorno= funcion.split(43).toList()
    calc = new Dynamo(swing.function.text)    
    gfx  = swing.canvas.graphics
    int width  = swing.canvas.size.width
    int height = swing.canvas.size.height
    gfx.color  = new Color(255, 255, 150)
    gfx.fillRect(0, 0, width, height)
    gfx.color  = Color.blue
    xFactor    = (swing.to.value - swing.from.value) / width
    yFactor    = height / (swing.max.value - swing.min.value)
    int ceiling = height + swing.min.value * yFactor
    int lastY   = calc.f(swing.from.value) * yFactor
    for (x in (1..width)) {                           
        int y = calc.f(swing.from.value + x * xFactor) * yFactor
        gfx.drawLine(x-1, ceiling-lastY, x, ceiling-y)
lastY = y
    }
} 
void showAbout(event) {   
    JOptionPane.showMessageDialog(frame, 
'''A Function Plotter
that serves as a SwingBuilder example for
Groovy in Action''')
}
// Keep all dynamic invocation handling in one place.
class Dynamo {                              
    static final GroovyShell SHELL = new GroovyShell()
    Script functionScript
    Dynamo(String function){
        functionScript = SHELL.parse(function)   
    }
    Object f(x) {
        functionScript.x = x
        return functionScript.run()   
    }
}