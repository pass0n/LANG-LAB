package dio.java.sintaxe.metodos;

public class DemonstracaoMetodos {
    public static void main(String[] args) {

        /**
         * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
         * 
         * Ela tenha as características: ligada (boolean), canal (int) e volume (int)
         * Nossa TV poderá ligar e desligar e assim mudar o estado ligada
         * Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
         * Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
         */
        SmartTv minhaTv = new SmartTv();

        minhaTv.ligarTv();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();
        minhaTv.aumentarCanal();
        minhaTv.diminuirCanal();
        minhaTv.mudarCanal(22);
        minhaTv.status();
        minhaTv.desligarTv();
    }
}
