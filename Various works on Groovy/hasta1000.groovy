def n=numero.toString()[0].toInteger()
println "${n} se convierte en ${convierte(n,1)}"
def convierte(num,pos){
def resultado=''
if(pos==1){
if((num+1)%5==0)
{
resultado='i'
if(num>5)resultado+='x';else resultado+='v'
}else{
if(num>5)
resultado='v'+'i'*(num-5)
else
resultado+='i'*num
}
resultado
}