//Integrantes: Josue Carranza Sergio Barba 
//solucion 1
tx = "At school, Harry had no one. Everybody knew that Dudley's gang hated that odd Harry Potter "+
     "in his baggy old clothes and broken glasses, and nobody \n"+"liked to disagree with Dudley's gang.";
matcher = (tx =~ /\s/);
excerpt = matcher.replaceAll("Tanya Grotter");//excerpt tiene a tx reemplazado todas las coincidencias con matcher reemplazadas por "Tanya Grotter" es decir reemplaza los espacios por ese string
matcher.each{println it+=1}
println matcher.text
println " hay un total de ${matcher.count + 1} palabras"
//-------------------Matcher = a todos los  espacios en blanco por lo tanto tiene el numero de espacios en blaco que es 1 menor a la cantidad de palabras

def m = tx =~ /\bh\w*\b/   // halla las palabras que inician con h minuscula, concatena toda la palabra si importar que sea

println m
//a lo java
while (m.find())//mietras encuentra  una ocurrencia del patron no sale del while
{
val = m.group();//concatena las cadenas que empiezan con h con el resto de si mismas
System.out.println("MATCH: " + val);
}
// a lo groovy:
m.find(){
   println "resultado: " + it
}

def txto =  "it is a beautiful day!"
def nuevo = txto.replaceAll(/\w+/,//Remplaza en todas las palabras la primera letra por mayusculas
        { it[0].toUpperCase() + ((it.size() > 1) ? it[1..-1] : '') })//y luego vuelve a concatenar la palabra
println nuevo
println tx1 = txto =~ (/\w+/)   // halla las palabras


def int contador = 0
tx1.find(){p ->
    println p.class  // no se imprimen todas las palabras use findAll
    contador++
}
println "contador: primera corrida: " + contador

tx1.reset()
contador = 0
while(tx1.find()) {
    println tx1.group()
    contador++
}
println "En la segunda corrida el contador: " + contador

println "total palabras en el texto \"${txto}\" es: ${tx1.count}"

assert "It Is A Beautiful Day!" ==
    ("it is a beautiful day!".replaceAll(/\w+/,
        { it[0].toUpperCase() + ((it.size() > 1) ? it[1..-1] : '') }))

println "it is a beautiful day!".replaceAll(/\w+/, {it[0].toUpperCase() + 'resto de la palabra' + '\n'})

def digitos = '1000129731973901'
println "se busca cada dígito en: ${digitos}"
def m1 = digitos =~ /\d/
while(m1.find()){
  println m1.group()
}
println "se busca cada dos dígitos en: ${digitos}"
//def m2 = digitos =~ /(\d\d)/    //funciona igual \d\d o \d{2}
//def m2 = digitos =~ /(\d{2})/     //funciona con y sin los paréntesis
def m2 = digitos =~ /\d{2}/     //funciona con y sin los paréntesis
while(m2.find()){
  println m2.group()
}

println "se busca cada cinco dígitos en: \"${digitos}\" ojo, se elimina el último 1"
def m3 = digitos =~ /\d{5}/
while(m3.find()){
  println m3.group()
}


def txto2 = "My name is Bond. James Bond. Bondadoso y Bonachón"
def m10 = txto2 =~ /Bond/
while(m10.find()){
  println m10.group()
}
println "número de veces que aparece la palabra 'Bond': ${m10.count}"

def m11 = txto2 =~ /B(ond)/
contador = 0
for(i in (0..m11.size()-1)) {
  for(j in (0..m11[0].size()-1)){
     println "Lo hallado por grupos, posición ${i},${j}: ${m11[i][j]}"
     contador++
  }
}
println "número de veces que aparece el patron 'B(ond)' es: ${contador} no \n"  +
        "es ${m11.count}, porque cuadra con 'Bond' grupo por defecto y 'ond' grupo señalado con los paréntesis"

def m12 = txto2 =~ /B(ond)/
println "el resultado de la busqueda queda en la matriz: ${m12.collect { it }}"
println "el resultado de la busqueda queda en la matriz aplanada: ${(m12.collect { it }).flatten()}"

def m13 = ["My name is Bond", "James Bond", "Bondadoso y Bonachón"].grep(~/B(ond).*/)
println "el resultado de grep: ${m13}"

def m14 = ["My name is Bond", "James Bond", "Bondadoso y Bonachón"].grep(~/.*B(ond).*/)
println "el resultado de grep: ${m14}"


def lineas = '''
una
dos
tres'''

def m15 = txto2 =~ /(?m)/
println "busqueda del inicio de una linea: ${m15.collect { it }}"

def m16 = txto2 =~ /(?m)^\w+/
println "Inicio de la linea, la primera palabra: ${m16.collect { it }}"

def m17 = lineas =~ /(?m)^\w+/
println "las primeras palabras: ${m17.collect { it }}"

def m18 = lineas =~ /(?m)[ut]\w+/
println "las primeras palabras: ${m18.collect { it }}"

def m19 = lineas =~ /(?m)^[ut]\w+/
println "las primeras palabras: ${m19.collect { it }}"

def m20 = lineas =~ /(?m)[^ut]\w+/
println "las primeras palabras: ${m20.collect { it }}"

def m21 = lineas =~ /(?m)^[^ut]\w+/
println "las primeras palabras: ${m21.collect { it }}"

def m22 = txto2 =~ /[B].*J/
println "el resultado de la busqueda queda en la matriz: ${m22.collect { it }}"

def m23 = txto2 =~ /[B].*d/
println "el resultado de la busqueda queda en la matriz: ${m23.collect { it }}"
