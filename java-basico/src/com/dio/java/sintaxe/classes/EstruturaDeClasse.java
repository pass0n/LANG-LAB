package dio.java.sintaxe.classes;

/**
 * Classe de exemplo que segue a convenção de nomenclatura em Java,
 * onde a inicial do nome da classe deve ser maiúscula.
 * 
 * A classe deve ter o mesmo nome do arquivo `.java`.
 */
public class EstruturaDeClasse {

    /**
     * Método principal (main) que serve como ponto de entrada para a execução
     * da aplicação. Toda classe que inicializa um programa em Java precisa desse
     * método.
     * 
     * No método `main`, chamamos outros métodos e manipulamos variáveis
     * para controlar o fluxo da aplicação.
     */
    public static void main(String[] args) {
        // Implementação do programa será adicionada aqui.

        /**
         * Convenção de Nomenclatura
         * 
         * Constantes: Use UPPER_SNAKE_CASE. Exemplo: MAX_VALUE.
         * Variáveis Comuns: Use camelCase. Exemplo: variavelComum.
         * Nomes de Classe: Use PascalCase (inicial maiúscula e cada nova palavra também
         * iniciando com maiúscula). Exemplo: EstruturaDeClasseDemo.
         */

        String nomeDaLinguagem = "Java";
        String mensagemDeSaudacao = "Olá, ";

        /**
         * A variável 'saudacaoCompleta' armazena o resultado retornado pelo método
         * 'criarSaudacao'.
         * O método é chamado com dois argumentos: a mensagem de saudação
         * ('mensagemDeSaudacao') e o nome
         * da linguagem ('nomeDaLinguagem').
         */
        String saudacaoCompleta = criarSaudacao(mensagemDeSaudacao, nomeDaLinguagem);

        System.out.println(saudacaoCompleta + "!");
    }

    /**
     * Um método é um bloco de código que realiza uma tarefa específica.
     * Ele pode receber parâmetros (dados de entrada) e retornar um valor.
     * Métodos ajudam a organizar o código e reutilizar lógica.
     */
    public static String criarSaudacao(String saudacao, String nome) {
        return saudacao + nome;
    }
}
