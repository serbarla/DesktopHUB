def cuerpo= 
"""
Look for the bare necessities
The simple bare necessities
Forget about your worries and your strife
I mean the bare necessities
Old Mother Nature's recipes
That bring the bare necessities of life
"""
def palabras= cuerpo.tokenize()
def frecuencia= [:]

palabras.each{palabra->
  frecuencia[palabra]=frecuencia.get(palabra,0)+1
}

println frecuencia.keySet().toList().sort()
println frecuencia.sort{ -it.value }