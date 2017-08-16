def divi(int i){
  if(i%2==0)
  return i/2

 return i+1
}

def recursivo= {num->
def cont=0
    while(num>1){
        cont++
        num=divi(num)
    }
return cont
}

println recursivo(6)