package dio.java.poo.pilares;

public class Encapsulamento extends Abstracao {
    /*
     * Encapsulamento é o princípio de esconder a complexidade de certos processos
     * dentro de uma classe, expondo apenas o que é necessário para o uso de suas
     * funcionalidades. No exemplo abaixo, o método público "acessarInternet"
     * encapsula o processo necessário para atingir o objetivo final, que é acessar
     * a internet. Esse processo envolve várias etapas internas que são
     * abstraídas para o usuário, como ligar o computador e acessar o navegador,
     * mas essas etapas são mantidas privadas para que o usuário interaja apenas
     * com o método principal.
     * 
     * Objetivo: acessar a internet
     * 
     * Etapas internas (encapsuladas):
     * - Ligar o computador
     * - Acessar o navegador
     * - Inserir o URL no navegador
     */
    public void acessarInternet() {
        ligarComputador();
        acessarNavegador();
        inserirURL();
        navegador("CHROME");
    }

    private void ligarComputador() {
        boolean ligado = false;
        boolean pressionarBotaoLigar = true;

        do {
            System.out.println("Computador ligando...");
            if (pressionarBotaoLigar) {
                ligado = true;
                System.out.println("Computador ligado com sucesso!");
            }
        } while (!ligado);
    }

    private void acessarNavegador() {
        boolean clicarBotaoNavegador = true;

        if (clicarBotaoNavegador) {
            System.out.println("Acessando o navegador...");
        }
    }

    private void inserirURL() {

        System.out.format("Inserindo o URL...");
    }
}
