def mapa=[a:"Alemania",b:"Bolivia",c:"Colombia"]

mapa.each{k,v-> println "la clave es ${k}, el valor ${v}"}

muestra(mapa)
def muestra (mp)
{
mapa.each{k,v-> println "Desde la funcion: ${k} es: ${v}"}
}



println mapa.getClass()
println mapa.keySet()
println mapa.values()
