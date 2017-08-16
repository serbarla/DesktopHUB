s = new Socket("localhost", 4444);
s.withStreams { input, output ->
  output << "conectado con cliente ...\n"
  buffer = input.newReader().readLine()
  println "Servidor dice: $buffer"
  println "Clase del mensaje: ${buffer.getClass()}"
}