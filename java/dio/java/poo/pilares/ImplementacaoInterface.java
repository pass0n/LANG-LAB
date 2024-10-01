package dio.java.poo.pilares;

// implementao os contrator da interfcae
public class ImplementacaoInterface implements Interface {

    @Override
    public void atualizar() {
        System.out.println("APAGADO");
    }

    @Override
    public void copiar() {
        System.out.println("COPIADO");
    }

    @Override
    public void deletar() {

    }

    public void deletar(int parametro) {
        if (parametro == 0) {
            System.out.println("Não deletado");
        } else {
            System.out.println("DELETADO");
        }
    }

}
