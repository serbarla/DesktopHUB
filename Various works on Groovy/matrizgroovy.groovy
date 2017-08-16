def archivo= new File ("C:/Users/PANCHITO/Desktop/Resultado.txt")
def lista=[]
def orden=[]

archivo.splitEachLine('\n'){
lista<<it
}
lista=lista.flatten()
orden=lista[0].toList()
lista=lista.reverse()
lista.pop()


def fila = orden[0] as Integer
def column = orden[1] as Integer

int [][] O2x3 = new int [fila][column]
int [][] O22x3 = new int [fila][column]
int [][] O3x2 = new int [column][fila]

def k=0
int [][] retor= new int[fila][column]
   for (i in 0..(fila-1)){
      for (j in 0..(column-1)){
          retor[i][j]=lista[k++]
       }
    }




def imprimir(m){
    for (i in 0..(m.length-1)){
       print "\n"
       for (j in 0..(m[0].length-1)){
          print "[${m[i][j]}]"
       }
    }
}

def suma(m1,m2){
int [][] retor= new int[m1.length][m1[0].length]
   for (i in 0..(m1.length-1)){
      for (j in 0..m1[0].length-1){
          retor[i][j]=m1[i][j]+m2[i][j]
       }
    }
return retor
}

def resta(m1,m2){
int [][] retor= new int[m1.length][m1[0].length]
   for (i in 0..(m1.length-1)){
      for (j in 0..(m1[0].length-1)){
          retor[i][j]=m1[i][j]-m2[i][j]
       }
    }
    
return retor
}


def multi(m1,m4){

int [][] m3 = new int [m1.size()][m4[0].size()]
if(m1[0].size()==m4.size())
{
      
     for(i in 0..(m1.size()-1)){
          for(j in 0..(m4[0].size()-1)){
               int suma=0
               for(k in 0..(m4[0].size())){
                    suma+=m1[i][k]*m4[k][j]
               }
               m3[i][j]=suma
          }
     }
}
else
{
     println "diferente orden"
}
return m3
}

archivo.append("${imprimir(retor)} \n ${suma(retor,retor)} \n ${resta(retor,retor)} ")

