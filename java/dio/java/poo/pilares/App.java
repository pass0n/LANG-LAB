package dio.java.poo.pilares;

public class App {
    public static void main(String[] args) {

        /**
         * Esta classe demonstra os quatro pilares da Programação Orientada a Objetos
         * (POO):
         * 
         * 1. Abstração: Uma classe base que fornece um modelo para as classes
         * derivadas.
         * 2. Encapsulamento: Herda da Abstração, encapsulando dados e métodos.
         * 3. Herança: Uma classe que herda da classe Encapsulamento, demonstrando a
         * funcionalidade de herança.
         * 4. Polimorfismo: Uma classe que herda da Herança e substitui um método para
         * mostrar o comportamento polimórfico.
         */

        Encapsulamento computadorEncapsulado = new Encapsulamento();
        computadorEncapsulado.acessarInternet(); // Acessar a internet usando Encapsulamento

        Heranca computadorHerdado = new Heranca();
        computadorHerdado.acessarInternet(); // Acessar a internet usando Herança

        Polimorfismo computadorPolimorfico = new Polimorfismo();
        computadorPolimorfico.acessarInternet(); // Acessar a internet usando Polimorfismo

        ImplementacaoInterface im = new ImplementacaoInterface();
        im.atualizar();
        im.copiar();
        im.deletar();
        im.deletar(0);

        
    }
}
