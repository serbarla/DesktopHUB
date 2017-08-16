class Monomio{
 Integer signo
 String variable
 Double coef
 Integer expo
 
 Monomio(signo, variable, coef, expo){
  this.signo=signo
  this.variable=variable
  this.coef=coef
  this.expo=expo
 }
 
 def Monomio(){
  signo= 1
  variable='x'
  coef=1
  expo=0
 }
 
 double evaluar(val){
  signo*(coef * (val ** expo))
 }
 
 String toString(){
  "${this.signo}${this.coef}${this.variable}^${this.expo}"
 }
 }