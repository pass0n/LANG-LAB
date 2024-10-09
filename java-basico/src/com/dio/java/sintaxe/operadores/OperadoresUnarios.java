package dio.java.sintaxe.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int contador = 10;

        // Operador unário de negação
        int valorNegativo = -contador; // Torna o valor de 'contador' negativo

        // Operador de incremento
        int incrementoAntes = ++contador; // Incrementa o valor antes de usar
        int incrementoDepois = contador++; // Usa o valor antes de incrementar

        // Operador de decremento
        int decrementoAntes = --contador; // Decrementa o valor antes de usar
        int decrementoDepois = contador--; // Usa o valor antes de decrementar

        // Operador unário NOT
        boolean ativo = true;
        boolean inativo = !ativo; // Inverte o valor booleano

        System.out.println("Valor inicial do contador: 10");
        System.out.println("Valor negativo: " + valorNegativo);
        System.out.println("Incremento antes de usar: " + incrementoAntes);
        System.out.println("Incremento depois de usar: " + incrementoDepois);
        System.out.println("Decremento antes de usar: " + decrementoAntes);
        System.out.println("Decremento depois de usar: " + decrementoDepois);
        System.out.println("Valor booleano invertido (NOT true): " + inativo);
    }
}
