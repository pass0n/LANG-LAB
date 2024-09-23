package dio.java.sintaxe.repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 5; contador++) {

            if (contador == 2) {
                continue; // O 'continue' faz com que o laço pule diretamente para a próxima iteração,
                          // ou seja, ignora o código abaixo dele e reinicia o loop no próximo valor.
            }
            if (contador == 4) {
                break; // O 'break' interrompe a execução do laço imediatamente,
                       // ou seja, o loop é encerrado antes de completar todas as iterações.
            }
            System.out.println(contador);
        }
    }
}
