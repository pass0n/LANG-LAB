package dio.java.sintaxe.repeticao;

public class RepeticaoDoWhile {
    public static void main(String[] args) {

        int contador = 0;
        boolean termino = false; // Adiciona uma variável para controlar o término do loop

        // O loop do-while garante que o bloco de código será executado pelo menos uma
        // vez.
        // A principal diferença entre 'do-while' e 'while' é que, no 'do-while',
        // o código é executado antes de verificar a condição de parada.
        do {
            // Incrementa a variável 'contador'
            contador++;

            // Verifica se o contador atingiu 6565 e atualiza a variável 'termino'
            if (contador == 6565) {
                termino = true;
            }

        } while (!termino); // O loop encerrara quando termino for dirente de false ou seja true;

        System.out.println("Número final: " + contador);
    }
}
