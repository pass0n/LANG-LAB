package dio.java.desafios.ContaBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor, digite o número da Agência !");
            int numeroConta = input.nextInt();

            System.out.println("Por favor, digite o nome da Agência !");
            String nomeAgencia = input.next();

            System.out.println("Por favor, digite o nome do Cliente !");
            String nomeCliente = input.next();

            System.out.println("Por favor, digite o seu saldo !");
            double saldo = input.nextDouble();

            String mensagem = String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                    nomeCliente, nomeAgencia, numeroConta, saldo);

            System.out.println(mensagem);
        }
    }
}