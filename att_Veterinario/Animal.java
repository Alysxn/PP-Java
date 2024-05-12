public class Animal {

    private String nome;
    private String sexo;
    private int idade;
    private String especie;

    // Criando getters e setters da classe.

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    void iniciaTratamento(){
        System.out.println("O tratamento do " + nome + " será iniciado.");
    }
    void iniciaConsulta(){
        System.out.println("A consulta do " + nome + " será iniciada.");
    }

    void imprimeFicha() {
        System.out.println("<< FICHA DO PET >>");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Espécie: " + especie);
    }

}
