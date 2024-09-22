package dio.java.sintaxe.terminal;

/**
 * Esta classe demonstra como passar argumentos pela linha de comando
 * e como utilizá-los em um programa Java.
 *
 * Para executar este programa:
 * 1. Navegue até o diretório "src" do projeto:
 * cd /caminho/para/seu_projeto/src
 * 
 * 2. Compile a classe utilizando o comando:
 * javac edu/java/sintaxe/terminal/ApresentacaoPessoal.java
 *
 * 3. Execute o programa, passando os argumentos (ex: Nome Sobrenome 23 1.98):
 * java edu.java.sintaxe.terminal.ApresentacaoPessoal Nome Sobrenome 23 1.98
 *
 * Argumentos esperados:
 * - args[0]: Primeiro nome (String)
 * - args[1]: Sobrenome (String)
 * - args[2]: Idade (int)
 * - args[3]: Altura (double)
 */
public class DemonstracaoArgumentos {
    public static void main(String[] args) {

        // Os argumentos são passados pela linha de comando, começando no índice 0
        String primeiroNome = args[0];
        String ultimoNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        // Exibe as informações recebidas
        System.out.println("Olá, me chamo " + primeiroNome + " " + ultimoNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
