package dio.java.sintaxe.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos são utilizados para combinar e avaliar duas ou mais
        // expressões booleanas.

        // Operador E lógico (AND) - Retorna true se ambas as condições forem
        // verdadeiras.
        // Se 'condicao1' for true e 'condicao2' for true, o resultado será true.
        // Caso contrário, o resultado será false.
        boolean resultadoE = condicao1 && condicao2; // false, pois 'condicao2' é falsa.
        System.out.println("condicao1 && condicao2: " + resultadoE);

        // Operador OU lógico (OR) - Retorna true se pelo menos uma das condições for
        // verdadeira.
        // Se 'condicao1' for true OU 'condicao2' for true, o resultado será true.
        // O resultado será false apenas se ambas as condições forem falsas.
        boolean resultadoOU = condicao1 || condicao2; // true, pois 'condicao1' é verdadeira.
        System.out.println("condicao1 || condicao2: " + resultadoOU);

        // Operador OU exclusivo (XOR) - Retorna true se apenas uma das condições for
        // verdadeira, mas não ambas.
        // Se uma condição for true e a outra for false, o resultado será true.
        // Se ambas forem true ou ambas forem false, o resultado será false.
        boolean resultadoXOR = condicao1 ^ condicao2; // true, pois apenas 'condicao1' é verdadeira.
        System.out.println("condicao1 ^ condicao2: " + resultadoXOR);

        // Exemplo prático usando operadores lógicos com comparações numéricas:

        int idade = 25; // Variável que armazena a idade de uma pessoa.

        // Verifica se a pessoa é maior de idade (idade >= 18).
        boolean maiorDeIdade = idade >= 18; // true, pois a idade é 25.

        // Verifica se a pessoa tem menos de 60 anos (idade < 60).
        boolean menorQue60 = idade < 60; // true, pois a idade é 25.

        // Usa o operador E (AND) para verificar se a pessoa é maior de idade e tem
        // menos de 60 anos.
        // Ambas as condições são verdadeiras, então o resultado será true.
        boolean resultadoMaioridade = maiorDeIdade && menorQue60; // true.
        System.out.println("idade >= 18 && idade < 60: " + resultadoMaioridade);
    }
}