package dio.java.sintaxe.tipos;

/**
 * Esta classe demonstra o uso de tipos primitivos em Java.
 * 
 * Tipos primitivos são os tipos de dados básicos fornecidos pela linguagem
 * Java. Eles são armazenados diretamente na memória e não são objetos.
 * Java possui 8 tipos primitivos:
 * 
 * 1. **byte**: Um número inteiro de 8 bits (intervalo de -128 a 127).
 * 2. **short**: Um número inteiro de 16 bits (intervalo de -32.768 a 32.767).
 * 3. **int**: Um número inteiro de 32 bits (intervalo de -2^31 a 2^31-1).
 * 4. **long**: Um número inteiro de 64 bits (intervalo de -2^63 a 2^63-1).
 * 5. **float**: Um número de ponto flutuante de precisão simples de 32 bits.
 * 6. **double**: Um número de ponto flutuante de precisão dupla de 64 bits.
 * 7. **char**: Um caractere de 16 bits, usado para representar caracteres
 * Unicode.
 * 8. **boolean**: Representa dois valores possíveis: true ou false.
 * 
 * Ao contrário dos objetos, os tipos primitivos são armazenados diretamente
 * nas variáveis, o que torna o acesso mais rápido. Eles são utilizados
 * principalmente para dados simples, como números e valores booleanos.
 */
public class TiposDeDadosPrimitivos {
    public static void main(String[] args) {

        int numero = 42;
        long numeroGrande = 10000000000L; // O 'L' é necessário para indicar que o número é do tipo 'long'
        float valorDecimalPequeno = 5.75F; // O 'F' é necessário para indicar que o número é do tipo 'float'
        double valorDecimal = 3.14;
        boolean ehVerdadeiro = true;
        char letra = 'A';

        System.out.println("Número: " + numero);
        System.out.println("Número Grande (long): " + numeroGrande);
        System.out.println("Valor Decimal Pequeno (float): " + valorDecimalPequeno);   
        System.out.println("Valor Decimal: " + valorDecimal);
        System.out.println("Verdadeiro: " + ehVerdadeiro);
        System.out.println("Letra: " + letra);
    }
}
