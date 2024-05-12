public class Veterinario {
    private String nome;
    private String telefone;
    private String endereco;
    private String codigoVeterinario;
    private boolean responsavelConsulta = false;
    private boolean responsavelTratamento = false;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getcodigoVeterinario() {
        return codigoVeterinario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCodigoVeterinario(String codigoVeterinario) {
        this.codigoVeterinario = codigoVeterinario;
    }

    public void setConsulta(boolean responsavelConsulta) {
        this.responsavelConsulta = responsavelConsulta;
    }

    public void setTratamento(boolean responsavelTratamento) {
        this.responsavelTratamento = responsavelTratamento;
    }

    void imprimeFicha() {
        System.out.println("<< FICHA DO VETERINÁRIO >>");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número do Conselho: " + codigoVeterinario);
        if (responsavelConsulta == true) {
            System.out.println("Você será responsável pelas consultas.");
        } else if (responsavelTratamento == true) {
            System.out.println("Você será responsável pelos tratamentos.");
        }
    }

}
