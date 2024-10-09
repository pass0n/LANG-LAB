package dio.java.sintaxe.condicionais;

public class CondificionalSimples {
    public static void main(String[] args) {

        double saldo = 156.62;
        double valorSolicitado = 287.34;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        }
        System.out.println("O seu saldo é de: " + saldo + "R$.");
    }
}