//imprimir la tablas de verdad de AND

def a=[0,1]
def b=[0,1]

def and(int a, int b)
{
if(a==1&&b==1)
return 1
else
return 0
}

def or(int a, int b)
{
if(a==0&&b==0)
return 0
else
return 1
}

def xor(int a, int b)
{
if(a==b)
return 0
else
return 1
}


println "A  B | A and B"
println "-"*14

for(i in (0..1)){
    for(j in (0..1)){
        println "${a[i]}  ${b[j]} |   ${and(a[i],b[j])}"
    }
}

println "\n\nA  B | A or B"
println "-"*14
for(i in (0..1)){
    for(j in (0..1)){
        println "${a[i]}  ${b[j]} |   ${or(a[i],b[j])}"
    }
}

println "\n\nA  B | A xor B"
println "-"*14
for(i in (0..1)){
    for(j in (0..1)){
        println "${a[i]}  ${b[j]} |   ${xor(a[i],b[j])}"
    }
}