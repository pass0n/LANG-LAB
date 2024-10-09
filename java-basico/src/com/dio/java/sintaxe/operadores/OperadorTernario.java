package dio.java.sintaxe.operadores;

/**
 * O operador ternário é uma forma concisa de realizar uma operação condicional.
 * Ele é usado para simplificar a escrita de expressões condicionais que
 * retornam
 * um valor com base em uma condição.
 * 
 * A sintaxe do operador ternário é:
 * 
 * (condição) ? valorSeVerdadeiro : valorSeFalso;
 * 
 * Onde:
 * - **condição**: Uma expressão booleana que é avaliada.
 * - **valorSeVerdadeiro**: O valor retornado se a condição for verdadeira.
 * - **valorSeFalso**: O valor retornado se a condição for falsa.
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        String resultado = (a > b) ? "10 é maior que 5" : "10 não é maior que 5";
        System.out.println(resultado);

        int maiorNumero = (a > b) ? a : b;
        System.out.println("O maior número é: " + maiorNumero);

        // Exemplo com operador ternário e condição booleana
        boolean adulto = (a >= 18) ? true : false;
        System.out.println("É adulto? " + adulto);
    }
}