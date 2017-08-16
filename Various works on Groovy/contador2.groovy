def txto =  "it is a beautiful day!"
def nuevo = txto.replaceAll(/\w+/,//Remplaza en todas las palabras la primera letra por mayusculas
        { it[0].toUpperCase() + ((it.size() > 1) ? it[1..-1] : '') })//y luego vuelve a concatenar la palabra
println nuevo
println tx1 = txto =~ (/\w+/)   // halla las palabras


def int contador = 0
tx1.find(){p ->  // Mientras encuentre un termino en tx1
    println p.class  // imprime la clase de p
    contador++
}
println "contador: primera corrida: " + contador

tx1.reset() // devuelve el apuntador de la posicion de tx1 de regreso a la posicion 0
contador = 0
while(tx1.find()) {  // Mientras encuentre un termino en tx1 es decir no nulo
    println tx1.group()  //Arma la palabra y la imprime
    contador++
}
println "En la segunda corrida el contador: " + contador // Cuenta cuantas veces encuentra un String considerado como palabra

println "total palabras en el texto \"${txto}\" es: ${tx1.count}"

assert "It Is A Beautiful Day!" ==
    ("it is a beautiful day!".replaceAll(/\w+/,
        { it[0].toUpperCase() + ((it.size() > 1) ? it[1..-1] : '') })) //Pregunta si todas las primeras letras de la palabra son Mauscula 
        
println "it is a beautiful day!".replaceAll(/\w+/, {it[0].toUpperCase() + ' resto de la palabra' + '\n'}) // Regresa las primeras letras de cada palabra en mayuscula mas "resto de la palabra"