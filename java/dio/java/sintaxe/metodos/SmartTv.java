package dio.java.sintaxe.metodos;

public class SmartTv {

    // Ela tenha as características: ligada (boolean), canal (int) e volume (int)
    boolean ligada = false;
    int canal = 0;
    int volume = 25;

    public void status() {
        System.out.println("\n-------------------STATUS DA TV-------------------");
        System.out.println("TV está ligada? " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("--------------------------------------------------\n");
    }

    // Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    public void ligarTv() {
        ligada = true;
        System.out.println("A TV foi ligada com sucesso!");
    }

    public void desligarTv() {
        ligada = false;
        System.out.println("A TV foi desligada com sucesso!");
    }

    // Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    // Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Alterado para o canal: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("A TV está no canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("A TV está no canal: " + canal);
    }

}