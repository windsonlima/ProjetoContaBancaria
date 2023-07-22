package Entidades;


public class Conta {

    protected int agencia;
    protected int numero;
    protected double saldoCorrente;
    protected double saldoPoupanca;
    public double valor;


    public Conta(int agencia, int numero, double saldoCorrente, double saldoPoupanca, double valor) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldoCorrente = saldoCorrente;
        this.saldoPoupanca = saldoPoupanca;
        this.valor = valor;
    }

    public void numeroConta() {

        this.numero += 1;
    }

    public void saldoAtualCorrente(double valor) {

        this.saldoCorrente += valor;
    }

    public void saldoAtualPoupanca(double valor) {

        this.saldoPoupanca += valor;
    }
    public void saldoRetiradoCorrente(double valor) {

        this.saldoCorrente -= valor;
    }


    public void sacar(double valor) {

        this.saldoCorrente -= valor;
    }

    public void depositar(double valor) {

        this.saldoCorrente += valor;
    }


    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldoCorrente;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    @Override
    public String toString() {
        return "agencia: " + agencia +
                ", Conta: " + numero +
                ", " +
                String.format(" saldo Conta Corrente: %.2f", saldoCorrente) +
                String.format(" saldo Conta Poupança: %.2f", saldoPoupanca);
    }
}
