package dio.java.poo.fundamentos;

//public
// Acesso: Qualquer classe, de qualquer pacote, pode acessar um membro public.
// Uso: Usado quando você quer que o atributo, método ou classe esteja acessível de qualquer lugar do código.

//private
// Acesso: Apenas a própria classe pode acessar um membro private. Nenhuma outra classe,mesmo dentro do mesmo pacote,pode acessá-lo.
// Uso: Usado para proteger os dados sensíveis ou detalhes de implementação,permitindo que o acesso seja controlado por meio de getters e setters,ou métodos internos da classe.

//protected
// Acesso: Classes no mesmo pacote podem acessar membros protected.
// Subclasses (mesmo que estejam em pacotes diferentes) também podem acessar membros protected.
// Uso: Usado quando você deseja permitir que subclasses ou classes dentro do mesmo pacote acessem um membro, mas proteger o membro de acesso público total.

public class Pessoa { // Aqui eu crio uma classe Pessoa

    private String id; // esses são seus atributos
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private String genero;

    // O construtor é um método especial usado para inicializar objetos de uma
    // classe. O principal objetivo do construtor é permitir que você crie objetos
    // com valores pré-definidos ou personalizados desde o momento da sua criação.

    // Construtor padrão da classe 'Pessoa'.
    public Pessoa() {
        super();
    }

    // Construtor com parâmetros, que permite definir valores iniciais ao criar um
    // objeto da classe 'Pessoa'.
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getters e setters
    // Controlam como os dados internos de uma classe são acessados e modificados.
    // Eles permitem validar dados e proteger a integridade dos campos de uma
    // classe.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}