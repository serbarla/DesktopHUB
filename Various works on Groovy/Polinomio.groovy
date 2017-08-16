class Polinomio
{
String signo
int variable
String coeficiente
int potencia

public Polinomio(signo,variable,coeficiente,potencia)
{
this.signo=signo
this.variable=variable
this.coeficiente=coeficiente
this.potencia=potencia
}

def imprimir()
{
    return "${signo}${variable}${coeficiente}^${potencia}"
}

}