package dio.java.poo.fundamentos;

public class Instancia {

    public static void main(String[] args) {

        // Aqui está sendo criado um objeto do tipo 'Pessoa' chamado 'mario'.
        // Um objeto é uma instância de uma classe, que é uma representação concreta na
        // memória.
        // A classe 'Pessoa' serve como um molde para criar objetos, e o objeto 'mario'
        // é uma cópia desse molde.
        Pessoa mario = new Pessoa();

        // Utilizando os métodos 'set' (setters) para atribuir valores aos atributos do
        // objeto.
        mario.setId("ABC-1232");
        mario.setNome("Mario Jośe Pinto Alves");
        mario.setAltura(1.75);
        mario.setIdade(32);
        mario.setGenero("Masculino");

        // Usando os métodos 'get' (getters) para acessar os valores dos atributos que
        // definimos acima.
        System.out.format("%s, tem %d anos, %.2fm e é do genero %s.%n",
                mario.getNome(),
                mario.getIdade(),
                mario.getAltura(),
                mario.getGenero());

        // Criando o objeto 'jose' com os valores já pré-definidos, utilizando o
        // construtor da classe 'Pessoa'.
        Pessoa jose = new Pessoa("José", "Pinto Gomes");

        System.out.println(jose.getNome() + " " + jose.getSobrenome());

        // Instanciando o enum com o valor 'ESPIRITO_SANTO'.
        EnumBrasil es = EnumBrasil.ESPIRITO_SANTO;
        System.out.println(es.getNome() + " - " + es.getSigla());
    }
}