package dio.java.sintaxe.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 20;

        // Operadores relacionais são usados para comparar valores.
        // Eles retornam um valor booleano (true ou false) baseado na comparação.

        boolean igual = numero1 == numero2; // Verifica se 'numero1' é igual a 'numero2'.
        boolean diferente = numero1 != numero2; // Verifica se 'numero1' é diferente de 'numero2'.
        boolean maiorQue = numero1 > numero2; // Verifica se 'numero1' é maior que 'numero2'.
        boolean menorQue = numero1 < numero2; // Verifica se 'numero1' é menor que 'numero2'.
        boolean maiorOuIgual = numero1 >= numero2; // Verifica se 'numero1' é maior ou igual a 'numero2'.
        boolean menorOuIgual = numero1 <= numero2; // Verifica se 'numero1' é menor ou igual a 'numero2'.

        System.out.println(numero1 + " == " + numero2 + ": " + igual);
        System.out.println(numero1 + " != " + numero2 + ": " + diferente);
        System.out.println(numero1 + " > " + numero2 + ": " + maiorQue);
        System.out.println(numero1 + " < " + numero2 + ": " + menorQue);
        System.out.println(numero1 + " >= " + numero2 + ": " + maiorOuIgual);
        System.out.println(numero1 + " <= " + numero2 + ": " + menorOuIgual);

        // Comparação de objetos usando a classe String
        String texto1 = "Java";
        String texto2 = new String("Java");

        // 'texto1' é uma string literal e 'texto2' é uma nova instância criada com
        // 'new'.
        // Portanto, 'texto1' e 'texto2' não referenciam o mesmo objeto, e o resultado é
        // false.
        System.out.println(texto1 == texto2);

        // Ambos contêm a mesma sequência de caracteres ("Java"), então o resultado é
        // true.
        // O método .equals() é usado para comparar o conteúdo das strings, não as
        // referências.
        System.out.println(texto1.equals(texto2));
    }
}
