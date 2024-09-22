package dio.java.sintaxe.constantes;

public class VariaveisEConstantes {

    public static void main(String[] args) {

        // Constantes são declaradas usando 'final' e são geralmente escritas em
        // maiúsculas
        final double PI = 3.14;

        // As variáveis podem ter seus valores alterados durante a execução do programa
        int idadeDoUsuario = 10;

        // Exibindo valores das variáveis e constantes
        System.out.println("Idade do Usuário: " + idadeDoUsuario);
        System.out.println("PI: " + PI);

        // Atualizando o valor da variável 'idadeDoUsuario'
        idadeDoUsuario = 25;
        System.out.println("Idade do Usuário: " + idadeDoUsuario);
    }
}
