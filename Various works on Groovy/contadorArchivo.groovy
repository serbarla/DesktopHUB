def cuerpo= new File("C:/Users/PANCHITO/Desktop/Palabras.txt")
def palabras=[]

cuerpo.each{ 
palabras<<it.tokenize()
}

def pl1=palabras.flatten()
def frecuencia= [:]

pl1.each{palabra->
  frecuencia[palabra]=frecuencia.get(palabra,0)+1
}

println frecuencia.keySet().toList().sort()
println frecuencia.sort{ -it.value }