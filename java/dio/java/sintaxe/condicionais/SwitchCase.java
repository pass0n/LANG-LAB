package dio.java.sintaxe.condicionais;

public class SwitchCase {
    public static void main(String[] args) {
        String tamanho = "A";

        switch (tamanho) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default: {
                System.out.println("Tamanha indefinido!");
                break;
            }
        }
    }
}
