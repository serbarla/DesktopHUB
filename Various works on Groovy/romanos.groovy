def digi3(int a){
if(a<=3)
'I'*a
else
if(a>3&&a<=5) 
'I'*(5%a)+'V'
else
if(a>5&&a<=8)
'V'+'I'*(a%5)
else 
if(a>8&&a<10)
'I'*(10%a)+'X'
}

def digi2(int a){
if(a<=3)
'X'*a
else
if(a>3&&a<=5) 
'X'*(5%a)+'L'
else
if(a>5&&a<=8)
'L'+'X'*(a%5)
else 
if(a>8&&a<10)
'X'*(10%a)+'C'
}

def digi1(int a){
if(a<=3)
'C'*a
else
if(a>3&&a<=5) 
'C'*(5%a)+'D'
else
if(a>5&&a<=8)
'D'+'C'*(a%5)
else 
if(a>8&&a<=10)
'C'*(10%a)+'M'
}
println "${digi1(0)}${digi2(0)}${digi3(1)}"// 1
println "${digi1(0)}${digi2(0)}${digi3(5)}"// 5
println "${digi1(0)}${digi2(1)}${digi3(0)}"// 10
println "${digi1(0)}${digi2(2)}${digi3(5)}"// 25
println "${digi1(0)}${digi2(5)}${digi3(0)}"// 50
println "${digi1(1)}${digi2(0)}${digi3(0)}"// 100
println "${digi1(3)}${digi2(4)}${digi3(1)}"// 341
println "${digi1(5)}${digi2(9)}${digi3(8)}"// 598
println "${digi1(7)}${digi2(1)}${digi3(3)}"// 713
println "${digi1(10)}${digi2(0)}${digi3(0)}"// 1000