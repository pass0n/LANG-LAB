package dio.java.poo.pilares;

public class Polimorfismo extends Heranca {

    /*
     * O polimorfismo permite que objetos de diferentes classes relacionadas
     * implementem o mesmo método de maneiras distintas. No exemplo abaixo,
     * o método acessarInternet() é definido na classe Encapsulamento e 
     * é herdado pela classe Heranca, sem alteração. Na classe Polimorfismo, 
     * o método é sobrescrito, alterando o comportamento original. 
     * Isso demonstra como o polimorfismo permite que o mesmo método tenha 
     * implementações diferentes dependendo da classe à qual o objeto pertence.
     */
    
    @Override
    public void acessarInternet() {
        System.out.println("\nPolimorfismo alterando o valor!!");
        navegador("FIREFOX");
    }
}
