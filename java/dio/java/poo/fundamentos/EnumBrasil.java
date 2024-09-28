package dio.java.poo.fundamentos;

// Enum é uma lista de  objeto com valores  pré-definidos.
public enum EnumBrasil {

  // esses são os objetos criados com o contrutor
  ESPIRITO_SANTO("ES", "Espírito Santo"),
  SAO_PAULO("SP", "São Paulo"),
  RIO_DE_JANEIRO("RJ", "Rio de Janeiro");

  // atributos
  private String sigla;
  private String nome;

  // o contrutor
  private EnumBrasil(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  };

  // métodos get
  public String getSigla() {
    return sigla;
  }

  public String getNome() {
    return nome;
  }

}
