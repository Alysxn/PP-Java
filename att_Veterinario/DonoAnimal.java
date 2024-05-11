public class DonoAnimal {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean consulta = false;
    private boolean tratamento = false;


// Criando getters e setters da classe

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setConsulta(boolean consulta){
        this.consulta = consulta;
    }
    
    public void setTratamento(boolean tratamento){
        this.tratamento = tratamento;
    }

    public boolean getConsulta() {
        return consulta;
    }
    public boolean getTratamento() {
        return tratamento;
    }

    void imprimeFicha(){
        System.out.println("<< FICHA >>");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Consulta: " + consulta);
        System.out.println("Tratamento: " + tratamento);
    }

}
