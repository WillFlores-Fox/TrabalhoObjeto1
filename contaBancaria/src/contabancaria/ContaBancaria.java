package contabancaria;

public class ContaBancaria {

    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(double saldo) {
        return this.saldo = saldo;
    }

    public void exibir() {
        System.out.println(this.titular);
        System.out.println(this.saldo);

    }

    public double depositar(double deposito) {
        double contaD = deposito + this.saldo;

        double resultado = this.saldo = contaD;
        System.out.println(resultado);
        return resultado;

    }

    public double resgatar(double saque) {

        if (saque > saldo) {
            System.out.println("Não tem dinheiro suficiente!");
        } else {
            double contaR = saldo - saque;
            System.out.println("Dinheiro resgatado com sucesso!! " + contaR);

            return saldo = contaR;
        }
        return this.saldo;
    }
}
