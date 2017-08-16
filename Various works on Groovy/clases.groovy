class Monomio{
int signo
String variable
double coeficiente
int potencia
    public Monomio(int signo, String variable, double coeficiente, int potencia)
    {
        this.signo=signo
        this.variable=variable
        this.coeficiente=coeficiente
        this.portencia=potencia
    }
    public String imprime()
    {
    return "${signo}${coeficiente}${variable}^${potencia}"
    }
}