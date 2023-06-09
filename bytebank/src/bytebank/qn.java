//assumindo que esse método está dentro da classe Conta que possui os atributos 
public void saca(double valor) {

    if(saldo >= valor) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }
}