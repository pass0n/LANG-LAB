package dio.java.sintaxe.repeticao;

public class RepeticaoWhile {
    public static void main(String[] args) {

        boolean contador = true;
        int numero = 0;

        // Loop while que executa enquanto 'contador' for true
        while (contador) {
            // Incrementa o valor de 'numero' em 1 a cada iteração
            numero++;

            // Verifica se 'numero' é maior ou igual a 6565
            // Se for, a variável 'contador' é alterada para false, interrompendo o loop
            if (numero == 6565) {
                contador = false;
            }
        }
        System.out.println("Número final é : " + numero);
    }
}