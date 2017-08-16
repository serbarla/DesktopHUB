import java.net.ServerSocket

def guardado = []
def server = new ServerSocket(4444)
def archivo = new File ("C:/Users/PANCHITO/Desktop/archivoserver.txt")
            
while(true) {
    server.accept { socket ->
        println "Nueva conexión..."
        socket.withStreams { input, output ->
        
            def reader = input.newReader()
            def buffer = reader.readLine()
            def band = 0
            
            if(guardado.size() == 0)
            {  
               guardado << buffer
               archivo.write("$buffer\n")
            }
                        
            else
            {
               for(i in 0..(guardado.size()))
               {
                  if(guardado[i] == buffer)
                  {
                     println "Elemento no ingresado"
                     buffer = "Ya existe un elemento de las mismas caracteristicas, ingrese otro"
                     output << "${buffer}"
                     band = 1                  
                     break
                  }                                    
               }
            }
            
            if(band == 0)
            {
               guardado << buffer
               archivo.append(buffer)
               println "Elemento ingresado: ${buffer}"
               output << "Dato Ingresado en el arreglo del servidor"
            }                  

        }
        println "Proceso terminado."
        
    }
}