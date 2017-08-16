def obs = new Random()
def obs2 = new Random()


def obstaculo (probabilidad) {
    probabilidad.nextInt()
}

def corredor1 = Thread.start{
sleep 1000
 for (i in 0..10){
    if(obstaculo(obs)%3==0){
        println "Para 1"
        sleep 3000
    }
    else{
        println "Avanza 1"
        sleep 500
    }  
      if (i==10)
  println "HA LLEGADO 1!!!"
  }
}

def corredor2 = Thread.start{
sleep 1000
 for(j in  0..10){
    if(obstaculo(obs2)%3==0){
        println "\t\tPara 2"
        sleep 3000
    }
    else{
        println "\t\tAvanza 2"
        sleep 500
    }
    if(j==10)
 println "\t\tHA LLEGADO 2!!!"
 }
}

corredor1.join()
corredor2.join()