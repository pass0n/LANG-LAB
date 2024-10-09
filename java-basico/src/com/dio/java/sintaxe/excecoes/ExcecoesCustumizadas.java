package dio.java.sintaxe.excecoes;

import java.util.Scanner;
import java.util.Locale;

public class ExcecoesCustumizadas {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Informe seu nome: ");
            String nome = input.nextLine();
            validarNome(nome);

            System.out.println("Informe seu sobrenome: ");
            String sobrenome = input.nextLine();
            validarNome(sobrenome);

            System.out.println("Informe sua idade: ");
            int idade = input.nextInt();

            System.out.println("Informe sua altura: ");
            double altura = input.nextDouble();

            System.out.printf("Nome: %s %s, Idade: %d, Altura: %.2f\n", nome, sobrenome, idade, altura);

            input.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Use apenas caracteres numéricos, se for decimal use (ponto .) em vez de (vírgula ,).");
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método que valida o nome e lança a exceção customizada
    public static void validarNome(String nome) throws NomeInvalidoException {
        if (!nome.matches("[a-zA-Z]+")) {
            throw new NomeInvalidoException("O nome '" + nome + "' é inválido. Deve conter apenas letras.");
        }
    }
}
