package dio.java.poo.pilares;

/*
 * Classes abstratas em Java servem como modelos ou contratos que outras classes 
 * devem seguir. Uma classe abstrata pode conter métodos abstratos, que são métodos 
 * sem corpo, ou seja, sem implementação. Esses métodos definem "o que" deve ser feito, 
 * mas deixam para as subclasses a responsabilidade de decidir "como" isso será feito.
 * 
 * Por exemplo, a classe abstrata `Abstracao` abaixo define dois métodos abstratos: 
 * `andar()` e `pular()`. Qualquer classe que herde de `Abstracao` será obrigada a fornecer
 * sua própria implementação desses métodos, seguindo o princípio do polimorfismo.
 */

public abstract class Abstracao {
    // Método abstrato: as subclasses devem fornecer a implementação específica.
    public abstract void acessarInternet();

    /*
     * O modificador de acesso `protected` permite que o método seja acessado por
     * qualquer classe no mesmo pacote ou por classes que herdem de `Abstracao`.
     * Ou seja, todas as subclasses de `Abstracao` podem utilizar o método
     * `navegador`.
     */
    protected void navegador(String navegador) {
        System.out.format("Navegador usado foi %s.\n", navegador);
    };
}
