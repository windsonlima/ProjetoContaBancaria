import Entidades.Cliente;
import Entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();


        int numero = 1;
        int agencia = 1;
        double saldoCorrente = 0;
        double saldoPoupanca = 0;


        System.out.println("Para abertura de conta, favor cadastrar os dados do cliente");

        System.out.print("Digite o nome do cliente: ");
        cliente.nome = sc.nextLine();

        System.out.print("Para abertura da Conta Corrente digite um valor de depósito: ");
        double valor = sc.nextDouble();


        Conta conta = new Conta(agencia, numero, saldoCorrente, saldoPoupanca, valor);

        System.out.println("Parabéns pela abertura de conta");
        System.out.println("Nome do Cliente: " + cliente.nome);

        conta.saldoAtualCorrente(valor);
        System.out.println(conta);

        System.out.print("Quanto deseja sacar? ");
        valor = sc.nextDouble();
        conta.sacar(valor);

        System.out.println(conta);

        System.out.print("Qual valor para transferir? ");
        valor = sc.nextDouble();
        conta.saldoRetiradoCorrente(valor);
        conta.saldoAtualPoupanca(valor);

        System.out.println(conta);

        System.out.print("Quanto deseja depositar? ");
        valor = sc.nextDouble();
        conta.saldoAtualCorrente(valor);

        System.out.println(conta);
    }
}