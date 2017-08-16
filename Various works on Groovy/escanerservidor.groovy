import java.net.ServerSocket

def arreglo = "Mensaje desde la misma PC"

def server = new ServerSocket(4444)


while(true) {
    server.accept { socket ->
           println "Nueva conexión...\n"
                    socket.withStreams { input, output ->
                                  def reader = input.newReader()
                                  def buffer = reader.readLine()
                                  println "Cliente dice: $buffer \n"
                                  output << "$arreglo\n"
                     }
           println "Proceso terminado.\n"
    }
}