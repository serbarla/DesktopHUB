//Realizar un programa con  muchas iteraciones, despues compilar con groovyc y comparar el class en java con groovy //en el capitulo 4 como ejecutar un punto class desde groovy para java
def antes= System.currentTimeMillis()
def archivo(){
1048576.times{
it*1
}
}

archivo()

def despues= System.currentTimeMillis()

def tiempo=(despues-antes)/1000
println "Groovy tardo ${tiempo} segundos en ejecutarse"

Prueba a= makePrueba(){
a= new Prueba()
}

/**def antes2= System.currentTimeMillis()

run(new File("C:/Users/PANCHITO/Desktop/prueba.class"))

def despues2= System.currentTimeMillis()

def tiempo2=(despues2-antes2)/1000
println "Java tardo ${tiempo2} segundos en ejecutarse"**/