package dio.java.sintaxe.excecoes;

import java.util.Scanner;
import java.util.Locale;

public class ExemploTryCatch {
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Informe seu nome: ");
            input.next();

            System.out.println("Informe seu sobrenome: ");
            input.next();

            System.out.println("Informe sua idade: ");
            input.nextInt();

            System.out.println("Informe sua altura: ");
            input.nextDouble();

            input.close();
            System.out.println("Cadastro realizado com sucesso!");
        } catch (java.util.InputMismatchException e) {

            System.out.println("Use apenas caracteres numéricos, se for decimal use (ponto .) em vez de (vírgula ,).");
        }
    }
}
