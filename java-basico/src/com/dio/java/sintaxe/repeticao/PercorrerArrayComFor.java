package dio.java.sintaxe.repeticao;

public class PercorrerArrayComFor {
    public static void main(String[] args) {

        String[] nomes = { "Array0", "Array1", "Array2", "Array3", "Array4" };

        // for (int i = 0; i < nomes.length; i++) {
        // System.out.println(nomes[i]);
        // }

        // forma abreviada
        for (String indice : nomes) {

            // nomes[0] = indice
            //nomes[1] = indice
            System.out.println(indice);
        }
        System.out.println("Tamanho do Array é: " + nomes.length);
    }
}
